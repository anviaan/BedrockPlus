package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final SoundEvent equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
    private final int durabilityMultiplier = 74;
    private final int[] protectionAmounts = {5,8,10,4};
    private final int enchantability = 2;
    private final float toughness = 4.5f;
    private final float knockbackResistance = 0.2f;


    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return BASE_DURABILITY[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.protectionAmounts[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get());
    }

    public String getName() {
        return BedrockPlusMod.MOD_ID + ":" + "impurebedrock";
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
