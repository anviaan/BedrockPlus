package net.anvian.bedrockplus;

import fuzs.forgeconfigapiport.fabric.api.forge.v4.ForgeConfigRegistry;
import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.anvian.bedrockplus.core.registry.ModWorldRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraftforge.fml.config.ModConfig;

public class FabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Fabric)");
        CommonMod.init();

        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.SERVER, ModConfigs.SPEC, Constants.MOD_ID + "-config.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FabricLoader.getInstance().getConfigDir().resolve(Constants.MOD_ID + "-config.toml"));

        ModBlockRegistry.registerBlocks();
        ModItemRegistry.registerItems();
        ModTab.registerTab();

        ModWorldRegistry.register();
    }
}
