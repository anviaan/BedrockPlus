package net.anvian.bedrockplus.core.config;

import net.anvian.anvianslib.config.Config;
import org.slf4j.Logger;

public class ModConfigs extends Config<ModConfigs.BedrockPlusConfig> {
    public ModConfigs(Class<BedrockPlusConfig> configClass, Logger logger) {
        super(configClass, logger);
    }

    @Override
    protected BedrockPlusConfig createDefaultConfig() {
        return new BedrockPlusConfig();
    }

    public static class BedrockPlusConfig {
        public double bedrockImpureDeepslateHardness;
        public double bedrockImpureDeepslateResistance;
        public double blockOfImpureBedrockHardness;
        public double blockOfImpureBedrockResistance;
        public int toolDurability;
        public double toolMiningSpeed;
        public double toolAttackDamage;
        public int toolEnchantability;
        public int swordAttackDamage;
        public double swordAttackSpeed;
        public int pickaxeAttackDamage;
        public double pickaxeAttackSpeed;
        public int axeAttackDamage;
        public double axeAttackSpeed;
        public double shovelAttackDamage;
        public double shovelAttackSpeed;
        public int hoeAttackDamage;
        public double hoeAttackSpeed;
        public int armorDurability;
        public int armorEnchantability;
        public double armorToughness;
        public double armorKnockbackResistance;
        public int armorProtectionAmountsBody;
        public int armorProtectionAmountsHelmet;
        public int armorProtectionAmountsChestplate;
        public int armorProtectionAmountsLeggings;
        public int armorProtectionAmountsBoots;
        public boolean armorShowParticle;
        public boolean armorShowIcon;

        public BedrockPlusConfig() {
            bedrockImpureDeepslateHardness = 45.0;
            bedrockImpureDeepslateResistance = 1200.0;
            blockOfImpureBedrockHardness = 75.0;
            blockOfImpureBedrockResistance = 1200.0;
            toolDurability = 3046;
            toolMiningSpeed = 13.0;
            toolAttackDamage = 6.0;
            toolEnchantability = 22;
            swordAttackDamage = 5;
            swordAttackSpeed = -2.4;
            pickaxeAttackDamage = 2;
            pickaxeAttackSpeed = -2.8;
            axeAttackDamage = 8;
            axeAttackSpeed = -3.0;
            shovelAttackDamage = 2.75;
            shovelAttackSpeed = -3.0;
            hoeAttackDamage = -5;
            hoeAttackSpeed = 0.0;
            armorDurability = 47;
            armorEnchantability = 22;
            armorToughness = 4.0;
            armorKnockbackResistance = 0.2;
            armorProtectionAmountsBody = 9;
            armorProtectionAmountsHelmet = 4;
            armorProtectionAmountsChestplate = 9;
            armorProtectionAmountsLeggings = 7;
            armorProtectionAmountsBoots = 4;
            armorShowParticle = false;
            armorShowIcon = false;
        }
    }
}
