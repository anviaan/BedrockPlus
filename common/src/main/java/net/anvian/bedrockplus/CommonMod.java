package net.anvian.bedrockplus;

import net.anvian.anvianslib.util.LibUtil;
import net.anvian.bedrockplus.core.config.ModConfigs;

import java.nio.file.Path;

public class CommonMod {
    public static final ModConfigs configs = new ModConfigs(ModConfigs.BedrockPlusConfig.class, Constants.LOG);

    public static void init(Path configDirectory) {
        Constants.LOG.info("Initializing {} version {}", Constants.MOD_NAME, Constants.MOD_VERSION);
        configs.initialize(configDirectory.toFile(), Constants.MOD_ID);
        LibUtil.setupTelemetry(Constants.MOD_ID, Constants.MOD_VERSION);
    }
}
