package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, BedrockPlusMod.MOD_ID);

    public static final RegistryObject<PlacedFeature> IMPUREBEDROCK_ORE_PLACED = PLACED_FEATURE.register("impurebedrock_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.IMPURE_BEDROCK.getHolder().get(), commonOrePlacement(25,
                            HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(-58)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }
    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static void register(IEventBus eventBus){
        PLACED_FEATURE.register(eventBus);
    }
}