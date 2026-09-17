package net.anvian.bedrockplus.core.item.armor;

import com.google.common.collect.ImmutableMap;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.item.ModMaterials;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.Equippable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class ModArmorItem extends Item {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModMaterials.Armor.IMPURE_BEDROCK,
                            new MobEffectInstance(MobEffects.RESISTANCE, 40, 0, false, ModConfigs.armorShowParticle, ModConfigs.armorShowIcon)).build();

    public ModArmorItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(@NotNull ItemStack itemStack, ServerLevel serverLevel, @NotNull Entity entity, @Nullable EquipmentSlot equipmentSlot) {
        if (!serverLevel.isClientSide() && entity instanceof Player player) {
            if (hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            } else {
                clearArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            } else {
                player.removeEffect(mapStatusEffect.getEffect());
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        if (hasCorrectArmorOn(mapArmorMaterial, player)) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private void clearArmorEffects(Player player) {
        for (MobEffectInstance effect : MATERIAL_TO_EFFECT_MAP.values()) {
            player.removeEffect(effect.getEffect());
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);

        Equippable equippableComponentBoots = boots.getComponents().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentLeggings = leggings.getComponents().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentBreastplate = chestplate.getComponents().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentHelmet = helmet.getComponents().get(DataComponents.EQUIPPABLE);

        if (equippableComponentBoots == null || equippableComponentLeggings == null ||
            equippableComponentBreastplate == null || equippableComponentHelmet == null) {
            return false;
        }

        return equippableComponentBoots.assetId().get().equals(material.assetId()) &&
               equippableComponentLeggings.assetId().get().equals(material.assetId()) &&
               equippableComponentBreastplate.assetId().get().equals(material.assetId()) &&
               equippableComponentHelmet.assetId().get().equals(material.assetId());
    }
}
