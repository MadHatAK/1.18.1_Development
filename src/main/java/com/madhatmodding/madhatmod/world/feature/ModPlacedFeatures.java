package com.madhatmodding.madhatmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures
{
    public static final Holder<PlacedFeature> IRONWOOD_PLACED = PlacementUtils.register("ironwood_placed",
            ModConfiguredFeatures.IRONWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> OSAGE_PLACED = PlacementUtils.register("osage_placed",
            ModConfiguredFeatures.OSAGE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.01f, 1)));

    //ORES
        //BOSSITE
    public static final Holder<PlacedFeature> BOSSITE_ORE_PLACED = PlacementUtils.register("bossite_ore_placed",
            ModConfiguredFeatures.BOSSITE_ORE, ModOrePlacement.commonOrePlacement(8,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(0),
                            VerticalAnchor.absolute(65))));

    public static final Holder<PlacedFeature> COMPRESSED_COAL_ORE_PLACED = PlacementUtils.register("compressed_coal_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_COMPRESSED_COAL_ORE, ModOrePlacement.commonOrePlacement(20,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),
                            VerticalAnchor.absolute(0))));

        //HOBBITIUM
    public static final Holder<PlacedFeature> HOBBITIUM_ORE_PLACED = PlacementUtils.register("hobbitium_ore_placed",
            ModConfiguredFeatures.HOBBITIUM_ORE, ModOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-50),
                            VerticalAnchor.absolute(25))));

        //MITHRIL
        public static final Holder<PlacedFeature> MITHRIL_ORE_PLACED = PlacementUtils.register("mithril_ore_placed",
                ModConfiguredFeatures.MITHRIL_ORE, ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(50),
                                VerticalAnchor.absolute(120))));

        //SHALE
    public static final Holder<PlacedFeature> SHALE_ORE_PLACED = PlacementUtils.register("shale_ore_placed",
            ModConfiguredFeatures.SHALE_ORE, ModOrePlacement.commonOrePlacement(20,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-50),
                            VerticalAnchor.absolute(60))));

        //SULFUR
    public static final Holder<PlacedFeature> SULFUR_ORE_PLACED = PlacementUtils.register("sulfur_ore_placed",
                ModConfiguredFeatures.SULFUR_ORE, ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(64))));

        //Wolfram
    public static final Holder<PlacedFeature> WOLFRAM_ORE_PLACED = PlacementUtils.register("wolfram_ore_placed",
            ModConfiguredFeatures.WOLFRAM_ORE, ModOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-50),
                            VerticalAnchor.absolute(80))));


}
