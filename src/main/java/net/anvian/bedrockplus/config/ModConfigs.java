package net.anvian.bedrockplus.config;

import com.mojang.datafixers.util.Pair;
import net.anvian.bedrockplus.BedrockPlusMod;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int ToolDurability;
    public static double ToolMiningspeed;
    public static double ToolAttackDamage;
    public static int ToolMiningLevel;
    public static int ToolEnchantability;

    public static int SwordAttackDamage;
    public static double SwordAttackSpeed;
    public static int PickaxeAttackDamage;
    public static double PickaxeAttackSpeed;
    public static int AxeAttackDamage;
    public static double AxeAttackSpeed;
    public static double ShovelAttackDamage;
    public static double ShovelAttackSpeed;
    public static int HoeAttackDamage;
    public static double HoeAttackSpeed;

    public static int ArmorDurabilityMultiplier;
    public static int ArmorEnchantability;
    public static double ArmorToughness;
    public static double ArmorKnockbackResistance;
    public static int[] ArmorProtectionAmounts = new int[4];

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        //creates a file
        CONFIG = SimpleConfig.of(BedrockPlusMod.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("tools.durability","4062"),"int");
        configs.addKeyValuePair(new Pair<>("tools.miningSpeed","10.0d"),"double");
        configs.addKeyValuePair(new Pair<>("tools.attackDamage", "5.0d"),"double");
        configs.addKeyValuePair(new Pair<>("tools.miningLevel","4"), "int");
        configs.addKeyValuePair(new Pair<>("tools.enchantability","30"),"int");

        configs.addKeyValuePair(new Pair<>("sword.attackDamage", "7"),"int");
        configs.addKeyValuePair(new Pair<>("sword.attackSpeed", "-1.4d"),"double");
        configs.addKeyValuePair(new Pair<>("pickaxe.attackDamage","5"),"int");
        configs.addKeyValuePair(new Pair<>("pickaxe.attackSpeed","-1.8d"),"double");
        configs.addKeyValuePair(new Pair<>("axe.attackDamage","9"),"int");
        configs.addKeyValuePair(new Pair<>("axe.attackSpeed","-2d"),"double");
        configs.addKeyValuePair(new Pair<>("shovel.attackDamage","5.5"),"double");
        configs.addKeyValuePair(new Pair<>("shovel.attackSpeed","-2d"),"double");
        configs.addKeyValuePair(new Pair<>("hoe.attackDamage","0"),"int");
        configs.addKeyValuePair(new Pair<>("hoe.attackSpeed","1d"),"double");

        configs.addKeyValuePair(new Pair<>("armor.durabilityMultiplier","74"),"int");
        configs.addKeyValuePair(new Pair<>("armor.enchantability","2"),"int");
        configs.addKeyValuePair(new Pair<>("armor.toughness","4.5d"),"double");
        configs.addKeyValuePair(new Pair<>("armor.knockbackResistance", "0.2d"),"double");
        configs.addKeyValuePair(new Pair<>("armor.protectionAmounts.0","5"),"int | boots");
        configs.addKeyValuePair(new Pair<>("armor.protectionAmounts.1","8"),"int | leggings");
        configs.addKeyValuePair(new Pair<>("armor.protectionAmounts.2","10"),"int | breastplate");
        configs.addKeyValuePair(new Pair<>("armor.protectionAmounts.3","4"),"int |helmet");

    }

    private static void assignConfigs() {
        ToolDurability = CONFIG.getOrDefault("tools.durability",4062);
        ToolMiningspeed = CONFIG.getOrDefault("tools.miningSpeed",10.0d);
        ToolAttackDamage = CONFIG.getOrDefault("tools.attackDamage",5.0d);
        ToolMiningLevel = CONFIG.getOrDefault("tools.miningLevel",4);
        ToolEnchantability = CONFIG.getOrDefault("tools.enchantability",30);

        SwordAttackDamage = CONFIG.getOrDefault("sword.attackDamage",7);
        SwordAttackSpeed = CONFIG.getOrDefault("sword.attackSpeed",-1.4d);
        PickaxeAttackDamage = CONFIG.getOrDefault("pickaxe.attackDamage", 5);
        PickaxeAttackSpeed = CONFIG.getOrDefault("pickaxe.attackSpeed", -1.8d);
        AxeAttackDamage = CONFIG.getOrDefault("axe.attackDamage", 9);
        AxeAttackSpeed = CONFIG.getOrDefault("axe.attackSpeed", -2d);
        ShovelAttackDamage = CONFIG.getOrDefault("shovel.attackDamage", 5.5);
        ShovelAttackSpeed = CONFIG.getOrDefault("shovel.attackSpeed", -2d);
        HoeAttackDamage = CONFIG.getOrDefault("hoe.attackDamage", 0);
        HoeAttackSpeed = CONFIG.getOrDefault("hoe.attackSpeed", -1d);

        ArmorDurabilityMultiplier= CONFIG.getOrDefault("armor.durabilityMultiplier",74);
        ArmorEnchantability = CONFIG.getOrDefault("armor.enchantability",2);
        ArmorToughness = CONFIG.getOrDefault("armor.toughness", 4.5d);
        ArmorKnockbackResistance = CONFIG.getOrDefault("armor.knockbackResistance",0.2d);
        ArmorProtectionAmounts[0] = CONFIG.getOrDefault("armor.protectionAmounts.0",5);
        ArmorProtectionAmounts[1] = CONFIG.getOrDefault("armor.protectionAmounts.1",8);
        ArmorProtectionAmounts[2] = CONFIG.getOrDefault("armor.protectionAmounts.2",10);
        ArmorProtectionAmounts[3] = CONFIG.getOrDefault("armor.protectionAmounts.3",4);


        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}