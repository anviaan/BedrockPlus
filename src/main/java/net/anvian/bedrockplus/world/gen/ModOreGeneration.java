package net.anvian.bedrockplus.world.gen;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.world.feature.ModConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(BedrockPlusMod.MOD_ID, "overworld_impure_bedrock_ore"), ModConfiguredFeatures.OVERWORLD_IMPURE_BEDROCK_ORE_CONFIG);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(BedrockPlusMod.MOD_ID, "overworld_impure_bedrock_ore"),
                ModConfiguredFeatures.OVERWORLD_IMPURE_BEDROCK_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(BedrockPlusMod.MOD_ID, "overworld_impure_bedrock_ore")));
    }
}
