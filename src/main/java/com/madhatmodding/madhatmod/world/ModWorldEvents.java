package com.madhatmodding.madhatmod.world;

import com.madhatmodding.madhatmod.MadHatMod;
import com.madhatmodding.madhatmod.world.gen.ModOreGeneration;
import com.madhatmodding.madhatmod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MadHatMod.MOD_ID)
public class ModWorldEvents
{
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        ModOreGeneration.generateOre(event);

        ModTreeGeneration.generateTrees(event);
    }
}
