package net.anvian.bedrockplus;

import com.mojang.logging.LogUtils;
import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.config.ModCommonConfigs;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
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

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCommonConfigs.SPEC, "bedrockplus-common.toml");

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
