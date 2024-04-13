package net.kaupenjoe.mccourse.util;

import net.kaupenjoe.mccourse.BetterUpdates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey NEEDS_BRONZE_TOOL = tag("bronze");
        public static final TagKey NEEDS_EMERALD_TOOL= tag("emerald");




        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BetterUpdates.MOD_ID, name));

        }

        public static class Items {
            public static TagKey<Item> tag(String name) {
                return ItemTags.create(new ResourceLocation(BetterUpdates.MOD_ID, name));
            }
        }
    }
}
