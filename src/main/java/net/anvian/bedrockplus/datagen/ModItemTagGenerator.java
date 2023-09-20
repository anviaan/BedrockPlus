package net.anvian.bedrockplus.datagen;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, BedrockPlusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.IMPURE_BEDROCK_HELMET.get(), ModItems.IMPURE_BEDROCK_CHESTPLATE.get(),
                        ModItems.IMPURE_BEDROCK_LEGGINGS.get(), ModItems.IMPURE_BEDROCK_BOOTS.get());
    }
}
