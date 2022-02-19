package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item IMPURE_BEDROCK_INGOT = registerItem("impure_bedrock_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.BEDROCKPLUS)));

    public static final Item IMPURE_BEDROCK_SCRAP = registerItem("impure_bedrock_scrap",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.BEDROCKPLUS)));

    //armor
    public static final Item IMPURE_BEDROCK_HELMET = registerItem("impurebedrock_helmet",
            new ArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.BEDROCKPLUS)));
    public static final Item IMPURE_BEDROCK_CHESTPLATE = registerItem("impurebedrock_chestplate",
            new ArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.BEDROCKPLUS)));
    public static final Item IMPURE_BEDROCK_LEGGINGS = registerItem("impurebedrock_leggings",
            new ArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.BEDROCKPLUS)));
    public static final Item IMPURE_BEDROCK_BOOTS = registerItem("impurebedrock_boots",
            new ArmorItem(ModArmorMaterials.IMPUREBEDROCK, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.BEDROCKPLUS)));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(BedrockPlusMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + BedrockPlusMod.MOD_ID);
    }
}
