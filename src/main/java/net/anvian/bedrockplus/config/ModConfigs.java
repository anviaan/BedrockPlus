package net.anvian.bedrockplus.config;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.FileUtils;

public class ModConfigs {
    public static void registerConfig(){
        FileUtils.getOrCreateDirectory(FMLPaths.CONFIGDIR.get().resolve("BedrockPlusMod"), "BedrockPlusMod");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BedrockPlusConfig.config, "BedrockPlusMod/bedrock-plus-defaulconfig.toml");
        BedrockPlusConfig.loadConfig(BedrockPlusConfig.config, FMLPaths.CONFIGDIR.get().resolve("BedrockPlusMod/bedrock-plus-config.toml").toString());
    }
}