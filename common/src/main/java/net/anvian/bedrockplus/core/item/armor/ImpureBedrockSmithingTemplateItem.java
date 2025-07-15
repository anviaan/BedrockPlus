package net.anvian.bedrockplus.core.item.armor;

import net.anvian.bedrockplus.Constants;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ImpureBedrockSmithingTemplateItem extends Item {
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component INGREDIENTS_TITLE = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.ingredients"))
            )
            .withStyle(TITLE_FORMAT);
    private static final Component APPLIES_TO_TITLE = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.applies_to"))
            )
            .withStyle(TITLE_FORMAT);
    private static final Component SMITHING_TEMPLATE_SUFFIX = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template"))
            )
            .withStyle(TITLE_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.impure_bedrock_upgrade.applies_to"))
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.impure_bedrock_upgrade.ingredients"))
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.impure_bedrock_upgrade.base_slot_description"))
    );
    private static final Component IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "smithing_template.impure_bedrock_upgrade.additions_slot_description"))
    );
    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("container/slot/helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("container/slot/chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("container/slot/leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("container/slot/boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("container/slot/hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("container/slot/axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("container/slot/sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("container/slot/shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("container/slot/pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("container/slot/ingot");

    private final Component appliesTo;
    private final Component ingredients;

    public ImpureBedrockSmithingTemplateItem(
            Component p_266834_,
            Component p_267043_,
            Item.Properties p_360838_
    ) {
        super(p_360838_);
        this.appliesTo = p_266834_;
        this.ingredients = p_267043_;
    }

    public static SmithingTemplateItem createImpureBedrockUpgradeTemplate(Item.Properties p_365255_) {
        return new SmithingTemplateItem(
                IMPURE_BEDROCK_UPGRADE_APPLIES_TO,
                IMPURE_BEDROCK_UPGRADE_INGREDIENTS,
                IMPURE_BEDROCK_UPGRADE_BASE_SLOT_DESCRIPTION,
                IMPURE_BEDROCK_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createImpureBedrockUpgradeIconList(),
                createImpureBedrockUpgradeMaterialList(),
                p_365255_
        );
    }

    private static List<ResourceLocation> createImpureBedrockUpgradeIconList() {
        return List.of(
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE,
                EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL
        );
    }

    private static List<ResourceLocation> createImpureBedrockUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext tooltipContext, @NotNull TooltipDisplay tooltipDisplay, @NotNull Consumer<Component> componentConsumer, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, tooltipContext, tooltipDisplay, componentConsumer, tooltipFlag);
        componentConsumer.accept(SMITHING_TEMPLATE_SUFFIX);
        componentConsumer.accept(CommonComponents.EMPTY);
        componentConsumer.accept(APPLIES_TO_TITLE);
        componentConsumer.accept(CommonComponents.space().append(this.appliesTo));
        componentConsumer.accept(INGREDIENTS_TITLE);
        componentConsumer.accept(CommonComponents.space().append(this.ingredients));
    }
}