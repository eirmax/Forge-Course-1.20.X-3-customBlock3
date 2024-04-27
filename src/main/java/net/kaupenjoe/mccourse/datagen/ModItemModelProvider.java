package net.kaupenjoe.mccourse.datagen;
import net.kaupenjoe.mccourse.BetterUpdates;
import net.kaupenjoe.mccourse.block.ModBlocks;
import net.kaupenjoe.mccourse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

    public class ModItemModelProvider extends ItemModelProvider {
        public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
            super(output, BetterUpdates.MOD_ID, existingFileHelper);
        }

        @Override
        protected void registerModels() {

            handheldItem(ModItems.EMERALD_SWORD);
            handheldItem(ModItems.EMERALD_PICKAXE);
            handheldItem(ModItems.EMERALD_HOE);
            handheldItem(ModItems.EMERALD_AXE);
            handheldItem(ModItems.EMERALD_SHOVEL);



            handheldItem(ModItems.BRONZE_AXE);
            handheldItem(ModItems.BRONZE_HOE);
            handheldItem(ModItems.BRONZE_SWORD);
            handheldItem(ModItems.BRONZE_SHOVEL);
            handheldItem(ModItems.BRONZE_PICKAXE);






            evenSimplerBlockItem(ModBlocks.BRONZE_SLAB);
            evenSimplerBlockItem(ModBlocks.BRONZE_STAIRS);

        }

        public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                    .texture("texture",  new ResourceLocation(BetterUpdates.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }

        public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                    .texture("wall",  new ResourceLocation(BetterUpdates.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }

        public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                    .texture("texture",  new ResourceLocation(BetterUpdates.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }


        private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/handheld")).texture("layer0",
                    new ResourceLocation(BetterUpdates.MOD_ID,"item/" + item.getId().getPath()));
        }

        private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(BetterUpdates.MOD_ID,"item/" + item.getId().getPath()));
        }

        private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(BetterUpdates.MOD_ID,"item/" + item.getId().getPath()));




        }

        public void evenSimplerBlockItem(RegistryObject<Block> block) {
            this.withExistingParent(BetterUpdates.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                    modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
        }

    }





