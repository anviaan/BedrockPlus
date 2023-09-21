package net.anvian.bedrockplus.config;


import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    public static ForgeConfigSpec SERVER_CONFIG;

    ///blocks
    public static ForgeConfigSpec.DoubleValue BedrockImpureDeepslateHardness; // 45.0f
    public static ForgeConfigSpec.DoubleValue BedrockImpureDeepslateResistance; // 1200.0f

    public static ForgeConfigSpec.DoubleValue BlockOfImpureBedrockHardness; // 75.0f
    public static ForgeConfigSpec.DoubleValue BlockOfImpureBedrockResistance; // 1200.0f

    //tools
    public static ForgeConfigSpec.IntValue ToolDurability; // 3046
    public static ForgeConfigSpec.DoubleValue ToolMiningSpeed; // 13.0d
    public static ForgeConfigSpec.DoubleValue ToolAttackDamage; // 6.0d
    public static ForgeConfigSpec.IntValue ToolMiningLevel; // 4
    public static ForgeConfigSpec.IntValue ToolEnchantability; // 22

    public static ForgeConfigSpec.IntValue SwordAttackDamage; // 5
    public static ForgeConfigSpec.DoubleValue SwordAttackSpeed; // -2.4d

    public static ForgeConfigSpec.IntValue PickaxeAttackDamage; // 2
    public static ForgeConfigSpec.DoubleValue PickaxeAttackSpeed; // -2.8d

    public static ForgeConfigSpec.IntValue AxeAttackDamage; // 8
    public static ForgeConfigSpec.DoubleValue AxeAttackSpeed; // -3d

    public static ForgeConfigSpec.DoubleValue ShovelAttackDamage; // 2.75d
    public static  ForgeConfigSpec.DoubleValue ShovelAttackSpeed; // -3d

    public static ForgeConfigSpec.IntValue HoeAttackDamage; // -5
    public static ForgeConfigSpec.DoubleValue HoeAttackSpeed; // 0

    //armor
    public static ForgeConfigSpec.IntValue ArmorDurabilityMultiplier; // 55
    public static ForgeConfigSpec.IntValue ArmorEnchantability; // 22
    public static ForgeConfigSpec.DoubleValue ArmorToughness; // 4d
    public static ForgeConfigSpec.DoubleValue ArmorKnockbackResistance; // 0.2d
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsHelmet; // 4
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsChestplate; // 9
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsLeggings; // 7
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsBoots; // 4
    public static ForgeConfigSpec.BooleanValue ArmorShowParticle; //false
    public static ForgeConfigSpec.BooleanValue ArmorShowIcon; //false

    static {
        final ForgeConfigSpec.Builder config = new ForgeConfigSpec.Builder();

        config.push("Bedrock Plus Mod");

        ///blocks
        BedrockImpureDeepslateHardness = config.defineInRange("BedrockImpureDeepslateHardness", 45, 1, Double.MAX_VALUE);
        BedrockImpureDeepslateResistance = config.defineInRange("BedrockImpureDeepslateResistance", 1200, 1, Double.MAX_VALUE);

        BlockOfImpureBedrockHardness = config.defineInRange("BlockOfImpureBedrockHardness", 75, 1, Double.MAX_VALUE);
        BlockOfImpureBedrockResistance = config.defineInRange("BlockOfImpureBedrockResistance", 1200, 1, Double.MAX_VALUE);
        //tools
        ToolDurability = config.defineInRange("ToolDurability", 3046, 1, 10000);
        ToolMiningSpeed = config.defineInRange("ToolMiningSpeed", 13, 1, 10000.0);
        ToolAttackDamage = config.defineInRange("ToolAttackDamage", 6, 1, 10000.0);
        ToolMiningLevel = config.defineInRange("ToolMiningLevel", 4, 0, 4);
        ToolEnchantability = config.defineInRange("ToolEnchantability", 22, 0, 10000);

        SwordAttackDamage = config.defineInRange("SwordAttackDamage", 5, -10000, 10000);
        SwordAttackSpeed = config.defineInRange("SwordAttackSpeed", -2.4, -10000, 10000);

        PickaxeAttackDamage = config.defineInRange("PickaxeAttackDamage", 2, -10000, 10000);
        PickaxeAttackSpeed = config.defineInRange("PickaxeAttackSpeed", -2.8, -10000, 10000);

        AxeAttackDamage = config.defineInRange("AxeAttackDamage", 8, -10000, 10000);
        AxeAttackSpeed = config.defineInRange("AxeAttackSpeed", -3, -10000, 10000.0);

        ShovelAttackDamage = config.defineInRange("ShovelAttackDamage", 2.75, -10000, 10000);
        ShovelAttackSpeed = config.defineInRange("ShovelAttackSpeed", -3, -10000.0, 10000.0);

        HoeAttackDamage = config.defineInRange("HoeAttackDamage", -5, -10000, 10000);
        HoeAttackSpeed = config.defineInRange("HoeAttackSpeed", 0, -10000.0, 1000.0);
        //armor
        ArmorDurabilityMultiplier = config.defineInRange("ArmorDurabilityMultiplier", 55, 0, 10000);
        ArmorEnchantability = config.defineInRange("ArmorEnchantability", 22, 0, 10000);
        ArmorToughness = config.defineInRange("ArmorToughness", 4d, 0, 10000);
        ArmorKnockbackResistance = config.defineInRange("ArmorKnockbackResistance", 0.2, 0, 5.0);
        ArmorProtectionAmountsHelmet = config.defineInRange("ArmorProtectionAmountsHelmet", 4, 0, 10000);
        ArmorProtectionAmountsChestplate = config.defineInRange("ArmorProtectionAmountsChestplate", 9, 0, 10000);
        ArmorProtectionAmountsLeggings = config.defineInRange("ArmorProtectionAmountsLeggings", 7, 0, 10000);
        ArmorProtectionAmountsBoots = config.defineInRange("ArmorProtectionAmountsBoots", 4, 0, 10000);
        ArmorShowParticle = config.define("ArmorShowParticle", false);
        ArmorShowIcon = config.define("ArmorShowIcon", false);

        config.pop();

        SERVER_CONFIG = config.build();
    }
    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        config.load();
        spec.setConfig(config);
    }
}