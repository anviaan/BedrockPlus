package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BedrockPlusMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroup {
    public static CreativeModeTab BEDROCKPLUS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BEDROCKPLUS = event.registerCreativeModeTab(new ResourceLocation(BedrockPlusMod.MOD_ID, "sculkhorn"),
                builder -> builder
                        .icon(()-> new ItemStack(ModItems.IMPURE_BEDROCK_INGOT.get()))
                        .title(Component.translatable("itemGroup.impure_bedrock"))
                        .build());
    }
}
