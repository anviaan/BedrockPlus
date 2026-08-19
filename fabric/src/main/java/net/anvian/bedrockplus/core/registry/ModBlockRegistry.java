package net.anvian.bedrockplus.core.registry;

import net.anvian.anvianslib.util.RegistryUtil;
import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModBlockRegistry {
    public static void registerBlocks() {
        RegistryUtil.register(
                BuiltInRegistries.BLOCK, Constants.MOD_ID, Constants.IMPURE_BEDROCK_ID, ModBlocks.IMPURE_BEDROCK);
        RegistryUtil.register(
                BuiltInRegistries.BLOCK,
                Constants.MOD_ID,
                Constants.IMPURE_BEDROCK_BLOCK_ID,
                ModBlocks.IMPURE_BEDROCK_BLOCK);
    }
}
