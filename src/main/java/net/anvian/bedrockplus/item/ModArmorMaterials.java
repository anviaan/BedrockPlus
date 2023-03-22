package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    private final int durabilityMultiplier = BedrockPlusMod.CONFIG.ArmorDurabilityMultiplier();
    private final int[] protectionAmounts = {
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsBoots(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsLeggings(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsChestplate(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsHelmet()
    };
    private final int enchantability = BedrockPlusMod.CONFIG.ArmorEnchantability();
    private final float toughness = (float) BedrockPlusMod.CONFIG.ArmorToughness();
    private final float knockbackResistance = (float) BedrockPlusMod.CONFIG.ArmorKnockbackResistance();

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
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