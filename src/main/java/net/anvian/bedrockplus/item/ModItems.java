package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.custom.ModArmorItem;
import net.anvian.bedrockplus.item.custom.ModAxeItem;
import net.anvian.bedrockplus.item.custom.ModHoeItem;
import net.anvian.bedrockplus.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item IMPURE_BEDROCK_INGOT = registerItem("impure_bedrock_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item IMPURE_BEDROCK_SCRAP = registerItem("impure_bedrock_scrap",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    //armor
    public static final Item IMPURE_BEDROCK_HELMET = registerItem("impurebedrock_helmet",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_CHESTPLATE = registerItem("impurebedrock_chestplate",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_LEGGINGS = registerItem("impurebedrock_leggings",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));
    public static final Item IMPURE_BEDROCK_BOOTS = registerItem("impurebedrock_boots",
            new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));

    //tools
    public static final Item IMPUREBEDROCK_SWORD = registerItem("impurebedrock_sword",
            new SwordItem(ModToolMaterials.INSTANCE,
                    ModConfigs.SwordAttackDamage,(float) ModConfigs.SwordAttackSpeed,
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_PICKAXE = registerItem("impurebedrock_pickaxe",
            new ModPickaxeItem(ModToolMaterials.INSTANCE,
                    ModConfigs.PickaxeAttackDamage,(float)ModConfigs.PickaxeAttackSpeed,
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_AXE = registerItem("impurebedrock_axe",
            new ModAxeItem(ModToolMaterials.INSTANCE,
                    ModConfigs.AxeAttackDamage, (float)ModConfigs.AxeAttackSpeed,
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_SHOVEL = registerItem("impurebedrock_shovel",
            new ShovelItem(ModToolMaterials.INSTANCE,
                    (float)ModConfigs.ShovelAttackDamage,(float)ModConfigs.ShovelAttackSpeed,
                        new FabricItemSettings().fireproof()));
    public static final Item IMPUREBEDROCK_HOE = registerItem("impurebedrock_hoe",
            new ModHoeItem(ModToolMaterials.INSTANCE,
                    ModConfigs.HoeAttackDamage,(float)ModConfigs.HoeAttackSpeed,
                        new FabricItemSettings().fireproof()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(BedrockPlusMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + BedrockPlusMod.MOD_ID);
    }
}
