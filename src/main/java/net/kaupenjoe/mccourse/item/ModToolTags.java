package net.kaupenjoe.mccourse.item;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTags {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
             new ForgeTier(1,180,5.0f,1.5f,9,
                     ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(MCCourseMod.MOD_ID,"bronze"), List.of(Tiers.NETHERITE), List.of());




}

