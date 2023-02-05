package net.anvian.bedrockplus.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Sync;

@Config(name = "bedrockplus-config", wrapperName = "BedrockPlusConfig")
@Sync(Option.SyncMode.OVERRIDE_CLIENT)
public class ModConfigs {
    ///blocks
    public float BedrockImpureDeepslateHardness = 75.0f;
    public float BedrockImpureDeepslateResistance = 1200.0f;

    public float BlockOfImpureBedrockHardness = 75.0f;
    public float BlockOfImpureBedrockResistance = 1200.0f;
    //tools
    public int ToolDurability = 4062;
    public double ToolMiningSpeed = 10.0d;
    public double ToolAttackDamage = 5.0d;
    public int ToolMiningLevel = 4;
    public int ToolEnchantability = 30;
    public int SwordAttackDamage = 4;
    public double SwordAttackSpeed = -0.4d;
    public int PickaxeAttackDamage = 2;
    public double PickaxeAttackSpeed = -0.8d;
    public int AxeAttackDamage = 7;
    public double AxeAttackSpeed = -1d;
    public double ShovelAttackDamage = 2.5d;
    public double ShovelAttackSpeed = -1d;
    public int HoeAttackDamage = -3;
    public double HoeAttackSpeed = 2;
    //armor
    public int ArmorDurabilityMultiplier = 74;
    public int ArmorEnchantability = 2;
    public double ArmorToughness = 4.5d;
    public double ArmorKnockbackResistance = 0.2d;
    public int ArmorProtectionAmountsHelmet = 4;
    public int ArmorProtectionAmountsChestplate = 10;
    public int ArmorProtectionAmountsLeggings = 8;
    public int ArmorProtectionAmountsBoots = 5;
}