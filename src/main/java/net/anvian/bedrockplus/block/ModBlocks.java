package net.anvian.bedrockplus.block;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IMPURE_BEDROCK = registerBlock("impure_bedrock",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .strength(BedrockPlusMod.CONFIG.BedrockImpureDeepslateHardness(),
                            BedrockPlusMod.CONFIG.BedrockImpureDeepslateResistance()) //75.0, 1200.0
                    .requiresTool()));

    public static final Block IMPURE_BEDROCK_BLOCK = registerBlock("impure_bedrock_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.BLACK)
                    .requiresTool().strength(BedrockPlusMod.CONFIG.BlockOfImpureBedrockHardness(),
                            BedrockPlusMod.CONFIG.BlockOfImpureBedrockResistance()) //75.0, 1200.0
                    .sounds(BlockSoundGroup.NETHERITE)));

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
