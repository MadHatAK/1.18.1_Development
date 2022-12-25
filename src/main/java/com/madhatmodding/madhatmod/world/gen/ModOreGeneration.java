package com.madhatmodding.madhatmod.world.gen;

import com.madhatmodding.madhatmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModOreGeneration
{
    public static void generateOre(final BiomeLoadingEvent event)
    {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.WOLFRAM_ORE_PLACED);
        base.add(ModPlacedFeatures.HOBBITIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.BOSSITE_ORE_PLACED);
        base.add(ModPlacedFeatures.COMPRESSED_COAL_ORE_PLACED);
        base.add(ModPlacedFeatures.MITHRIL_ORE_PLACED);
        base.add(ModPlacedFeatures.SULFUR_ORE_PLACED);

        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.DRY))
        {
            List<Holder<PlacedFeature>> dryPlace =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

            dryPlace.add(ModPlacedFeatures.SHALE_ORE_PLACED);
        }
    }
}
