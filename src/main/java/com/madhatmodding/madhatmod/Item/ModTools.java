package com.madhatmodding.madhatmod.Item;

import com.madhatmodding.madhatmod.Item.custom.HobbitiumPickaxe;
import com.madhatmodding.madhatmod.MadHatMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools
{
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, MadHatMod.MOD_ID);

    //Bossite
    public static final RegistryObject<Item> BOSSITE_AXE = TOOLS.register("bossite_axe",
            () -> new AxeItem(ModTiers.BOSSITE, 5, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static final RegistryObject<Item> BOSSITE_HOE = TOOLS.register("bossite_hoe",
            () -> new HoeItem(ModTiers.BOSSITE, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static final RegistryObject<Item> BOSSITE_PICKAXE = TOOLS.register("bossite_pickaxe",
            () -> new PickaxeItem(ModTiers.BOSSITE, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static final RegistryObject<Item> BOSSITE_SHOVEL = TOOLS.register("bossite_shovel",
            () -> new ShovelItem(ModTiers.BOSSITE, 1, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    //Hobbitium
    public static final RegistryObject<Item> HOBBITIUM_PICKAXE = TOOLS.register("hobbitium_pickaxe",
            () -> new HobbitiumPickaxe(ModTiers.HOBBITIUM, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    //Tungsten
    public static final RegistryObject<Item> TUNGSTEN_AXE = TOOLS.register("tungsten_axe",
            () -> new AxeItem(ModTiers.TUNGSTEN, 5, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = TOOLS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModTiers.TUNGSTEN, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = TOOLS.register("tungsten_shovel",
            () -> new ShovelItem(ModTiers.TUNGSTEN, 1, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_TOOLS_TAB)));

    public static void register(IEventBus eventBus) { TOOLS.register(eventBus); }
}
