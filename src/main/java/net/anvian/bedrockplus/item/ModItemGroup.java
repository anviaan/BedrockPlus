package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BEDROCKPLUS = FabricItemGroupBuilder.build
            (new Identifier(BedrockPlusMod.MOD_ID, "impure_bedrock"),
                    () -> new ItemStack(ModItems.IMPURE_BEDROCK_INGOT));
}
