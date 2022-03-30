package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_IMPURE_BEDROCK = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.IMPURE_BEDROCK.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig,?>> IMPURE_BEDROCK =
            ConfiguredFeatures.register("impure_bedrock", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_IMPURE_BEDROCK,10));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BedrockPlusMod.MOD_ID);
    }
}
