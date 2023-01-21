package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.config.ModConfigs;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterials implements ToolMaterial {

        public static final ModToolMaterials INSTANCE = new ModToolMaterials();

        private static final int durability = ModConfigs.ToolDurability;
        private static final float miningSpeed = (float) ModConfigs.ToolMiningSpeed;
        private static final float attackDamage = (float) ModConfigs.ToolAttackDamage;
        private static final int miningLevel = ModConfigs.ToolMiningLevel;
        private static final int enchantability = ModConfigs.ToolEnchantability;

        @Override
        public int getDurability() {
                return durability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
                return miningSpeed;
        }

        @Override
        public float getAttackDamage() {
                return attackDamage;
        } //(float) materialDamage + (int) toolDamage + 1

        @Override
        public int getMiningLevel() {
                return miningLevel;
        }

        @Override
        public int getEnchantability() {
                return enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(ModItems.IMPURE_BEDROCK_SCRAP);
        }
}