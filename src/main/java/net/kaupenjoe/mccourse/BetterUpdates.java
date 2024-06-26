package net.kaupenjoe.mccourse;

import com.mojang.logging.LogUtils;
import net.kaupenjoe.mccourse.block.ModBlocks;
import net.kaupenjoe.mccourse.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BetterUpdates.MOD_ID)
public class BetterUpdates {
    public static final String MOD_ID = "betterupdates";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BetterUpdates() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.IMPROVE_EMERALD);

        }


        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.EMERALD_SWORD);



        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.EMERALD_SHOVEL);



        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.BRONZE_SLAB);
            event.accept(ModBlocks.BRONZE_STAIRS);
            event.accept(ModBlocks.EMERALD_SLAB);
            event.accept(ModBlocks.EMERALD_STAIRS);





        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
