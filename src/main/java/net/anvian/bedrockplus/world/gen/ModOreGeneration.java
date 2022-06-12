package net.anvian.bedrockplus.world.gen;

import net.anvian.bedrockplus.world.feature.ModPlacedFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOre(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeature.IMPURE_BEDROCK_ORE_PLACED.getKey().get());
    }
}
