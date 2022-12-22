package com.madhatmodding.madhatmod.block.custom;

import com.madhatmodding.madhatmod.Item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CoffeePlantBlock extends CropBlock
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public CoffeePlantBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId()
    {
        return ModItems.COFFEE_BEANS.get();
    }
}
