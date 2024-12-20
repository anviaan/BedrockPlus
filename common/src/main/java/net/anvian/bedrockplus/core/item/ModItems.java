package net.anvian.bedrockplus.core.item;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

public class ModItems {
    //blocks
    public static final BlockItem IMPURE_BEDROCK = new BlockItem(ModBlocks.IMPURE_BEDROCK, new Item.Properties().useBlockDescriptionPrefix().setId(key(Constants.IMPURE_BEDROCK_ID)));
    public static final BlockItem IMPURE_BEDROCK_BLOCK = new BlockItem(ModBlocks.IMPURE_BEDROCK_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key(Constants.IMPURE_BEDROCK_BLOCK_ID)));

    //items
    public static final Item IMPURE_BEDROCK_INGOT = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().setId(key(Constants.IMPURE_BEDROCK_INGOT_ID)));
    public static final Item IMPURE_BEDROCK_SCRAP = new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().setId(key(Constants.IMPURE_BEDROCK_SCRAP_ID)));

    //tools

    public static final Item IMPUREBEDROCK_SWORD = new SwordItem(
            ModToolMaterial.IMPURE_BEDROCK, ModConfigs.swordAttackDamage, (float) ModConfigs.swordAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_SWORD_ID))
    );

    public static final Item IMPUREBEDROCK_PICKAXE = new PickaxeItem(
            ModToolMaterial.IMPURE_BEDROCK, (float) ModConfigs.pickaxeAttackDamage, (float) ModConfigs.pickaxeAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_PICKAXE_ID))
    );

    public static final Item IMPUREBEDROCK_AXE = new AxeItem(
            ModToolMaterial.IMPURE_BEDROCK, (float) ModConfigs.axeAttackDamage, (float) ModConfigs.axeAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_AXE_ID))
    );

    public static final Item IMPUREBEDROCK_SHOVEL = new ShovelItem(
            ModToolMaterial.IMPURE_BEDROCK, (float) ModConfigs.shovelAttackDamage, (float) ModConfigs.shovelAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_SHOVEL_ID))
    );

    public static final Item IMPUREBEDROCK_HOE = new HoeItem(
            ModToolMaterial.IMPURE_BEDROCK, ModConfigs.hoeAttackDamage, (float) ModConfigs.hoeAttackSpeed, new Item.Properties().fireResistant().setId(key(Constants.IMPUREBEDROCK_HOE_ID))
    );

    private static ResourceKey<Item> key(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
