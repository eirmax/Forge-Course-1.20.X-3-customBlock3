package net.kaupenjoe.mccourse.item;

import net.kaupenjoe.mccourse.BetterUpdates;
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
             new ForgeTier(2,308,0,0f,12,
                     ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(BetterUpdates.MOD_ID,"bronze"), List.of(Tiers.STONE), List.of());

    public static final Tier IMPROVE_EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(2,2570,0,0f,18,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(ModItems.IMPROVE_EMERALD.get())),
            new ResourceLocation(BetterUpdates.MOD_ID,"improve_emerald"), List.of(Tiers.STONE), List.of());






}

