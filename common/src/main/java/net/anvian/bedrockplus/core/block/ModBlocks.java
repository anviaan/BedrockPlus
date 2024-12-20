package net.anvian.bedrockplus.core.block;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    public static final Block IMPURE_BEDROCK = new Block(
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.ANCIENT_DEBRIS)
                    .strength((float) ModConfigs.bedrockImpureDeepslateHardness,
                            (float) ModConfigs.bedrockImpureDeepslateResistance)
                    .requiresCorrectToolForDrops()
                    .setId(key("impure_bedrock"))
    );

    public static final Block IMPURE_BEDROCK_BLOCK = new Block(
            BlockBehaviour.Properties
                    .of().mapColor(MapColor.COLOR_BLACK)
                    .strength((float) ModConfigs.blockOfImpureBedrockHardness,
                            (float) ModConfigs.blockOfImpureBedrockResistance)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)
                    .setId(key("impure_bedrock_block"))
    );

    private static ResourceKey<Block> key(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
