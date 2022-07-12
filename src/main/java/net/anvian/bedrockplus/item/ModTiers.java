package net.anvian.bedrockplus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INSTANCE = new ForgeTier(2,1400,1.5f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
}
