package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.config.ModConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INSTANCE = new ForgeTier(
            ModConfigs.ToolMiningLevel.get(),
            ModConfigs.ToolDurability.get(),
            ModConfigs.ToolMiningSpeed.get().floatValue(),
            ModConfigs.ToolAttackDamage.get().floatValue(),
            ModConfigs.ToolEnchantability.get(),
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
}
