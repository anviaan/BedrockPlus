package net.anvian.bedrockplus.block;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.ModItemGroup;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockPlusMod.MOD_ID);

    public static final RegistryObject<Block> IMPURE_BEDROCK = registerBlock("impure_bedrock",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.ANCIENT_DEBRIS)
                    .strength(75.0f,6000.0f) //250.0
                    .requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().fireResistant().tab(ModItemGroup.BEDROCKPLUS)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
