package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.armor.ModArmorItem;
import net.anvian.bedrockplus.item.armor.ModArmorMaterials;
import net.anvian.bedrockplus.item.armor.ModSmithingTemplateItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item IMPURE_BEDROCK_INGOT = registerItem("impure_bedrock_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item IMPURE_BEDROCK_SCRAP = registerItem("impure_bedrock_scrap",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = registerItem("impure_bedrock_upgrade_smithing_template",
            ModSmithingTemplateItem.createImpureBedrockUpgrade());

    //armor
    public static final Item IMPURE_BEDROCK_HELMET = registerItem("impurebedrock_helmet",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.HELMET,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_CHESTPLATE = registerItem("impurebedrock_chestplate",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_LEGGINGS = registerItem("impurebedrock_leggings",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_BOOTS = registerItem("impurebedrock_boots",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.BOOTS,
                    new FabricItemSettings().fireproof()));

    //tools
    public static final Item IMPUREBEDROCK_SWORD = registerItem("impurebedrock_sword",
            new SwordItem(ModToolMaterials.INSTANCE,
                    BedrockPlusMod.CONFIG.SwordAttackDamage(),(float) BedrockPlusMod.CONFIG.SwordAttackSpeed(),
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_PICKAXE = registerItem("impurebedrock_pickaxe",
            new PickaxeItem(ModToolMaterials.INSTANCE,
                    BedrockPlusMod.CONFIG.PickaxeAttackDamage(),(float)BedrockPlusMod.CONFIG.PickaxeAttackSpeed(),
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_AXE = registerItem("impurebedrock_axe",
            new AxeItem(ModToolMaterials.INSTANCE,
                    BedrockPlusMod.CONFIG.AxeAttackDamage(), (float)BedrockPlusMod.CONFIG.AxeAttackSpeed(),
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_SHOVEL = registerItem("impurebedrock_shovel",
            new ShovelItem(ModToolMaterials.INSTANCE,
                    (float)BedrockPlusMod.CONFIG.ShovelAttackDamage(),(float)BedrockPlusMod.CONFIG.ShovelAttackSpeed(),
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_HOE = registerItem("impurebedrock_hoe",
            new HoeItem(ModToolMaterials.INSTANCE,
                    BedrockPlusMod.CONFIG.HoeAttackDamage(),(float)BedrockPlusMod.CONFIG.HoeAttackSpeed(),
                        new FabricItemSettings().fireproof()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(BedrockPlusMod.MOD_ID, name), item);
    }
    private static  void addItemsToItemGroup(){
        addItemGroup(IMPURE_BEDROCK_INGOT);
        addItemGroup(IMPURE_BEDROCK_SCRAP);
        addItemGroup(IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);
        addItemGroup(IMPURE_BEDROCK_HELMET);
        addItemGroup(IMPURE_BEDROCK_CHESTPLATE);
        addItemGroup(IMPURE_BEDROCK_LEGGINGS);
        addItemGroup(IMPURE_BEDROCK_BOOTS);
        addItemGroup(IMPUREBEDROCK_SWORD);
        addItemGroup(IMPUREBEDROCK_PICKAXE);
        addItemGroup(IMPUREBEDROCK_AXE);
        addItemGroup(IMPUREBEDROCK_SHOVEL);
        addItemGroup(IMPUREBEDROCK_HOE);
    }

    private  static  void  addItemGroup(Item item){
        ItemGroupEvents.modifyEntriesEvent(BedrockPlusMod.MANGO).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        BedrockPlusMod.LOGGER.debug("Registering Mod Items for " + BedrockPlusMod.MOD_ID);
        addItemsToItemGroup();
    }
}
