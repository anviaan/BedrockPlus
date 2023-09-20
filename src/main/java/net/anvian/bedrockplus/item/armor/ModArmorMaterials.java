package net.anvian.bedrockplus.item.armor;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public class ModArmorMaterials implements ArmorMaterial {

    public static final ModArmorMaterials IMPUREBEDROCK = new ModArmorMaterials();

    private final int durabiTityMultiplier = BedrockPlusMod.CONFIG.ArmorDurabilityMultiplier();
    private final int[] protectionAmounts = {
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsBoots(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsLeggings(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsChestplate(),
            BedrockPlusMod.CONFIG.ArmorProtectionAmountsHelmet()
    };
    private final int enchantability = BedrockPlusMod.CONFIG.ArmorEnchantability();
    private final SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    private final float toughness = (float) BedrockPlusMod.CONFIG.ArmorToughness();
    private final float knockbackResistance = (float) BedrockPlusMod.CONFIG.ArmorKnockbackResistance();
    private final Supplier<Ingredient> repairIngredient = () -> Ingredient.ofItems(ModItems.IMPURE_BEDROCK_SCRAP);
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabiTityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return BedrockPlusMod.MOD_ID + ":" + "impurebedrock";
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}