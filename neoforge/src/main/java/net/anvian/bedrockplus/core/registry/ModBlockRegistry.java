package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static final DeferredBlock<Block> IMPURE_BEDROCK = BLOCKS.register(Constants.IMPURE_BEDROCK_ID, () -> ModBlocks.IMPURE_BEDROCK);
    public static final DeferredBlock<Block> IMPURE_BEDROCK_BLOCK = BLOCKS.register(Constants.IMPURE_BEDROCK_BLOCK_ID, () -> ModBlocks.IMPURE_BEDROCK_BLOCK);
}
