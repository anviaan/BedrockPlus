package net.anvian.bedrockplus;

import com.mojang.logging.LogUtils;
import net.anvian.bedrockplus.block.ModBlocks;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.ModItemGroup;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.slf4j.Logger;

@Mod(BedrockPlusMod.MOD_ID)
public class BedrockPlusMod
{
    public static final String MOD_ID = "bedrockplus";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BedrockPlusMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //config
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ModConfigs.SERVER_CONFIG);
        ModConfigs.loadConfig(ModConfigs.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-config.toml"));

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::addCreative);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from BedrockPlus!");
    }
    private void addCreative(CreativeModeTabEvent.BuildContents even){
        if (even.getTab() == ModItemGroup.BEDROCKPLUS){
            even.accept(ModBlocks.IMPURE_BEDROCK);
            even.accept(ModBlocks.IMPURE_BEDROCK_BLOCK);
            even.accept(ModItems.IMPURE_BEDROCK_INGOT);
            even.accept(ModItems.IMPURE_BEDROCK_SCRAP);
            even.accept(ModItems.IMPUREBEDROCK_SWORD);
            even.accept(ModItems.IMPUREBEDROCK_PICKAXE);
            even.accept(ModItems.IMPUREBEDROCK_AXE);
            even.accept(ModItems.IMPUREBEDROCK_SHOVEL);
            even.accept(ModItems.IMPUREBEDROCK_HOE);
            even.accept(ModItems.IMPURE_BEDROCK_HELMET);
            even.accept(ModItems.IMPURE_BEDROCK_CHESTPLATE);
            even.accept(ModItems.IMPURE_BEDROCK_LEGGINGS);
            even.accept(ModItems.IMPURE_BEDROCK_BOOTS);
        }
    }
}
