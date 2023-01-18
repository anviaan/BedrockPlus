package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MANGO;

    public static void registerItemGroup(){
        MANGO = FabricItemGroup.builder(new Identifier(BedrockPlusMod.MOD_ID, "bedrockplus_item_group"))
                .displayName(Text.translatable("itemGroup.bedrockplus.impure_bedrock"))
                .icon(()-> new ItemStack(ModItems.IMPURE_BEDROCK_INGOT))
                .build();
    }
}
