package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.CommonMod;
import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.item.armor.ImpureBedrockSmithingTemplateItem;
import net.anvian.bedrockplus.core.item.armor.ModArmorItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;

public class ModItems {
    private static final ModConfigs.BedrockPlusConfig config = CommonMod.configs.getConfig();
    //blocks
    public static final BlockItem IMPURE_BEDROCK = new BlockItem(ModBlocks.IMPURE_BEDROCK, new Item.Properties().useBlockDescriptionPrefix().setId(key(Constants.IMPURE_BEDROCK_ID)));
    public static final BlockItem IMPURE_BEDROCK_BLOCK = new BlockItem(ModBlocks.IMPURE_BEDROCK_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key(Constants.IMPURE_BEDROCK_BLOCK_ID)));

    //items
    public static final Item IMPURE_BEDROCK_INGOT = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().setId(key(Constants.IMPURE_BEDROCK_INGOT_ID)));
    public static final Item IMPURE_BEDROCK_SCRAP = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().setId(key(Constants.IMPURE_BEDROCK_SCRAP_ID)));
    public static final Item IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = ImpureBedrockSmithingTemplateItem.createImpureBedrockUpgradeTemplate(new Item.Properties().rarity(Rarity.UNCOMMON).setId(key(Constants.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE_ID)));

    //tools
    public static final Item IMPUREBEDROCK_SWORD = new Item(
            new Item.Properties().sword(ModMaterials.Tool.IMPURE_BEDROCK, config.swordAttackDamage, (float) config.swordAttackSpeed).fireResistant().setId(key(Constants.IMPUREBEDROCK_SWORD_ID))
    );

    public static final Item IMPUREBEDROCK_PICKAXE = new Item(
            new Item.Properties().pickaxe(ModMaterials.Tool.IMPURE_BEDROCK, (float) config.pickaxeAttackDamage, (float) config.pickaxeAttackSpeed).fireResistant().setId(key(Constants.IMPUREBEDROCK_PICKAXE_ID))
    );

    public static final Item IMPUREBEDROCK_AXE = new AxeItem(
            ModMaterials.Tool.IMPURE_BEDROCK, (float) config.axeAttackDamage, (float) config.axeAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_AXE_ID))
    );

    public static final Item IMPUREBEDROCK_SHOVEL = new ShovelItem(
            ModMaterials.Tool.IMPURE_BEDROCK, (float) config.shovelAttackDamage, (float) config.shovelAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_SHOVEL_ID))
    );

    public static final Item IMPUREBEDROCK_HOE = new HoeItem(
            ModMaterials.Tool.IMPURE_BEDROCK, config.hoeAttackDamage, (float) config.hoeAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_HOE_ID))
    );

    //armor
    public static final Item IMPURE_BEDROCK_HELMET = new ModArmorItem(
            new Item.Properties().humanoidArmor(ModMaterials.Armor.IMPURE_BEDROCK, ArmorType.HELMET).fireResistant().stacksTo(1).setId(key(Constants.IMPUREBEDROCK_HELMET_ID))
    );
    public static final Item IMPURE_BEDROCK_CHESTPLATE = new ModArmorItem(
            new Item.Properties().humanoidArmor(ModMaterials.Armor.IMPURE_BEDROCK, ArmorType.CHESTPLATE).fireResistant().stacksTo(1).setId(key(Constants.IMPUREBEDROCK_CHESTPLATE_ID))
    );
    public static final Item IMPURE_BEDROCK_LEGGINGS = new ModArmorItem(
            new Item.Properties().humanoidArmor(ModMaterials.Armor.IMPURE_BEDROCK, ArmorType.LEGGINGS).fireResistant().stacksTo(1).setId(key(Constants.IMPUREBEDROCK_LEGGINGS_ID))
    );
    public static final Item IMPURE_BEDROCK_BOOTS = new ModArmorItem(
            new Item.Properties().humanoidArmor(ModMaterials.Armor.IMPURE_BEDROCK, ArmorType.BOOTS).fireResistant().stacksTo(1).setId(key(Constants.IMPUREBEDROCK_BOOTS_ID))
    );

    private static ResourceKey<Item> key(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
