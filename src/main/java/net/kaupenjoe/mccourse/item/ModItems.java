package net.kaupenjoe.mccourse.item;

import net.kaupenjoe.mccourse.BetterUpdates;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterUpdates.MOD_ID);

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPROVE_EMERALD = ITEMS.register("improve_emerald",
            () -> new Item(new Item.Properties()));



    // tools register
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTags.BRONZE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTags.BRONZE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTags.BRONZE, 1,1, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTags.BRONZE, 1,1, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTags.BRONZE, 2, 1, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTags.IMPROVE_EMERALD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTags.IMPROVE_EMERALD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTags.IMPROVE_EMERALD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTags.IMPROVE_EMERALD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HOE= ITEMS.register("emerald_hoe",
            () -> new SwordItem(ModToolTags.IMPROVE_EMERALD, 1, 1, new Item.Properties()));











    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
