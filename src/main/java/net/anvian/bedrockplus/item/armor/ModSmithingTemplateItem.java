package net.anvian.bedrockplus.item.armor;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ModSmithingTemplateItem extends Item {
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final String DESCRIPTION_ID = Util.makeDescriptionId("item", new ResourceLocation("smithing_template"));
    private static final Component INGREDIENTS_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ingredients"))).withStyle(TITLE_FORMAT);
    private static final Component APPLIES_TO_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.applies_to"))).withStyle(TITLE_FORMAT);
    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
    private final Component appliesTo;
    private final Component ingredients;
    private final Component upgradeDescription;

    private static final Component IMPURE_BEDROCK_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(BedrockPlusMod.MOD_ID,"impure_bedrock_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.base_slot_description")));
    private static final Component IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.additions_slot_description")));

    public ModSmithingTemplateItem(Component p_266834_, Component p_267043_, Component p_267048_) {
        super(new Item.Properties());
        this.appliesTo = p_266834_;
        this.ingredients = p_267043_;
        this.upgradeDescription = p_267048_;
    }

    public static SmithingTemplateItem createImpureBedrockUpgradeTemplate() {
        return new SmithingTemplateItem(IMPURE_BEDROCK_UPGRADE_APPLIES_TO, IMPURE_BEDROCK_UPGRADE_INGREDIENTS, IMPURE_BEDROCK_UPGRADE, IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION, IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createImpureBedrockUpgradeIconList(), createImpureBedrockUpgradeMaterialList());
    }

    private static List<ResourceLocation> createImpureBedrockUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createImpureBedrockUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public void appendHoverText(ItemStack p_267313_, @Nullable Level p_266896_, List<Component> p_266820_, TooltipFlag p_266857_) {
        super.appendHoverText(p_267313_, p_266896_, p_266820_, p_266857_);
        p_266820_.add(this.upgradeDescription);
        p_266820_.add(CommonComponents.EMPTY);
        p_266820_.add(APPLIES_TO_TITLE);
        p_266820_.add(CommonComponents.space().append(this.appliesTo));
        p_266820_.add(INGREDIENTS_TITLE);
        p_266820_.add(CommonComponents.space().append(this.ingredients));
    }

    public String getDescriptionId() {
        return DESCRIPTION_ID;
    }
}
