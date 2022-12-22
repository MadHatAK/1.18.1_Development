package com.madhatmodding.madhatmod.block;

import com.madhatmodding.madhatmod.Item.ModCreativeModeTab;
import com.madhatmodding.madhatmod.Item.ModItems;
import com.madhatmodding.madhatmod.MadHatMod;
import com.madhatmodding.madhatmod.block.custom.CoffeePlantBlock;
import com.madhatmodding.madhatmod.block.custom.ModFlammableRotatedPillarBlock;
import com.madhatmodding.madhatmod.world.feature.tree.IronwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MadHatMod.MOD_ID);
    /*
        Strength - Iron Ore = 3f, 3f
                   Diamond Ore = 3f, 3f
                   Obsidian = 50f, 1200f
     */
    //ORES
    public static final RegistryObject<Block> WOLFRAM_ORE = registerBlock("wolfram_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_WOLFRAM_ORE = registerBlock("deepslate_wolfram_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock("mithril_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BOSSITE_ORE = registerBlock("bossite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_COMPRESSED_COAL_ORE =
            registerBlock("deepslate_compressed_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> HOBBITIUM_ORE = registerBlock("hobbitium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_HOBBITIUM_ORE = registerBlock("deepslate_hobbitium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f, 5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SHALE_ORE = registerBlock("shale_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(0, 2)));

    public static final RegistryObject<Block> DEEPSLATE_SHALE_ORE = registerBlock("deepslate_shale_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f, 5f)
                    .requiresCorrectToolForDrops()));


    //CROPS
    public static final RegistryObject<Block> COFFEE_PLANT_BLOCK = registerBlockWithoutItem("coffee_plant",
            () -> new CoffeePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    //TREES
        //IRONWOOD
    public static final RegistryObject<Block> IRONWOOD_LOG = registerBlock("ironwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> IRONWOOD_WOOD = registerBlock("ironwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_WOOD = registerBlock("stripped_ironwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 30;
                }
            }, ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> IRONWOOD_SAPLING = registerBlock("ironwood_sapling",
            () -> new SaplingBlock(new IronwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

        //OSAGE
    public static final RegistryObject<Block> OSAGE_LOG = registerBlock("osage_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> OSAGE_WOOD = registerBlock("osage_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_OSAGE_LOG = registerBlock("stripped_osage_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_OSAGE_WOOD = registerBlock("stripped_osage_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> OSAGE_LEAVES = registerBlock("osage_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 30;
                }
            }, ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static final RegistryObject<Block> OSAGE_SAPLING = registerBlock("osage_sapling",
            () -> new SaplingBlock(new IronwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    //PLANKS
        //IRONWOOD
    public static final RegistryObject<Block> IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 5;
                }
            }, ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

        //OSAGE
    public static final RegistryObject<Block> OSAGE_PLANKS = registerBlock("osage_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 5;
                }
            }, ModCreativeModeTab.MADHATMOD_BLOCK_TAB);

    public static<T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block)
    {
        return BLOCKS.register(name, block);
    }

    public static<T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static<T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.MADHATMOD_BLOCK_TAB)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
