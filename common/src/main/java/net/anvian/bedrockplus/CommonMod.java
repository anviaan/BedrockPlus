package net.anvian.bedrockplus;

import net.anvian.anvianslib.platform.Services;
import net.anvian.anvianslib.util.LibUtil;
import net.anvian.bedrockplus.core.config.ModConfigs;

import java.nio.file.Path;

public class CommonMod {
    public static ModConfigs configs = new ModConfigs(ModConfigs.BedrockPlusConfig.class, Constants.LOG);

    public static void init() {
        Constants.LOG.info("Initializing {} version {}", Constants.MOD_NAME, Constants.MOD_VERSION);
        Path configDirectory = Services.PLATFORM.getConfigPath().resolve(Constants.MOD_ID);
        configs.initialize(configDirectory.toFile(), Constants.MOD_ID);
        LibUtil.setupTelemetry(Constants.MOD_ID, Constants.MOD_VERSION);
    }
}
