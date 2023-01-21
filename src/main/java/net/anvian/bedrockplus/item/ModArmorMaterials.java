package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.config.ModConfigs;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    private final int durabilityMultiplier = ModConfigs.ArmorDurabilityMultiplier;
    private final int[] protectionAmounts = {
            ModConfigs.ArmorProtectionAmounts1,
            ModConfigs.ArmorProtectionAmounts2,
            ModConfigs.ArmorProtectionAmounts3,
            ModConfigs.ArmorProtectionAmounts4
    };
    private final int enchantability = ModConfigs.ArmorEnchantability;
    private final float toughness = (float) ModConfigs.ArmorToughness;
    private final float knockbackResistance = (float) ModConfigs.ArmorKnockbackResistance;

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.IMPURE_BEDROCK_SCRAP);
    }

    public String getName() {
        return "impurebedrock";
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
