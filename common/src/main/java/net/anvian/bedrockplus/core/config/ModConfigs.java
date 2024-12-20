package net.anvian.bedrockplus.core.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    ///blocks
    private static final ForgeConfigSpec.DoubleValue BedrockImpureDeepslateHardness = BUILDER.defineInRange("BedrockImpureDeepslateHardness", 45, 1, Double.MAX_VALUE);
    private static final ForgeConfigSpec.DoubleValue BedrockImpureDeepslateResistance = BUILDER.defineInRange("BedrockImpureDeepslateResistance", 1200, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue BlockOfImpureBedrockHardness = BUILDER.defineInRange("BlockOfImpureBedrockHardness", 75, 1, Double.MAX_VALUE);
    private static final ForgeConfigSpec.DoubleValue BlockOfImpureBedrockResistance = BUILDER.defineInRange("BlockOfImpureBedrockResistance", 1200, 1, Double.MAX_VALUE);

    //tools
    private static final ForgeConfigSpec.IntValue ToolDurability = BUILDER.defineInRange("ToolDurability", 3046, 1, 10000);
    private static final ForgeConfigSpec.DoubleValue ToolMiningSpeed = BUILDER.defineInRange("ToolMiningSpeed", 13, 1, 10000.0);
    private static final ForgeConfigSpec.DoubleValue ToolAttackDamage = BUILDER.defineInRange("ToolAttackDamage", 6, 1, 10000.0);
    private static final ForgeConfigSpec.IntValue ToolEnchantability = BUILDER.defineInRange("ToolEnchantability", 22, 0, 10000);

    private static final ForgeConfigSpec.IntValue SwordAttackDamage = BUILDER.defineInRange("SwordAttackDamage", 5, -10000, 10000);
    private static final ForgeConfigSpec.DoubleValue SwordAttackSpeed = BUILDER.defineInRange("SwordAttackSpeed", -2.4, -10000, 10000);

    private static final ForgeConfigSpec.IntValue PickaxeAttackDamage = BUILDER.defineInRange("PickaxeAttackDamage", 2, -10000, 10000);
    private static final ForgeConfigSpec.DoubleValue PickaxeAttackSpeed = BUILDER.defineInRange("PickaxeAttackSpeed", -2.8, -10000, 10000);

    private static final ForgeConfigSpec.IntValue AxeAttackDamage = BUILDER.defineInRange("AxeAttackDamage", 8, -10000, 10000);
    private static final ForgeConfigSpec.DoubleValue AxeAttackSpeed = BUILDER.defineInRange("AxeAttackSpeed", -3, -10000, 10000.0);

    private static final ForgeConfigSpec.DoubleValue ShovelAttackDamage = BUILDER.defineInRange("ShovelAttackDamage", 2.75, -10000, 10000);
    private static final ForgeConfigSpec.DoubleValue ShovelAttackSpeed = BUILDER.defineInRange("ShovelAttackSpeed", -3, -10000.0, 10000.0);

    private static final ForgeConfigSpec.IntValue HoeAttackDamage = BUILDER.defineInRange("HoeAttackDamage", -5, -10000, 10000);
    private static final ForgeConfigSpec.DoubleValue HoeAttackSpeed = BUILDER.defineInRange("HoeAttackSpeed", 0, -10000.0, 1000.0);

    //armor
    private static final ForgeConfigSpec.IntValue ArmorEnchantability = BUILDER.defineInRange("ArmorEnchantability", 22, 0, 10000);
    private static final ForgeConfigSpec.DoubleValue ArmorToughness = BUILDER.defineInRange("ArmorToughness", 4d, 0, 10000);
    private static final ForgeConfigSpec.DoubleValue ArmorKnockbackResistance = BUILDER.defineInRange("ArmorKnockbackResistance", 0.2, 0, 5.0);
    private static final ForgeConfigSpec.IntValue ArmorProtectionAmountsBody = BUILDER.defineInRange("ArmorProtectionAmountsBody", 9, 0, 10000);
    private static final ForgeConfigSpec.IntValue ArmorProtectionAmountsHelmet = BUILDER.defineInRange("ArmorProtectionAmountsHelmet", 4, 0, 10000);
    private static final ForgeConfigSpec.IntValue ArmorProtectionAmountsChestplate = BUILDER.defineInRange("ArmorProtectionAmountsChestplate", 9, 0, 10000);
    private static final ForgeConfigSpec.IntValue ArmorProtectionAmountsLeggings = BUILDER.defineInRange("ArmorProtectionAmountsLeggings", 7, 0, 10000);
    private static final ForgeConfigSpec.IntValue ArmorProtectionAmountsBoots = BUILDER.defineInRange("ArmorProtectionAmountsBoots", 4, 0, 10000);
    private static final ForgeConfigSpec.BooleanValue ArmorShowParticle = BUILDER.define("ArmorShowParticle", false);
    private static final ForgeConfigSpec.BooleanValue ArmorShowIcon = BUILDER.define("ArmorShowIcon", false);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static double bedrockImpureDeepslateHardness;
    public static double bedrockImpureDeepslateResistance;
    public static double blockOfImpureBedrockHardness;
    public static double blockOfImpureBedrockResistance;
    public static int toolDurability;
    public static double toolMiningSpeed;
    public static double toolAttackDamage;
    public static int toolEnchantability;
    public static int swordAttackDamage;
    public static double swordAttackSpeed;
    public static int pickaxeAttackDamage;
    public static double pickaxeAttackSpeed;
    public static int axeAttackDamage;
    public static double axeAttackSpeed;
    public static double shovelAttackDamage;
    public static double shovelAttackSpeed;
    public static int hoeAttackDamage;
    public static double hoeAttackSpeed;
    public static int armorEnchantability;
    public static double armorToughness;
    public static double armorKnockbackResistance;
    public static int armorProtectionAmountsBody;
    public static int armorProtectionAmountsHelmet;
    public static int armorProtectionAmountsChestplate;
    public static int armorProtectionAmountsLeggings;
    public static int armorProtectionAmountsBoots;
    public static boolean armorShowParticle;
    public static boolean armorShowIcon;

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);

        bedrockImpureDeepslateHardness = BedrockImpureDeepslateHardness.get();
        bedrockImpureDeepslateResistance = BedrockImpureDeepslateResistance.get();
        blockOfImpureBedrockHardness = BlockOfImpureBedrockHardness.get();
        blockOfImpureBedrockResistance = BlockOfImpureBedrockResistance.get();

        toolDurability = ToolDurability.get();
        toolMiningSpeed = ToolMiningSpeed.get();
        toolAttackDamage = ToolAttackDamage.get();
        toolEnchantability = ToolEnchantability.get();

        swordAttackDamage = SwordAttackDamage.get();
        swordAttackSpeed = SwordAttackSpeed.get();

        pickaxeAttackDamage = PickaxeAttackDamage.get();
        pickaxeAttackSpeed = PickaxeAttackSpeed.get();

        axeAttackDamage = AxeAttackDamage.get();
        axeAttackSpeed = AxeAttackSpeed.get();

        shovelAttackDamage = ShovelAttackDamage.get();
        shovelAttackSpeed = ShovelAttackSpeed.get();

        hoeAttackDamage = HoeAttackDamage.get();
        hoeAttackSpeed = HoeAttackSpeed.get();

        armorEnchantability = ArmorEnchantability.get();
        armorToughness = ArmorToughness.get();
        armorKnockbackResistance = ArmorKnockbackResistance.get();

        armorProtectionAmountsBody = ArmorProtectionAmountsBody.get();
        armorProtectionAmountsHelmet = ArmorProtectionAmountsHelmet.get();
        armorProtectionAmountsChestplate = ArmorProtectionAmountsChestplate.get();
        armorProtectionAmountsLeggings = ArmorProtectionAmountsLeggings.get();
        armorProtectionAmountsBoots = ArmorProtectionAmountsBoots.get();
        armorShowParticle = ArmorShowParticle.get();
        armorShowIcon = ArmorShowIcon.get();
    }
}
