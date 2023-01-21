package net.anvian.bedrockplus.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ModConfigs {

    @MidnightConfig.Comment(centered = true) public static MidnightConfig.Comment warning;
    @MidnightConfig.Entry
    public static int ToolDurability = 4062;
    @MidnightConfig.Entry
    public static double ToolMiningSpeed = 10.0d;
    @MidnightConfig.Entry
    public static double ToolAttackDamage = 5.0d;
    @MidnightConfig.Entry
    public static int ToolMiningLevel = 4;
    @MidnightConfig.Entry
    public static int ToolEnchantability = 30;

    @MidnightConfig.Entry
    public static int SwordAttackDamage = 7;
    @MidnightConfig.Entry
    public static double SwordAttackSpeed = -1.4d;
    @MidnightConfig.Entry
    public static int PickaxeAttackDamage = 5;
    @MidnightConfig.Entry
    public static double PickaxeAttackSpeed = -1.8d;
    @MidnightConfig.Entry
    public static int AxeAttackDamage = 9;
    @MidnightConfig.Entry
    public static double AxeAttackSpeed = -2d;
    @MidnightConfig.Entry
    public static double ShovelAttackDamage = 5.5;
    @MidnightConfig.Entry
    public static double ShovelAttackSpeed = -2d;
    @MidnightConfig.Entry
    public static int HoeAttackDamage = 0;
    @MidnightConfig.Entry
    public static double HoeAttackSpeed = -1d;

    @MidnightConfig.Entry
    public static int ArmorDurabilityMultiplier = 74;
    @MidnightConfig.Entry
    public static int ArmorEnchantability = 2;
    @MidnightConfig.Entry
    public static double ArmorToughness = 4.5d;
    @MidnightConfig.Entry
    public static double ArmorKnockbackResistance = 0.2d;
    @MidnightConfig.Entry
    public static int ArmorProtectionAmounts4 = 4;
    @MidnightConfig.Entry
    public static int ArmorProtectionAmounts3 = 10;
    @MidnightConfig.Entry
    public static int ArmorProtectionAmounts2 = 8;
    @MidnightConfig.Entry
    public static int ArmorProtectionAmounts1 = 5;
}