package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.armor.ModArmorItem;
import net.anvian.bedrockplus.item.armor.ModArmorMaterials;
import net.anvian.bedrockplus.item.armor.ModSmithingTemplateItem;
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

    public static final RegistryObject<Item> IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("impure_bedrock_upgrade_smithing_template",
            ModSmithingTemplateItem::createImpureBedrockUpgradeTemplate);

    //tools
    public static final RegistryObject<Item> IMPUREBEDROCK_SWORD  = ITEMS.register("impurebedrock_sword",
            () -> new SwordItem(ModTiers.INSTANCE, ModConfigs.SwordAttackDamage.get(),ModConfigs.SwordAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_PICKAXE  = ITEMS.register("impurebedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.INSTANCE,ModConfigs.PickaxeAttackDamage.get(), ModConfigs.PickaxeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_AXE  = ITEMS.register("impurebedrock_axe",
            () -> new AxeItem(ModTiers.INSTANCE, ModConfigs.AxeAttackDamage.get(), ModConfigs.AxeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register("impurebedrock_shovel",
            () -> new ShovelItem(ModTiers.INSTANCE,ModConfigs.ShovelAttackDamage.get().floatValue(), ModConfigs.ShovelAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPUREBEDROCK_HOE  = ITEMS.register("impurebedrock_hoe",
            () -> new HoeItem(ModTiers.INSTANCE,ModConfigs.HoeAttackDamage.get(), ModConfigs.HoeAttackSpeed.get().floatValue(),
                    new Item.Properties().fireResistant()));
    //armor
    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register("impurebedrock_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register("impurebedrock_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register("impurebedrock_leggings",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register("impurebedrock_boots",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
