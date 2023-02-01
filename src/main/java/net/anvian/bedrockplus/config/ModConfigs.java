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
    public int SwordAttackDamage = 7;
    public double SwordAttackSpeed = -1.4d;
    public int PickaxeAttackDamage = 5;
    public double PickaxeAttackSpeed = -1.8d;
    public int AxeAttackDamage = 9;
    public double AxeAttackSpeed = -2d;
    public double ShovelAttackDamage = 5.5;
    public double ShovelAttackSpeed = -2d;
    public int HoeAttackDamage = 0;
    public double HoeAttackSpeed = -1d;
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