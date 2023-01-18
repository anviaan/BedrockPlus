package net.anvian.bedrockplus.block;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IMPURE_BEDROCK = registerBlock("impure_bedrock",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .strength(250.0f,6000.0f)
                    .requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(BedrockPlusMod.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(BedrockPlusMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(ModItemGroup.BEDROCKPLUS).fireproof()));
}

    public static void registerModBlock(){
        System.out.println("Registering ModBlock for " + BedrockPlusMod.MOD_ID);
    }
}
