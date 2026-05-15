package net.anvian.bedrockplus.core.util;

import net.anvian.bedrockplus.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> IMPURE_BEDROCK = createTag(Identifier.fromNamespaceAndPath(Constants.MOD_ID, "impure_bedrock"));

        private static TagKey<Item> createTag(Identifier name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
