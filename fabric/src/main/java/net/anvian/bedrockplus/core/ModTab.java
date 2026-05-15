package net.anvian.bedrockplus.core;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;

public class ModTab {
    public static void registerTab() {
        Constants.LOG.info("Registering creative tab for " + Constants.MOD_ID);

        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "impure_bedrock"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
                .icon(ModItems.IMPURE_BEDROCK_INGOT::getDefaultInstance)
                .title(Component.translatable("itemGroup.impure_bedrock"))
                .displayItems((context, entries) -> {
                    entries.accept(ModItems.IMPURE_BEDROCK);
                    entries.accept(ModItems.IMPURE_BEDROCK_BLOCK);
                    entries.accept(ModItems.IMPURE_BEDROCK_INGOT);
                    entries.accept(ModItems.IMPURE_BEDROCK_SCRAP);
                    entries.accept(ModItems.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);
                    entries.accept(ModItems.IMPUREBEDROCK_SWORD);
                    entries.accept(ModItems.IMPUREBEDROCK_PICKAXE);
                    entries.accept(ModItems.IMPUREBEDROCK_AXE);
                    entries.accept(ModItems.IMPUREBEDROCK_SHOVEL);
                    entries.accept(ModItems.IMPUREBEDROCK_HOE);
                    entries.accept(ModItems.IMPUREBEDROCK_SPEAR);
                    entries.accept(ModItems.IMPURE_BEDROCK_HELMET);
                    entries.accept(ModItems.IMPURE_BEDROCK_CHESTPLATE);
                    entries.accept(ModItems.IMPURE_BEDROCK_LEGGINGS);
                    entries.accept(ModItems.IMPURE_BEDROCK_BOOTS);
                })
                .build()
        );
    }
}
