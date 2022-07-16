package net.anvian.bedrockplus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INSTANCE = new ForgeTier(4, 4062, 10.0f,
            5.0f, 30,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
}
