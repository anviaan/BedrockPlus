package net.anvian.bedrockplus.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> IMPUREBEDROCK_ORE_PLACED = PlacementUtils.register("impurebedrock_ore_placed",
            ModConfiguredFeatures.IMPURE_BEDROCK_ORE, ModOrePlacement.commonOrePlacement(30, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.belowTop(58))));
}
//-80 a 80