package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.config.ModCommonConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INSTANCE = new ForgeTier(
            ModCommonConfigs.ToolMiningLevel.get(), ModCommonConfigs.ToolDurability.get(),
            ModCommonConfigs.ToolMiningspeed.get(), ModCommonConfigs.ToolAttackDamage.get(),
            ModCommonConfigs.ToolEnchantability.get(),
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
}
