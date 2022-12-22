package com.madhatmodding.madhatmod.Item.custom;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class HobbitiumPickaxe extends PickaxeItem
{
    public HobbitiumPickaxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void onCraftedBy(ItemStack pStack, Level pLevel, Player pPlayer)
    {
        pStack.enchant(Enchantments.BLOCK_FORTUNE, 2);
    }
}
