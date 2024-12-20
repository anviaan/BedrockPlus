package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ModItemRegistry {
    public static void registerItems() {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPURE_BEDROCK_ID), ModItems.IMPURE_BEDROCK);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPURE_BEDROCK_BLOCK_ID), ModItems.IMPURE_BEDROCK_BLOCK);

        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPURE_BEDROCK_INGOT_ID), ModItems.IMPURE_BEDROCK_INGOT);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPURE_BEDROCK_SCRAP_ID), ModItems.IMPURE_BEDROCK_SCRAP);

        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPUREBEDROCK_SWORD_ID), ModItems.IMPUREBEDROCK_SWORD);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPUREBEDROCK_PICKAXE_ID), ModItems.IMPUREBEDROCK_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPUREBEDROCK_AXE_ID), ModItems.IMPUREBEDROCK_AXE);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPUREBEDROCK_SHOVEL_ID), ModItems.IMPUREBEDROCK_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.IMPUREBEDROCK_HOE_ID), ModItems.IMPUREBEDROCK_HOE);
    }
}
