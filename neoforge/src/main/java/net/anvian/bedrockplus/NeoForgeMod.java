package net.anvian.bedrockplus;

import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLPaths;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {
    public NeoForgeMod(IEventBus eventBus) {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Neoforge)");
        CommonMod.init(FMLPaths.CONFIGDIR.get().resolve(Constants.MOD_ID));


        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
        ModTab.TABS.register(eventBus);
    }
}
