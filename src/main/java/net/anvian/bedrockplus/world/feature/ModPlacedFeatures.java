package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> IMPURE_BEDROCK_ORE_PLACED_KEY = registerKey("impure_bedrock_ore_placed");

    public static final PlacedFeature IMPURE_BEDROCK_ORE_PLACED = registerPlacedFeature("impure_bedrock_ore_placed",
            // number of veins per chunk
            ModConfiguredFeatures.IMPURE_BEDROCK_ORE.withPlacement(ModOreFeatures.modifiersWithCount(25,
                    //from the minimum layer to -58
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(-58)))));


    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(BedrockPlusMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(BedrockPlusMod.MOD_ID, name));
    }
}
