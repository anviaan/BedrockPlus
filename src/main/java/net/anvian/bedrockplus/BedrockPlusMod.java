package net.anvian.bedrockplus;

import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.config.BedrockPlusConfig;
import net.anvian.bedrockplus.item.ModItems;
import net.anvian.bedrockplus.world.feature.ModConfiguredFeatures;
import net.anvian.bedrockplus.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedrockPlusMod implements ModInitializer {
	public static final BedrockPlusConfig CONFIG = BedrockPlusConfig.createAndLoad();
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "bedrockplus";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();

		ModBlocks.registerModBlock();

		ModWorldGen.generateWorldGen();
	}
}
