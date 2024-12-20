package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> IMPURE_BEDROCK = ITEMS.register("impure_bedrock", () -> ModItems.IMPURE_BEDROCK);
    public static final RegistryObject<Item> IMPURE_BEDROCK_BLOCK = ITEMS.register("impure_bedrock_block", () -> ModItems.IMPURE_BEDROCK_BLOCK);

    public static final RegistryObject<Item> IMPURE_BEDROCK_INGOT = ITEMS.register("impure_bedrock_ingot", () -> ModItems.IMPURE_BEDROCK_INGOT);
    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap", () -> ModItems.IMPURE_BEDROCK_SCRAP);
}
