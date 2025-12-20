package net.anvian.bedrockplus;

import net.anvian.bedrockplus.core.ModTab;
import net.anvian.bedrockplus.core.registry.ModBlockRegistry;
import net.anvian.bedrockplus.core.registry.ModItemRegistry;
import net.anvian.bedrockplus.core.registry.ModWorldRegistry;
import net.fabricmc.api.ModInitializer;

public class FabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Fabric)");
        CommonMod.init();

        ModBlockRegistry.registerBlocks();
        ModItemRegistry.registerItems();
        ModTab.registerTab();

        ModWorldRegistry.register();
    }
}
