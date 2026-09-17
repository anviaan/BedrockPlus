package net.anvian.bedrockplus;

import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(Constants.MOD_ID)
public class ForgeMod {
    public ForgeMod() {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Forge)");
        CommonMod.init(FMLPaths.CONFIGDIR.get().resolve(Constants.MOD_ID));

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModTab.CREATIVE_MODE_TAB.register(eventBus);
        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
    }
}
