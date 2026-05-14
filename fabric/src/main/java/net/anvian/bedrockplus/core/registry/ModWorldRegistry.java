package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModWorldRegistry {
    private static final ResourceKey<PlacedFeature> IMPUREBEDROCK_PLACED = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "impurebedrock_placed"));

    public static void register() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, IMPUREBEDROCK_PLACED);
    }
}
