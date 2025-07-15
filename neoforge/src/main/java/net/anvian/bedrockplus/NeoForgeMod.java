package net.anvian.bedrockplus;

import fuzs.forgeconfigapiport.neoforge.api.v5.ForgeConfigRegistry;
import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLPaths;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {
    public NeoForgeMod(IEventBus eventBus) {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Neoforge)");
        CommonMod.init();

        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.SERVER, ModConfigs.SPEC, Constants.MOD_ID + "/" + Constants.MOD_ID + "-config.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve(Constants.MOD_ID).resolve(Constants.MOD_ID + "-config.toml"));

        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
        ModTab.TABS.register(eventBus);
    }
}