package com.madhatmodding.madhatmod.block.custom;

import com.madhatmodding.madhatmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock
{

    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, Level level, BlockPos pos, Player player, ItemStack stack,
                                           ToolAction toolAction)
    {
        if(stack.getItem() instanceof AxeItem)
        {
            if(state.is(ModBlocks.IRONWOOD_LOG.get()))
            {
                return ModBlocks.STRIPPED_IRONWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if(stack.getItem() instanceof AxeItem)
        {
            if(state.is(ModBlocks.IRONWOOD_WOOD.get()))
            {
                return ModBlocks.STRIPPED_IRONWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if(stack.getItem() instanceof AxeItem)
        {
            if(state.is(ModBlocks.OSAGE_LOG.get()))
            {
                return ModBlocks.STRIPPED_OSAGE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if(stack.getItem() instanceof AxeItem)
        {
            if(state.is(ModBlocks.OSAGE_WOOD.get()))
            {
                return ModBlocks.STRIPPED_OSAGE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, level, pos, player, stack, toolAction);
    }
}
