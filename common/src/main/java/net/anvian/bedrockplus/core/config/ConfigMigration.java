package net.anvian.bedrockplus.core.config;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class ConfigMigration {
    private static final Gson GSON = new Gson();

    private ConfigMigration() {
    }

    static <T> Migration<T> migrate(File configFile, Class<T> configClass, Logger logger) {
        if (configFile == null || configFile.exists()) {
            return null;
        }

        List<Path> legacyFiles = findLegacyFiles(configFile);
        if (legacyFiles.isEmpty()) {
            return null;
        }

        T config = createDefault(configClass, logger);
        if (config == null) {
            return null;
        }

        for (Path legacyFile : legacyFiles) {
            readLegacyFile(legacyFile, config, configClass, logger);
        }

        return new Migration<>(config, legacyFiles);
    }

    static boolean backupIfInvalidJson(File configFile, Class<?> configClass, Logger logger) {
        if (configFile == null || !configFile.exists()) {
            return false;
        }

        try (var reader = Files.newBufferedReader(configFile.toPath(), StandardCharsets.UTF_8)) {
            if (GSON.fromJson(reader, configClass) != null) {
                return false;
            }
        } catch (IOException | JsonParseException | IllegalStateException exception) {
            // The file is moved below and replaced by the config manager.
        }

        return backup(configFile.toPath(), ".broken.json", logger);
    }

    static void backupLegacyFiles(List<Path> legacyFiles, Logger logger) {
        for (Path legacyFile : legacyFiles) {
            backup(legacyFile, ".legacy.bak", logger);
        }
    }

    private static List<Path> findLegacyFiles(File configFile) {
        List<Path> files = new ArrayList<>();
        Path configDirectory = configFile.toPath().getParent();
        if (configDirectory == null) {
            return files;
        }

        Path rootConfigDirectory = configDirectory.getParent();
        if (rootConfigDirectory != null) {
            addIfPresent(files, rootConfigDirectory.resolve("bedrockplus-config.toml"));
        }
        addIfPresent(files, configDirectory.resolve("bedrockplus-config.toml"));
        return files;
    }

    private static void addIfPresent(List<Path> files, Path path) {
        if (Files.isRegularFile(path)) {
            files.add(path);
        }
    }

    private static <T> T createDefault(Class<T> configClass, Logger logger) {
        try {
            Constructor<T> constructor = configClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (ReflectiveOperationException exception) {
            logger.error("Unable to create configuration defaults", exception);
            return null;
        }
    }

    private static <T> void readLegacyFile(Path file, T config, Class<T> configClass, Logger logger) {
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                applyLine(line, config, configClass, logger);
            }
        } catch (IOException exception) {
            logger.error("Unable to migrate legacy configuration {}", file, exception);
        }
    }

    private static <T> void applyLine(String line, T config, Class<T> configClass, Logger logger) {
        int separator = line.indexOf('=');
        if (separator < 0) {
            return;
        }

        String key = line.substring(0, separator).trim();
        if (key.isEmpty() || key.startsWith("[")) {
            return;
        }

        String value = stripComment(line.substring(separator + 1).trim());
        value = stripQuotes(value);
        String normalizedKey = normalize(key);

        for (Field field : configClass.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) ||
                    !normalize(field.getName()).equals(normalizedKey)) {
                continue;
            }

            try {
                field.set(config, parseValue(value, field.getType()));
            } catch (IllegalAccessException | IllegalArgumentException exception) {
                logger.warn("Ignoring invalid legacy value {}={}", key, value);
            }
            return;
        }
    }

    private static Object parseValue(String value, Class<?> type) {
        if (type == int.class || type == Integer.class) {
            return Integer.parseInt(value);
        }
        if (type == double.class || type == Double.class) {
            return Double.parseDouble(value);
        }
        if (type == float.class || type == Float.class) {
            return Float.parseFloat(value);
        }
        if (type == boolean.class || type == Boolean.class) {
            if (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false")) {
                throw new IllegalArgumentException("Expected boolean");
            }
            return Boolean.parseBoolean(value);
        }
        throw new IllegalArgumentException("Unsupported config type");
    }

    private static String stripComment(String value) {
        boolean quoted = false;
        for (int index = 0; index < value.length(); index++) {
            char character = value.charAt(index);
            if (character == '"') {
                quoted = !quoted;
            } else if (character == '#' && !quoted) {
                return value.substring(0, index).trim();
            }
        }
        return value;
    }

    private static String stripQuotes(String value) {
        if (value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"")) {
            return value.substring(1, value.length() - 1);
        }
        return value;
    }

    private static String normalize(String value) {
        return value.replace("\"", "")
                .replace("_", "")
                .replace("-", "")
                .toLowerCase(Locale.ROOT);
    }

    private static boolean backup(Path source, String suffix, Logger logger) {
        try {
            Path target = source.resolveSibling(source.getFileName() + suffix);
            int counter = 1;
            while (Files.exists(target)) {
                target = source.resolveSibling(source.getFileName() + suffix + "." + counter++);
            }
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
            logger.info("Backed up configuration {} to {}", source, target);
            return true;
        } catch (IOException | UnsupportedOperationException exception) {
            try {
                Path target = source.resolveSibling(source.getFileName() + suffix);
                int counter = 1;
                while (Files.exists(target)) {
                    target = source.resolveSibling(source.getFileName() + suffix + "." + counter++);
                }
                Files.move(source, target);
                logger.info("Backed up configuration {} to {}", source, target);
                return true;
            } catch (IOException fallbackException) {
                logger.error("Unable to back up configuration {}", source, fallbackException);
                return false;
            }
        }
    }

    static final class Migration<T> {
        private final T config;
        private final List<Path> legacyFiles;

        private Migration(T config, List<Path> legacyFiles) {
            this.config = config;
            this.legacyFiles = legacyFiles;
        }

        T config() {
            return config;
        }

        List<Path> legacyFiles() {
            return legacyFiles;
        }
    }
}
