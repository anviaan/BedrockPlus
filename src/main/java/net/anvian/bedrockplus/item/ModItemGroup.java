package net.anvian.bedrockplus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab BEDROCKPLUS  = new CreativeModeTab("impure_bedrock") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IMPURE_BEDROCK_INGOT.get());
        }
    };
}
