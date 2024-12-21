package net.anvian.bedrockplus.core.item.armor;

import com.google.common.collect.ImmutableMap;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.anvian.bedrockplus.core.item.ModMaterials;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
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
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        Equippable equippableComponentBoots = boots.components().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentLeggings = leggings.components().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentBreastplate = breastplate.components().get(DataComponents.EQUIPPABLE);
        Equippable equippableComponentHelmet = helmet.components().get(DataComponents.EQUIPPABLE);

        return equippableComponentBoots.model().get().equals(material.modelId()) && equippableComponentLeggings.model().get().equals(material.modelId()) &&
                equippableComponentBreastplate.model().get().equals(material.modelId()) && equippableComponentHelmet.model().get().equals(material.modelId());
    }
}
