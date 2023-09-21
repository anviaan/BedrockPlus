package net.anvian.bedrockplus.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Sync;

@SuppressWarnings("unused")
@Config(name = "bedrockplus-config", wrapperName = "BedrockPlusConfig")
@Sync(Option.SyncMode.OVERRIDE_CLIENT)
public class ModConfigs {
    ///blocks
    public float BedrockImpureDeepslateHardness = 45.0f;
    public float BedrockImpureDeepslateResistance = 1200.0f;

    public float BlockOfImpureBedrockHardness = 75.0f;
    public float BlockOfImpureBedrockResistance = 1200.0f;

    //tools
    public int ToolDurability = 3046;
    public double ToolMiningSpeed = 13.0d;
    public double ToolAttackDamage = 6.0d;
    public int ToolMiningLevel = 4;
    public int ToolEnchantability = 22;

    public int SwordAttackDamage = 5;
    public double SwordAttackSpeed = -2.4;

    public int PickaxeAttackDamage = 2;
    public double PickaxeAttackSpeed = -2.8d;

    public int AxeAttackDamage = 8;
    public double AxeAttackSpeed = -3d;

    public double ShovelAttackDamage = 2.75d;
    public double ShovelAttackSpeed = -3d;

    public int HoeAttackDamage = -5;
    public double HoeAttackSpeed = 0;

    //armor
    public int ArmorDurabilityMultiplier = 55;
    public int ArmorEnchantability = 22;
    public double ArmorToughness = 4d;
    public double ArmorKnockbackResistance = 0.2d;
    public int ArmorProtectionAmountsHelmet = 4;
    public int ArmorProtectionAmountsChestplate = 9;
    public int ArmorProtectionAmountsLeggings = 7;
    public int ArmorProtectionAmountsBoots = 4;
    public boolean ArmorShowParticle = false;
    public boolean ArmorShowIcon = false;
}