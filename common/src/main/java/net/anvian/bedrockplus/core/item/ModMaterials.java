package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

public class ModMaterials {
    public interface Tool {
        ToolMaterial IMPURE_BEDROCK = new ToolMaterial(
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                ModConfigs.toolDurability,
                (float) ModConfigs.toolMiningSpeed,
                (float) ModConfigs.toolAttackDamage,
                ModConfigs.toolEnchantability,
                ModTags.Items.IMPURE_BEDROCK
        );
    }

    public interface Armor {
        ArmorMaterial IMPURE_BEDROCK = new ArmorMaterial(
                ModConfigs.armorDurability,
                createMap(new int[]{
                        ModConfigs.armorProtectionAmountsHelmet,
                        ModConfigs.armorProtectionAmountsChestplate,
                        ModConfigs.armorProtectionAmountsLeggings,
                        ModConfigs.armorProtectionAmountsBoots,
                        ModConfigs.armorProtectionAmountsBody}),
                ModConfigs.armorEnchantability,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                (float) ModConfigs.armorToughness,
                (float) ModConfigs.armorKnockbackResistance,
                ModTags.Items.IMPURE_BEDROCK,
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "impurebedrock"));

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }
}
