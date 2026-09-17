package net.anvian.bedrockplus.core.config;

import net.anvian.anvianslib.config.Config;
import net.anvian.bedrockplus.Constants;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ModConfigs extends Config<ModConfigs.BedrockPlusConfig> {
    public ModConfigs(Class<BedrockPlusConfig> configClass, Logger logger) {
        super(configClass, logger);
    }

    @Override
    public void initialize(File configDirectory, String modId) {
        try {
            Files.createDirectories(configDirectory.toPath());
        } catch (IOException | SecurityException exception) {
            Constants.LOG.error("Unable to create configuration directory {}", configDirectory, exception);
        }
        super.initialize(configDirectory, modId);
    }

    @Override
    protected BedrockPlusConfig createDefaultConfig() {
        return new BedrockPlusConfig();
    }

    @Override
    public void loadConfig() {
        if (configFile != null) {
            ConfigMigration.Migration<BedrockPlusConfig> migration =
                    ConfigMigration.migrate(configFile, BedrockPlusConfig.class, Constants.LOG);
            if (migration != null) {
                config = migration.config();
                saveConfig();
                if (configFile.exists()) {
                    ConfigMigration.backupLegacyFiles(migration.legacyFiles(), Constants.LOG);
                }
            } else {
                ConfigMigration.backupIfInvalidJson(configFile, BedrockPlusConfig.class, Constants.LOG);
                super.loadConfig();
            }
        } else {
            super.loadConfig();
        }

        if (config == null) {
            config = createDefaultConfig();
            saveConfig();
        }
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
        public float spearAttackDuration;
        public float spearDamageMultiplier;
        public float spearDelay;
        public float spearDismountTime;
        public float spearDismountThreshold;
        public float spearKnockbackTime;
        public float spearKnockbackThreshold;
        public float spearDamageTime;
        public float spearDamageThreshold;
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
            toolAttackDamage = 5.0;
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
            spearAttackDuration = 1.15f;
            spearDamageMultiplier = 1.2f;
            spearDelay = 0.4f;
            spearDismountTime = 2.5f;
            spearDismountThreshold = 9.0f;
            spearKnockbackTime = 5.5f;
            spearKnockbackThreshold = 5.1f;
            spearDamageTime = 8.75f;
            spearDamageThreshold = 4.6f;
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
