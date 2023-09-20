package net.anvian.bedrockplus.item.armor;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModSmithingTemplateItem extends Item {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final String TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");
    private final Text appliesToText;
    private final Text ingredientsText;
    private final Text titleText;
    private static final Text INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ingredients"))).formatted(TITLE_FORMATTING);
    private static final Text APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.applies_to"))).formatted(TITLE_FORMATTING);

    private static final Text IMPURE_BEDROCK_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier(BedrockPlusMod.MOD_ID, "impure_bedrock_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text IMPURE_BEDROCK_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text IMPURE_BEDROCK_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.base_slot_description")));
    private static final Text IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BedrockPlusMod.MOD_ID,"smithing_template.impure_bedrock_upgrade.additions_slot_description")));

    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText) {
        super(new Item.Settings());
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
    }

    public static SmithingTemplateItem createImpureBedrockUpgrade() {
        return new SmithingTemplateItem(IMPURE_BEDROCK_UPGRADE_APPLIES_TO_TEXT, IMPURE_BEDROCK_UPGRADE_INGREDIENTS_TEXT, IMPURE_BEDROCK_UPGRADE_TEXT, IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, ModSmithingTemplateItem.getImpureBedrockEmptyBaseSlotTextures(), ModSmithingTemplateItem.getImpureBedrockUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getImpureBedrockEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getImpureBedrockUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(this.titleText);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(this.appliesToText));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(this.ingredientsText));
    }

    @Override
    public String getTranslationKey() {
        return TRANSLATION_KEY;
    }
}
