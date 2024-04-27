package net.kaupenjoe.mccourse.datagen;

import net.kaupenjoe.mccourse.BetterUpdates;
import net.kaupenjoe.mccourse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

    public class ModBlockStateProvider extends BlockStateProvider {
        public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
            super(output, BetterUpdates.MOD_ID, exFileHelper);
        }

        @Override
        protected void registerStatesAndModels() {


            stairsBlock((StairBlock) ModBlocks.BRONZE_STAIRS.get(), blockTexture(ModBlocks.BRONZE_BLOCK.get()));
            slabBlock(((SlabBlock) ModBlocks.BRONZE_SLAB.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));

            blockItem(ModBlocks.BRONZE_STAIRS);
            blockItem(ModBlocks.BRONZE_SLAB);

        }


        private void blockItem(RegistryObject<Block> blockRegistryObject) {
            simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("betterupdates:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
        }

        private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
            simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
        }
    }

