package net.anvian.bedrockplus.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;


public class ModPlacedFeature {

    public static final RegistryEntry<PlacedFeature> MYTHRIL_ORE_PLACED = PlacedFeatures.register("mythril_ore_placed",
            ModConfiguredFeatures.IMPURE_BEDROCK, ModOreFeature.modifiersWithCount(30,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(-58))));
}
