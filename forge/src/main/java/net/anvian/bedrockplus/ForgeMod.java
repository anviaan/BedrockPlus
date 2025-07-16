package net.anvian.bedrockplus;

import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(Constants.MOD_ID)
public class ForgeMod {
    public ForgeMod(FMLJavaModLoadingContext context) {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Forge)");
        CommonMod.init();

        var modBusGroup = context.getModBusGroup();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ModConfigs.SPEC, Constants.MOD_ID + "/" + Constants.MOD_ID + "-config.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve(Constants.MOD_ID).resolve(Constants.MOD_ID + "-config.toml"));

        ModTab.CREATIVE_MODE_TAB.register(modBusGroup);
        ModBlockRegistry.BLOCKS.register(modBusGroup);
        ModItemRegistry.ITEMS.register(modBusGroup);
    }
}