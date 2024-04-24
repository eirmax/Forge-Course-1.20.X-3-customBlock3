package net.kaupenjoe.mccourse.util;

import net.kaupenjoe.mccourse.BetterUpdates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BetterUpdates.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_alexandrite_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BetterUpdates.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
