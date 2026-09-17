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
        syncFields(config);
    }

    private static void syncFields(BedrockPlusConfig config) {
        bedrockImpureDeepslateHardness = config.bedrockImpureDeepslateHardness;
        bedrockImpureDeepslateResistance = config.bedrockImpureDeepslateResistance;
        blockOfImpureBedrockHardness = config.blockOfImpureBedrockHardness;
        blockOfImpureBedrockResistance = config.blockOfImpureBedrockResistance;
        toolDurability = config.toolDurability;
        toolMiningSpeed = config.toolMiningSpeed;
        toolAttackDamage = config.toolAttackDamage;
        toolEnchantability = config.toolEnchantability;
        swordAttackDamage = config.swordAttackDamage;
        swordAttackSpeed = config.swordAttackSpeed;
        pickaxeAttackDamage = config.pickaxeAttackDamage;
        pickaxeAttackSpeed = config.pickaxeAttackSpeed;
        axeAttackDamage = config.axeAttackDamage;
        axeAttackSpeed = config.axeAttackSpeed;
        shovelAttackDamage = config.shovelAttackDamage;
        shovelAttackSpeed = config.shovelAttackSpeed;
        hoeAttackDamage = config.hoeAttackDamage;
        hoeAttackSpeed = config.hoeAttackSpeed;
        armorEnchantability = config.armorEnchantability;
        armorToughness = config.armorToughness;
        armorKnockbackResistance = config.armorKnockbackResistance;
        armorProtectionAmountsBody = config.armorProtectionAmountsBody;
        armorProtectionAmountsHelmet = config.armorProtectionAmountsHelmet;
        armorProtectionAmountsChestplate = config.armorProtectionAmountsChestplate;
        armorProtectionAmountsLeggings = config.armorProtectionAmountsLeggings;
        armorProtectionAmountsBoots = config.armorProtectionAmountsBoots;
        armorShowParticle = config.armorShowParticle;
        armorShowIcon = config.armorShowIcon;
    }

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
