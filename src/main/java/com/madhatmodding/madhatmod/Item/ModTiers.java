package com.madhatmodding.madhatmod.Item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers
{
    public static final ForgeTier TUNGSTEN = new ForgeTier(2, 2500, 6.0F, 2.5F,
            24, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));

    public static final ForgeTier MITHRIL = new ForgeTier(3, 3250, 7.0F, 3.5F,
            35, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));

    public static final ForgeTier BOSSITE = new ForgeTier(2, 420, 6.0F, 1.0F,
            16, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.BOSSITE_INGOT.get()));

    public static final ForgeTier HOBBITIUM = new ForgeTier(2, 1250, 7.0F, 2.0F,
            35, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.HOBBITIUM_INGOT.get()));
}
