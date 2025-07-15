package net.anvian.bedrockplus;

import net.anvian.anvianslib.util.LibUtil;

public class CommonMod {
    public static void init() {
        Constants.LOG.info("Initializing {} version {}", Constants.MOD_NAME, Constants.MOD_VERSION);
        LibUtil.setupTelemetry(Constants.MOD_ID, Constants.MOD_VERSION);
    }
}