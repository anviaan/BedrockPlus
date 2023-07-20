package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModConfigs;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final SoundEvent equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
    private final int durabilityMultiplier = ModConfigs.ArmorDurabilityMultiplier.get();
    private final int[] protectionAmounts = {
            ModConfigs.ArmorProtectionAmountsBoots.get(),
            ModConfigs.ArmorProtectionAmountsLeggings.get(),
            ModConfigs.ArmorProtectionAmountsChestplate.get(),
            ModConfigs.ArmorProtectionAmountsHelmet.get()
    };
    private final int enchantability = ModConfigs.ArmorEnchantability.get();
    private final float toughness = ModConfigs.ArmorToughness.get().floatValue();
    private final float knockbackResistance = ModConfigs.ArmorKnockbackResistance.get().floatValue();

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getSlot().getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.getSlot().getIndex()];
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
