package net.anvian.bedrockplus.core.registry;

import net.anvian.anvianslib.util.RegistryUtil;
import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModItemRegistry {
    public static void registerItems() {
        RegistryUtil.register(
                BuiltInRegistries.ITEM, Constants.MOD_ID, Constants.IMPURE_BEDROCK_ID, ModItems.IMPURE_BEDROCK);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPURE_BEDROCK_BLOCK_ID,
                ModItems.IMPURE_BEDROCK_BLOCK);

        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPURE_BEDROCK_INGOT_ID,
                ModItems.IMPURE_BEDROCK_INGOT);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPURE_BEDROCK_SCRAP_ID,
                ModItems.IMPURE_BEDROCK_SCRAP);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE_ID,
                ModItems.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);

        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_SWORD_ID,
                ModItems.IMPUREBEDROCK_SWORD);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_PICKAXE_ID,
                ModItems.IMPUREBEDROCK_PICKAXE);
        RegistryUtil.register(
                BuiltInRegistries.ITEM, Constants.MOD_ID, Constants.IMPUREBEDROCK_AXE_ID, ModItems.IMPUREBEDROCK_AXE);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_SHOVEL_ID,
                ModItems.IMPUREBEDROCK_SHOVEL);
        RegistryUtil.register(
                BuiltInRegistries.ITEM, Constants.MOD_ID, Constants.IMPUREBEDROCK_HOE_ID, ModItems.IMPUREBEDROCK_HOE);

        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_SPEAR_ID,
                ModItems.IMPUREBEDROCK_SPEAR);

        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_HELMET_ID,
                ModItems.IMPURE_BEDROCK_HELMET);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_CHESTPLATE_ID,
                ModItems.IMPURE_BEDROCK_CHESTPLATE);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_LEGGINGS_ID,
                ModItems.IMPURE_BEDROCK_LEGGINGS);
        RegistryUtil.register(
                BuiltInRegistries.ITEM,
                Constants.MOD_ID,
                Constants.IMPUREBEDROCK_BOOTS_ID,
                ModItems.IMPURE_BEDROCK_BOOTS);
    }
}
