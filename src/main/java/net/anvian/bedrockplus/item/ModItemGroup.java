package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            BedrockPlusMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> BEDROCKPLUS = CREATIVE_MODE_TAB.register("impure_bedrock", () ->
            CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.IMPURE_BEDROCK_INGOT.get()))
                    .title(Component.translatable("itemGroup.impure_bedrock"))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
