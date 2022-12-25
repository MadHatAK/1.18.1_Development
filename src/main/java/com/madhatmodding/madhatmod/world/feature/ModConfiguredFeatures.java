package com.madhatmodding.madhatmod.world.feature;

import com.madhatmodding.madhatmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures
{
    //Ironwood
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> IRONWOOD_TREE =
            FeatureUtils.register("ironwood", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.IRONWOOD_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.IRONWOOD_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> IRONWOOD_CHECKED =
            PlacementUtils.register("ironwood_checked", IRONWOOD_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.IRONWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> IRONWOOD_SPAWN =
            FeatureUtils.register("ironwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(IRONWOOD_CHECKED,
                            0.5F)), IRONWOOD_CHECKED));

    //Osage
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> OSAGE_TREE =
            FeatureUtils.register("osage", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.OSAGE_LOG.get()),
                    new ForkingTrunkPlacer(5, 2, 2),
                    BlockStateProvider.simple(ModBlocks.OSAGE_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> OSAGE_CHECKED =
            PlacementUtils.register("osage_checked", OSAGE_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.OSAGE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> OSAGE_SPAWN =
            FeatureUtils.register("osage_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(OSAGE_CHECKED,
                            0.5F)), OSAGE_CHECKED));

    //Ore Generation
        //Bossite
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BOSSITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BOSSITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BOSSITE_ORE = FeatureUtils.register("bossite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BOSSITE_ORES, 9));

    //Compressed Coal
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COMPRESSED_COAL_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_COMPRESSED_COAL_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_COMPRESSED_COAL_ORE =
            FeatureUtils.register("deepslate_compressed_coal_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COMPRESSED_COAL_ORES, 16));

        //Hobbitium
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_HOBBITIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.HOBBITIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_HOBBITIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HOBBITIUM_ORE = FeatureUtils.register("hobbitium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_HOBBITIUM_ORES, 9));

        //Mithril
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MITHRIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MITHRIL_ORE = FeatureUtils.register("mithril_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MITHRIL_ORES, 9));

        //Shale
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SHALE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SHALE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SHALE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SHALE_ORE = FeatureUtils.register("shale_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SHALE_ORES, 9));

        //Sulfur
        public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SULFUR_ORES = List.of(
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SULFUR_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SULFUR_ORE = FeatureUtils.register("sulfur_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SULFUR_ORES, 9));

        //Wolfram
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_WOLFRAM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.WOLFRAM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_WOLFRAM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> WOLFRAM_ORE = FeatureUtils.register("wolfram_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_WOLFRAM_ORES, 9));



}
