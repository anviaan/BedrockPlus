package net.anvian.config;

import com.mojang.datafixers.util.Pair;
import net.anvian.bedrockplus.BedrockPlusMod;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int DURABILITY;
    public static double MININGSPEED;
    public static double ATTACKDAMAGE;
    public static int MININGLEVEL;
    public static int ENCHANTABILITY;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(BedrockPlusMod.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("impurebedrock.tool.durability","4062"),"int");
        configs.addKeyValuePair(new Pair<>("impurebedrock.tool.miningSpeed","10.0d"),"double");
        configs.addKeyValuePair(new Pair<>("bedrockplus.tool.attackDamage", "5.0d"),"double");
        configs.addKeyValuePair(new Pair<>("bedrockplus.tool.miningLevel","4"), "int");
        configs.addKeyValuePair(new Pair<>("bedrockplus.tool.enchantability","30"),"int");
    }

    private static void assignConfigs() {
        DURABILITY = CONFIG.getOrDefault("impurebedrock.tool.durability",4062);
        MININGSPEED = CONFIG.getOrDefault("impurebedrock.tool.miningSpeed",10.0d);
        ATTACKDAMAGE = CONFIG.getOrDefault("bedrockplus.tool.attackDamage",5.0d);
        MININGLEVEL = CONFIG.getOrDefault("bedrockplus.tool.miningLevel",4);
        ENCHANTABILITY = CONFIG.getOrDefault("bedrockplus.tool.enchantability",30);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}