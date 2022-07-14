package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_IMPURE_BEDROCK = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.IMPURE_BEDROCK.get().defaultBlockState())
    );
    public static final Holder<ConfiguredFeature<OreConfiguration,?>> IMPURE_BEDROCK_ORE = FeatureUtils.register(
            "impurebedrock_ore", Feature.ORE, new OreConfiguration(OVERWORLD_IMPURE_BEDROCK,10)
    );
}
