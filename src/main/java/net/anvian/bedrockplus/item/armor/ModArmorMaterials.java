package net.anvian.bedrockplus.item.armor;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> IMPUREBEDROCK;

    static {
        IMPUREBEDROCK = register("impurebedrock", createMap(
                        new int[]{
                                ModConfigs.armorProtectionAmountsHelmet,
                                ModConfigs.armorProtectionAmountsChestplate,
                                ModConfigs.armorProtectionAmountsLeggings,
                                ModConfigs.armorProtectionAmountsBoots,
                                ModConfigs.armorProtectionAmountsBody
                        }),
                ModConfigs.armorEnchantability,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                (float) ModConfigs.armorToughness, (float) ModConfigs.armorKnockbackResistance,
                () -> Ingredient.of(ModItems.IMPURE_BEDROCK_INGOT.get()));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String string, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, ResourceLocation.fromNamespaceAndPath(BedrockPlusMod.MOD_ID, string), new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(BedrockPlusMod.MOD_ID, string))), f, g));
    }
}
