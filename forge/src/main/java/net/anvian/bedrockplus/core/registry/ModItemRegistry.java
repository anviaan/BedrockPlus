package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> IMPURE_BEDROCK = ITEMS.register(Constants.IMPURE_BEDROCK_ID, () -> ModItems.IMPURE_BEDROCK);
    public static final RegistryObject<Item> IMPURE_BEDROCK_BLOCK = ITEMS.register(Constants.IMPURE_BEDROCK_BLOCK_ID, () -> ModItems.IMPURE_BEDROCK_BLOCK);

    public static final RegistryObject<Item> IMPURE_BEDROCK_INGOT = ITEMS.register(Constants.IMPURE_BEDROCK_INGOT_ID, () -> ModItems.IMPURE_BEDROCK_INGOT);
    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register(Constants.IMPURE_BEDROCK_SCRAP_ID, () -> ModItems.IMPURE_BEDROCK_SCRAP);
    public static final RegistryObject<Item> IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE_ID = ITEMS.register(Constants.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE_ID, () -> ModItems.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);

    public static final RegistryObject<Item> IMPUREBEDROCK_SWORD = ITEMS.register(Constants.IMPUREBEDROCK_SWORD_ID, () -> ModItems.IMPUREBEDROCK_SWORD);
    public static final RegistryObject<Item> IMPUREBEDROCK_PICKAXE = ITEMS.register(Constants.IMPUREBEDROCK_PICKAXE_ID, () -> ModItems.IMPUREBEDROCK_PICKAXE);
    public static final RegistryObject<Item> IMPUREBEDROCK_AXE = ITEMS.register(Constants.IMPUREBEDROCK_AXE_ID, () -> ModItems.IMPUREBEDROCK_AXE);
    public static final RegistryObject<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register(Constants.IMPUREBEDROCK_SHOVEL_ID, () -> ModItems.IMPUREBEDROCK_SHOVEL);
    public static final RegistryObject<Item> IMPUREBEDROCK_HOE = ITEMS.register(Constants.IMPUREBEDROCK_HOE_ID, () -> ModItems.IMPUREBEDROCK_HOE);

    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register(Constants.IMPUREBEDROCK_HELMET_ID, () -> ModItems.IMPURE_BEDROCK_HELMET);
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register(Constants.IMPUREBEDROCK_CHESTPLATE_ID, () -> ModItems.IMPURE_BEDROCK_CHESTPLATE);
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register(Constants.IMPUREBEDROCK_LEGGINGS_ID, () -> ModItems.IMPURE_BEDROCK_LEGGINGS);
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register(Constants.IMPUREBEDROCK_BOOTS_ID, () -> ModItems.IMPURE_BEDROCK_BOOTS);
}
