package com.madhatmodding.madhatmod.Item;

import com.madhatmodding.madhatmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab MADHATMOD_BLOCK_TAB = new CreativeModeTab("madhat_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.WOLFRAM_ORE.get());
        }
    };

    public static final CreativeModeTab MADHATMOD_ITEM_TAB = new CreativeModeTab("madhat_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_WOLFRAM.get());
        }
    };

    public static final CreativeModeTab MADHATMOD_TOOLS_TAB = new CreativeModeTab("madhat_tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModTools.TUNGSTEN_PICKAXE.get());
        }
    };
}
