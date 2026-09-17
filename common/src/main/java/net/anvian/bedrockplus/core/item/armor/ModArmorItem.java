package net.anvian.bedrockplus.core.item.armor;

import com.google.common.collect.ImmutableMap;
import net.anvian.bedrockplus.core.config.ModConfigs;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModArmorMaterials.IMPUREBEDROCK.value(),
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0, false, ModConfigs.armorShowParticle, ModConfigs.armorShowIcon)).build();

    public ModArmorItem(Holder<ArmorMaterial> p_329451_, Type p_266831_, Properties p_40388_) {
        super(p_329451_, p_266831_, p_40388_);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int $$3, boolean $$4) {
        if (!level.isClientSide() && entity instanceof Player player) {
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
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return isArmorMaterial(helmet, material) && isArmorMaterial(breastplate, material) &&
                isArmorMaterial(leggings, material) && isArmorMaterial(boots, material);
    }

    private boolean isArmorMaterial(ItemStack stack, ArmorMaterial material) {
        return (stack.getItem() instanceof ArmorItem) && ((ArmorItem) stack.getItem()).getMaterial().value() == material;
    }
}
