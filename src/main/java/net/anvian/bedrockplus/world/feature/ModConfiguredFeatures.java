package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?,?> OVERWORLD_IMPURE_BEDROCK_ORE_CONFIG = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
            OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
            ModBlocks.IMPURE_BEDROCK.getDefaultState(),10));

    public static PlacedFeature OVERWORLD_IMPURE_BEDROCK_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_IMPURE_BEDROCK_ORE_CONFIG),
            Arrays.asList(
                    CountPlacementModifier.of(30), // number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(-58))
            )
    );

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BedrockPlusMod.MOD_ID);
    }
}
