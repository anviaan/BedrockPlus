package net.anvian.bedrockplus.config; //

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class BedrockPlusConfig {
    ///blocks
    public static ForgeConfigSpec.DoubleValue BedrockImpureDeepslateHardness; // 75.0f
    public static ForgeConfigSpec.DoubleValue BedrockImpureDeepslateResistance; // 1200.0f

    public static ForgeConfigSpec.DoubleValue BlockOfImpureBedrockHardness; // 75.0f
    public static ForgeConfigSpec.DoubleValue BlockOfImpureBedrockResistance; // 1200.0f
    //tools
    public static ForgeConfigSpec.IntValue ToolDurability; // 4062
    public static ForgeConfigSpec.DoubleValue ToolMiningSpeed; // 10.0d
    public static ForgeConfigSpec.DoubleValue ToolAttackDamage; // 5.0d
    public static ForgeConfigSpec.IntValue ToolMiningLevel; // 4
    public static ForgeConfigSpec.IntValue ToolEnchantability; // 30
    public static ForgeConfigSpec.IntValue SwordAttackDamage; // 4
    public static ForgeConfigSpec.DoubleValue SwordAttackSpeed; // -0.4d
    public static ForgeConfigSpec.IntValue PickaxeAttackDamage; // 2
    public static ForgeConfigSpec.DoubleValue PickaxeAttackSpeed; // -0.8d
    public static ForgeConfigSpec.IntValue AxeAttackDamage; // 7
    public static ForgeConfigSpec.DoubleValue AxeAttackSpeed; // -1d
    public static ForgeConfigSpec.DoubleValue ShovelAttackDamage; // 2.5d
    public static  ForgeConfigSpec.DoubleValue ShovelAttackSpeed; // -1d
    public static ForgeConfigSpec.IntValue HoeAttackDamage; // -3
    public static ForgeConfigSpec.DoubleValue HoeAttackSpeed; // 2
    //armor
    public static ForgeConfigSpec.IntValue ArmorDurabilityMultiplier; // 74
    public static ForgeConfigSpec.IntValue ArmorEnchantability; // 2
    public static ForgeConfigSpec.DoubleValue ArmorToughness; // 4.5d
    public static ForgeConfigSpec.DoubleValue ArmorKnockbackResistance; // 0.2d
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsHelmet; // 4
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsChestplate; // 10
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsLeggings; // 8
    public static ForgeConfigSpec.IntValue ArmorProtectionAmountsBoots; // 5

    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec config;

    static {
        BedrockPlusConfig.init(builder);

        config = builder.build();
    }

    public static void init(ForgeConfigSpec.Builder config){
        config.push("Bedrock Plus Mod");

        ///blocks
        BedrockImpureDeepslateHardness = config.defineInRange("BedrockImpureDeepslateHardness", 75, 1, Double.MAX_VALUE); // 75.0f
        BedrockImpureDeepslateResistance = config.defineInRange("BedrockImpureDeepslateResistance", 1200, 1, Double.MAX_VALUE); // 1200.0f

        BlockOfImpureBedrockHardness = config.defineInRange("BlockOfImpureBedrockHardness", 75, 1, Double.MAX_VALUE); // 75.0f
        BlockOfImpureBedrockResistance = config.defineInRange("BlockOfImpureBedrockResistance", 1200, 1, Double.MAX_VALUE); // 1200.0f
        //tools
        ToolDurability = config.defineInRange("ToolDurability", 4062, 1, 10000); // 4062
        ToolMiningSpeed = config.defineInRange("ToolMiningSpeed", 10, 1, 10000.0); // 10.0d
        ToolAttackDamage = config.defineInRange("ToolAttackDamage", 5, 1, 10000.0); // 5.0d
        ToolMiningLevel = config.defineInRange("ToolMiningLevel", 4, 0, 4); // 4
        ToolEnchantability = config.defineInRange("ToolEnchantability", 30, 0, 10000); // 30
        SwordAttackDamage = config.defineInRange("SwordAttackDamage", 4, -10000, 10000); // 4
        SwordAttackSpeed = config.defineInRange("SwordAttackSpeed", -0.4, -10000, 10000); // -0.4d
        PickaxeAttackDamage = config.defineInRange("PickaxeAttackDamage", 2, -10000, 10000); // 2
        PickaxeAttackSpeed = config.defineInRange("PickaxeAttackSpeed", -0.8, -10000, 10000); // -0.8d
        AxeAttackDamage = config.defineInRange("AxeAttackDamage", 7, -10000, 10000); // 7
        AxeAttackSpeed = config.defineInRange("AxeAttackSpeed", -1, -10000, 10000.0); // -1d
        ShovelAttackDamage = config.defineInRange("ShovelAttackDamage", 2.5, -10000, 10000); // 2.5d
        ShovelAttackSpeed = config.defineInRange("ShovelAttackSpeed", -1, -10000.0, 10000.0); // -1d
        HoeAttackDamage = config.defineInRange("HoeAttackDamage", -3, -10000, 10000); // -3
        HoeAttackSpeed = config.defineInRange("HoeAttackSpeed", 2, -10000.0, 1000.0); // 2
        //armor
        ArmorDurabilityMultiplier = config.defineInRange("ArmorDurabilityMultiplier", 74, 0, 10000); // 74
        ArmorEnchantability = config.defineInRange("ArmorEnchantability", 2, 0, 10000); // 2
        ArmorToughness = config.defineInRange("ArmorToughness", 4.5, 0, 10000); // 4.5d
        ArmorKnockbackResistance = config.defineInRange("ArmorKnockbackResistance", 0.2, 0, 5); // 0.2d
        ArmorProtectionAmountsHelmet = config.defineInRange("ArmorProtectionAmountsHelmet", 4, 0, 10000); // 4
        ArmorProtectionAmountsChestplate = config.defineInRange("ArmorProtectionAmountsChestplate", 10, 0, 10000); // 10
        ArmorProtectionAmountsLeggings = config.defineInRange("ArmorProtectionAmountsLeggings", 8, 0, 10000); // 8
        ArmorProtectionAmountsBoots = config.defineInRange("ArmorProtectionAmountsBoots", 5, 0, 10000); // 5
    }
    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}