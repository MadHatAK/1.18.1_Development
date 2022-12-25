package com.madhatmodding.madhatmod.Item;

import com.madhatmodding.madhatmod.Item.custom.RawShaleItem;
import com.madhatmodding.madhatmod.MadHatMod;
import com.madhatmodding.madhatmod.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MadHatMod.MOD_ID);

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
           () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> BOSSITE_INGOT = ITEMS.register("bossite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> HOBBITIUM_INGOT = ITEMS.register("hobbitium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));
    public static final RegistryObject<Item> RAW_WOLFRAM = ITEMS.register("raw_wolfram",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_BOSSITE = ITEMS.register("raw_bossite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_COMPRESSED_COAL = ITEMS.register("raw_compressed_coal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_HOBBITIUM = ITEMS.register("raw_hobbitium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_SHALE = ITEMS.register("raw_shale",
            () -> new RawShaleItem(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new ItemNameBlockItem(ModBlocks.COFFEE_PLANT_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)));

    //Food
    public static final RegistryObject<Item> COFFEE_CUP = ITEMS.register("coffee_cup",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)
                    .food(ModFoods.COFFEE_CUP)));

    public static final RegistryObject<Item> COFFEE_CUP2 = ITEMS.register("doctored_coffee_cup",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)
                    .food(ModFoods.COFFEE_CUP2)));

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_ITEM_TAB)
                    .food(ModFoods.PEACH)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

}
