package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.core.block.ModBlocks;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.item.armor.ImpureBedrockSmithingTemplateItem;
import net.anvian.bedrockplus.core.item.armor.ModArmorItem;
import net.anvian.bedrockplus.core.item.armor.ModArmorMaterials;
import net.minecraft.world.item.*;

public class ModItems {
    //blocks
    public static final BlockItem IMPURE_BEDROCK = new BlockItem(ModBlocks.IMPURE_BEDROCK, new Item.Properties());
    public static final BlockItem IMPURE_BEDROCK_BLOCK = new BlockItem(ModBlocks.IMPURE_BEDROCK_BLOCK, new Item.Properties());

    //items
    public static final Item IMPURE_BEDROCK_INGOT = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
    public static final Item IMPURE_BEDROCK_SCRAP = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
    public static final Item IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = ImpureBedrockSmithingTemplateItem.createImpureBedrockUpgradeTemplate();

    //tools

    public static final Item IMPUREBEDROCK_SWORD = new SwordItem(
            ModTiers.IMPURE_BEDROCK, new Item.Properties()
            .fireResistant()
            .attributes(SwordItem.createAttributes(
                    ModTiers.IMPURE_BEDROCK,
                    ModConfigs.swordAttackDamage, (float) ModConfigs.swordAttackSpeed)
            )
    );

    public static final Item IMPUREBEDROCK_PICKAXE = new PickaxeItem(
            ModTiers.IMPURE_BEDROCK, new Item.Properties()
            .fireResistant()
            .attributes(PickaxeItem.createAttributes(
                    ModTiers.IMPURE_BEDROCK,
                    ModConfigs.pickaxeAttackDamage, (float) ModConfigs.pickaxeAttackSpeed)
            )
    );

    public static final Item IMPUREBEDROCK_AXE = new AxeItem(
            ModTiers.IMPURE_BEDROCK, new Item.Properties()
            .fireResistant()
            .attributes(AxeItem.createAttributes(
                    ModTiers.IMPURE_BEDROCK,
                    ModConfigs.axeAttackDamage, (float) ModConfigs.axeAttackSpeed)
            )
    );

    public static final Item IMPUREBEDROCK_SHOVEL = new ShovelItem(
            ModTiers.IMPURE_BEDROCK, new Item.Properties()
            .fireResistant()
            .attributes(ShovelItem.createAttributes(
                    ModTiers.IMPURE_BEDROCK,
                    (float) ModConfigs.shovelAttackDamage, (float) ModConfigs.shovelAttackSpeed)
            )
    );

    public static final Item IMPUREBEDROCK_HOE = new HoeItem(
            ModTiers.IMPURE_BEDROCK, new Item.Properties()
            .fireResistant()
            .attributes(HoeItem.createAttributes(
                    ModTiers.IMPURE_BEDROCK,
                    ModConfigs.hoeAttackDamage, (float) ModConfigs.hoeAttackSpeed)
            )
    );

    //armor
    public static final Item IMPURE_BEDROCK_HELMET = new ModArmorItem(
            ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().stacksTo(1)
    );
    public static final Item IMPURE_BEDROCK_CHESTPLATE = new ModArmorItem(
            ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().stacksTo(1)
    );
    public static final Item IMPURE_BEDROCK_LEGGINGS = new ModArmorItem(
            ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().stacksTo(1)
    );
    public static final Item IMPURE_BEDROCK_BOOTS = new ModArmorItem(
            ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().stacksTo(1)
    );

}
