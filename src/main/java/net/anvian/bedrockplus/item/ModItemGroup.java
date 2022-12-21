package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static void addGroup()
    {
        // force class run when we want
    }
    public static final ItemGroup BEDROCKPLUS =
            FabricItemGroup.builder(new Identifier(BedrockPlusMod.MOD_ID, "impure_bedrock"))
            .icon(() -> new ItemStack(ModItems.IMPURE_BEDROCK_INGOT))
                    .entries(((enabledFeatures, entries, operatorEnabled) -> {
                        //items
                        entries.add(ModItems.IMPURE_BEDROCK_INGOT);
                        entries.add(ModItems.IMPURE_BEDROCK_SCRAP);

                        entries.add(ModItems.IMPURE_BEDROCK_HELMET);
                        entries.add(ModItems.IMPURE_BEDROCK_CHESTPLATE);
                        entries.add(ModItems.IMPURE_BEDROCK_LEGGINGS);
                        entries.add(ModItems.IMPURE_BEDROCK_BOOTS);

                        entries.add(ModItems.IMPUREBEDROCK_SWORD);
                        entries.add(ModItems.IMPUREBEDROCK_PICKAXE);
                        entries.add(ModItems.IMPUREBEDROCK_AXE);
                        entries.add(ModItems.IMPUREBEDROCK_SHOVEL);
                        entries.add(ModItems.IMPUREBEDROCK_HOE);

                        //blocks
                        entries.add(ModBlocks.IMPURE_BEDROCK);
                    }))
                    .build();
}
