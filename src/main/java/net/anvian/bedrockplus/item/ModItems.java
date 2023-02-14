package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.BedrockPlusConfig;
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
                    .fireResistant()));

    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()));

    //tools
    public static final RegistryObject<Item> IMPUREBEDROCK_SWORD  = ITEMS.register("impurebedrock_sword",
            () -> new SwordItem(ModTiers.INSTANCE, BedrockPlusConfig.SwordAttackDamage.get(),BedrockPlusConfig.SwordAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_PICKAXE  = ITEMS.register("impurebedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.INSTANCE,BedrockPlusConfig.PickaxeAttackDamage.get(), BedrockPlusConfig.PickaxeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_AXE  = ITEMS.register("impurebedrock_axe",
            () -> new AxeItem(ModTiers.INSTANCE,BedrockPlusConfig.AxeAttackDamage.get(), BedrockPlusConfig.AxeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register("impurebedrock_shovel",
            () -> new ShovelItem(ModTiers.INSTANCE,BedrockPlusConfig.ShovelAttackDamage.get().floatValue(), BedrockPlusConfig.ShovelAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_HOE  = ITEMS.register("impurebedrock_hoe",
            () -> new HoeItem(ModTiers.INSTANCE,BedrockPlusConfig.HoeAttackDamage.get(), BedrockPlusConfig.HoeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    //armor
    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register("impurebedrock_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.HEAD,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register("impurebedrock_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.CHEST,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register("impurebedrock_leggings",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.LEGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register("impurebedrock_boots",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.FEET,
                    new Item.Properties().fireResistant()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
