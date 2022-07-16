package net.anvian.bedrockplus.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Float> BlockStrength;

    public static final ForgeConfigSpec.ConfigValue<Integer> ToolDurability;
    public static final ForgeConfigSpec.ConfigValue<Float> ToolMiningspeed;
    public static final ForgeConfigSpec.ConfigValue<Float> ToolAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Integer> ToolMiningLevel;
    public static final ForgeConfigSpec.ConfigValue<Integer> ToolEnchantability;

    public static final ForgeConfigSpec.ConfigValue<Integer> SwordAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Float> SwordAttackSpeed;

    public static final ForgeConfigSpec.ConfigValue<Integer> PickaxeAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Float> PickaxeAttackSpeed;

    public static final ForgeConfigSpec.ConfigValue<Float> AxeAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Float> AxeAttackSpeed;

    public static final ForgeConfigSpec.ConfigValue<Float> ShovelAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Float> ShovelAttackSpeed;

    public static final ForgeConfigSpec.ConfigValue<Integer> HoeAttackDamage;
    public static final ForgeConfigSpec.ConfigValue<Float> HoeAttackSpeed;

    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorDurabilityMultiplier;
    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorEnchantability;
    public static final ForgeConfigSpec.ConfigValue<Float> ArmorToughness;
    public static final ForgeConfigSpec.ConfigValue<Float> ArmorKnockbackResistance;
    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorProtectionAmounts1;
    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorProtectionAmounts2;
    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorProtectionAmounts3;
    public static final ForgeConfigSpec.ConfigValue<Integer> ArmorProtectionAmounts4;


    static {
        BUILDER.comment("Configs for SimpleMango Mod");

        BUILDER.push("SimpleMango Mod");

        BUILDER.push("Blocks");
        BlockStrength = BUILDER.comment("How much strength the ImpureBedrock block will have")
                .define("Block Strengt",250.0f);
        BUILDER.pop();

        BUILDER.push("Tools Config");
        ToolDurability = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Tool Durability", 4062);
        ToolMiningspeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Tool Mining Speed", 10.0f);
        ToolAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Tool Attack Damage ", 5.0f);
        ToolMiningLevel = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Tool Mining Level", 4);
        ToolEnchantability = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Tool Enchantability", 30);

        SwordAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Sword Attack Damage", 7);
        SwordAttackSpeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Sword Attack Speed", 1.4f);

        PickaxeAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Pickaxe Attack Damage", 5);
        PickaxeAttackSpeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Pickaxe Attack Speed", 1.8f);

        AxeAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Axe Attack Damage", 9.0f);
        AxeAttackSpeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Axe Attack Speed", 2.0f);

        ShovelAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Shovel Attack Damage", 5.5f);
        ShovelAttackSpeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Shove lAttack Speed", 2.0f);

        HoeAttackDamage = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 0);
        HoeAttackSpeed = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 1.0f);
        BUILDER.pop();

        BUILDER.push("Armor Config");
        ArmorDurabilityMultiplier = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Durability Multiplier", 74);
        ArmorEnchantability = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Enchantability", 2);
        ArmorToughness = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Toughness", 4.5f);
        ArmorKnockbackResistance = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Knockback Resistance", 0.2f);
        ArmorProtectionAmounts1 = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Protection Amounts Boots", 5);
        ArmorProtectionAmounts2 = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Protection Amounts Leggings", 8);
        ArmorProtectionAmounts3 = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Protection Amounts Chest", 10);
        ArmorProtectionAmounts4 = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Armor Protection Amounts Helmet", 4);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
