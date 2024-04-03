package net.kaupenjoe.mccourse.util;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey NEEDS_BRONZE_TOOL = tag("");




        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MCCourseMod.MOD_ID, name));

        }

        public static class Items {
            public static TagKey<Item> tag(String name) {
                return ItemTags.create(new ResourceLocation(MCCourseMod.MOD_ID, name));
            }
        }
    }
}
