package net.anvian.bedrockplus.core.block;

import net.anvian.bedrockplus.CommonMod;
import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    private static final ModConfigs.BedrockPlusConfig config = CommonMod.configs.getConfig();

    public static final Block IMPURE_BEDROCK = new Block(
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.ANCIENT_DEBRIS)
                    .strength((float) config.bedrockImpureDeepslateHardness,
                            (float) config.bedrockImpureDeepslateResistance)
                    .requiresCorrectToolForDrops()
                    .setId(key(Constants.IMPURE_BEDROCK_ID))
    );

    public static final Block IMPURE_BEDROCK_BLOCK = new Block(
            BlockBehaviour.Properties
                    .of().mapColor(MapColor.COLOR_BLACK)
                    .strength((float) config.blockOfImpureBedrockHardness,
                            (float) config.blockOfImpureBedrockResistance)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)
                    .setId(key(Constants.IMPURE_BEDROCK_BLOCK_ID))
    );

    private static ResourceKey<Block> key(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
