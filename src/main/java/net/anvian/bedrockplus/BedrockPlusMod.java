package net.anvian.bedrockplus;

import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.ModItemGroup;
import net.anvian.bedrockplus.item.ModItems;
import net.anvian.bedrockplus.world.feature.ModConfiguredFeatures;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedrockPlusMod implements ModInitializer {
	public static final String MOD_ID ="bedrockplus";
	public static final Logger LOGGER = LoggerFactory.getLogger("bedrockplus");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroup.registerItemGroup();

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModConfigs.registerConfigs();

		ModItems.registerModItems();

		ModBlocks.registerModBlock();

	}
}