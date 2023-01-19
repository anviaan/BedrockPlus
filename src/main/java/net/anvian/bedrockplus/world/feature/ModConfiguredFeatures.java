package net.anvian.bedrockplus.world.feature;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

        public static final RegistryKey<ConfiguredFeature<?,?>> IMPURE_BEDROCK_ORE_KEY = registerKey("impure_bedrock_ore_key");

        public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){
            var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

            RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

            List<OreFeatureConfig.Target> overworldImpureBedrockOres =
                    List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.IMPURE_BEDROCK.getDefaultState()));

            register(context, IMPURE_BEDROCK_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldImpureBedrockOres,10));
        }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BedrockPlusMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
