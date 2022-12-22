package com.madhatmodding.madhatmod.event;


import com.madhatmodding.madhatmod.Item.ModItems;
import com.madhatmodding.madhatmod.MadHatMod;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MadHatMod.MOD_ID)
public class ModEvents
{
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event)
    {
        if(event.getType() == VillagerProfession.FARMER)
        {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.COFFEE_BEANS.get(), 12);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack, 10, 8, 0.02F));
        }
    }
}
