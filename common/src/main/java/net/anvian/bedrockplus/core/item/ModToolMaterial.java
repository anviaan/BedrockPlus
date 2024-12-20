package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public interface ModToolMaterial {
    ToolMaterial IMPURE_BEDROCK = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.toolDurability,
            (float) ModConfigs.toolMiningSpeed,
            (float) ModConfigs.toolAttackDamage,
            ModConfigs.toolEnchantability,
            ModTags.Items.IMPURE_BEDROCK
    );
}
