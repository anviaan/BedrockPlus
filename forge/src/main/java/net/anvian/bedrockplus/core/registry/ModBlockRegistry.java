package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    public static final RegistryObject<Block> IMPURE_BEDROCK = BLOCKS.register(Constants.IMPURE_BEDROCK_ID, () -> ModBlocks.IMPURE_BEDROCK);
    public static final RegistryObject<Block> IMPURE_BEDROCK_BLOCK = BLOCKS.register(Constants.IMPURE_BEDROCK_BLOCK_ID, () -> ModBlocks.IMPURE_BEDROCK_BLOCK);
}
