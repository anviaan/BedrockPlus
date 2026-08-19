package net.anvian.bedrockplus.core.util;

import net.anvian.anvianslib.util.RegistryUtil;
import net.anvian.bedrockplus.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> IMPURE_BEDROCK = RegistryUtil.tag(Registries.ITEM, Constants.MOD_ID, "impure_bedrock");
    }
}
