package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModCommonConfigs;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final SoundEvent equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
    private final int durabilityMultiplier = ModCommonConfigs.ArmorDurabilityMultiplier.get();//74
    private final int[] protectionAmounts = {
            ModCommonConfigs.ArmorProtectionAmounts1.get(),//5
            ModCommonConfigs.ArmorProtectionAmounts2.get(),//8
            ModCommonConfigs.ArmorProtectionAmounts3.get(),//10
            ModCommonConfigs.ArmorProtectionAmounts4.get()//4
    };
    private final int enchantability = ModCommonConfigs.ArmorEnchantability.get();//2
    private final float toughness = ModCommonConfigs.ArmorToughness.get();//4.5f
    private final float knockbackResistance = ModCommonConfigs.ArmorKnockbackResistance.get();//0.2


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
