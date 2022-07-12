package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BedrockPlusMod.MOD_ID);

    public static final RegistryObject<Item> IMPURE_BEDROCK_INGOT = ITEMS.register("impure_bedrock_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()
                    .tab(ModItemGroup.BEDROCKPLUS)));

    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()
                    .tab(ModItemGroup.BEDROCKPLUS)));

    //tools
    public static final RegistryObject<Item> IMPUREBEDROCK_SWORD  = ITEMS.register("impurebedrock_sword",
            () -> new SwordItem(ModTiers.INSTANCE, 7,1.4f,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_PICKAXE  = ITEMS.register("impurebedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.INSTANCE, 5,1.8f,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_AXE  = ITEMS.register("impurebedrock_axe",
            () -> new AxeItem(ModTiers.INSTANCE, 9,2.0f,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register("impurebedrock_shovel",
            () -> new ShovelItem(ModTiers.INSTANCE, 5, 2.0f,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_HOE  = ITEMS.register("impurebedrock_hoe",
            () -> new HoeItem(ModTiers.INSTANCE, 0,1.0f,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    //armor
    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register("impurebedrock_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register("impurebedrock_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register("impurebedrock_leggings",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register("impurebedrock_boots",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroup.BEDROCKPLUS).fireResistant()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
