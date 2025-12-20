package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.CommonMod;
import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.util.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.EnumMap;

public class ModMaterials {
    private static final ModConfigs.BedrockPlusConfig config = CommonMod.configs.getConfig();

    public interface Tool {
        ToolMaterial IMPURE_BEDROCK = new ToolMaterial(
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                config.toolDurability,
                (float) config.toolMiningSpeed,
                (float) config.toolAttackDamage,
                config.toolEnchantability,
                ModTags.Items.IMPURE_BEDROCK
        );
    }

    public interface Armor {
        ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));
        ResourceKey<EquipmentAsset> IMPURE_BEDROCK_KEY = ResourceKey.create(REGISTRY_KEY, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "impurebedrock"));

        ArmorMaterial IMPURE_BEDROCK = new ArmorMaterial(
                config.armorDurability,
                createMap(new int[]{
                        config.armorProtectionAmountsHelmet,
                        config.armorProtectionAmountsChestplate,
                        config.armorProtectionAmountsLeggings,
                        config.armorProtectionAmountsBoots,
                        config.armorProtectionAmountsBody}),
                config.armorEnchantability,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                (float) config.armorToughness,
                (float) config.armorKnockbackResistance,
                ModTags.Items.IMPURE_BEDROCK,
                IMPURE_BEDROCK_KEY);

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }
}
