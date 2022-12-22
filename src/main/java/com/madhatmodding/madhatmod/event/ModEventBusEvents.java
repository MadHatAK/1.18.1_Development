package com.madhatmodding.madhatmod.event;

import com.madhatmodding.madhatmod.MadHatMod;
import com.madhatmodding.madhatmod.event.loot.CoffeeBeansInPlainsAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MadHatMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                               event)
    {
        event.getRegistry().registerAll(
            new CoffeeBeansInPlainsAdditionModifier.Serializer().setRegistryName
                    (new ResourceLocation(MadHatMod.MOD_ID, "coffee_beans_in_plains"))
        );
    }
}
