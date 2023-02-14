package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.config.BedrockPlusConfig;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INSTANCE = new ForgeTier(
            BedrockPlusConfig.ToolMiningLevel.get(),
            BedrockPlusConfig.ToolDurability.get(),
            BedrockPlusConfig.ToolMiningSpeed.get().floatValue(),
            BedrockPlusConfig.ToolAttackDamage.get().floatValue(),
            BedrockPlusConfig.ToolEnchantability.get(),
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
}
