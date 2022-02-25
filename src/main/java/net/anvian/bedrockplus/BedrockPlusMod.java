package net.anvian.bedrockplus;

import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.item.ModItems;
import net.anvian.config.ModConfigs;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedrockPlusMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "bedrockplus";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModConfigs.registerConfigs();

		ModItems.registerModItems();

		ModBlocks.registerModBlock();
	}
}
