package net.kaupenjoe.mccourse.item;

import net.kaupenjoe.mccourse.BetterUpdates;
import net.kaupenjoe.mccourse.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTags {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
             new ForgeTier(1,308,3.0f,1.5f,12,
                     ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(BetterUpdates.MOD_ID,"bronze"), List.of(Tiers.STONE), List.of());
    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(1,850,5.0f,1.5f,18,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(BetterUpdates.MOD_ID,"emerald"), List.of(Tiers.DIAMOND), List.of());




}

