package net.anvian.bedrockplus;

import com.mojang.logging.LogUtils;
import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.item.ModItems;
import net.anvian.bedrockplus.world.feature.ModConfiguredFeatures;
import net.anvian.bedrockplus.world.feature.ModPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BedrockPlusMod.MOD_ID)
public class BedrockPlusMod
{
    public static final String MOD_ID = "bedrockplus";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BedrockPlusMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from BedrockPlus!");
    }
}
