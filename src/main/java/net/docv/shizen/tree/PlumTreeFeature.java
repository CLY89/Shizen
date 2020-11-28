package net.docv.shizen.tree;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import net.docv.shizen.block.Blocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class PlumTreeFeature extends TreeFeature {
	public PlumTreeFeature(Codec<BaseTreeFeatureConfig> codec) {
		super(codec);
	}

	public ConfiguredFeature<?, ?> configure() {
		return this.setConfiguration().withPlacement(Placement.field_242902_f.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1)).func_242728_a());
	}

	public ConfiguredFeature<BaseTreeFeatureConfig, ?> setConfiguration() {
		return this.withConfiguration(
				new BaseTreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.PLUM_LOG.getDefaultState()),
						new SimpleBlockStateProvider(Blocks.PLUM_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
						new StraightTrunkPlacer(5, 2, 0),
						new TwoLayerFeature(1, 0, 1)
				).func_236700_a_().func_236703_a_(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build()
		);
	}

}
