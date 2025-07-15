package net.anvian.bedrockplus.core.item.armor;

import com.google.common.collect.ImmutableMap;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.item.ModMaterials;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModMaterials.Armor.IMPURE_BEDROCK,
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0, false, ModConfigs.armorShowParticle, ModConfigs.armorShowIcon)).build();

    public ModArmorItem(ArmorMaterial armorMaterial, ArmorType armorType, Properties properties) {
        super(armorMaterial, armorType, properties);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int $$3, boolean $$4) {
        if (!level.isClientSide()) {
            if (hasFullSuitOfArmorOn((Player) entity)) {
                evaluateArmorEffects((Player) entity);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if (hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getItem(EquipmentSlot.FEET.getIndex());
        ItemStack leggings = player.getInventory().getItem(EquipmentSlot.LEGS.getIndex());
        ItemStack chestplate = player.getInventory().getItem(EquipmentSlot.CHEST.getIndex());
        ItemStack helmet = player.getInventory().getItem(EquipmentSlot.HEAD.getIndex());

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        ItemStack boots = player.getInventory().getItem(EquipmentSlot.FEET.getIndex());
        ItemStack leggings = player.getInventory().getItem(EquipmentSlot.LEGS.getIndex());
        ItemStack chestplate = player.getInventory().getItem(EquipmentSlot.CHEST.getIndex());
        ItemStack helmet = player.getInventory().getItem(EquipmentSlot.HEAD.getIndex());

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
