package net.docv.shizen.tree;

import java.util.Random;

import javax.annotation.Nullable;

import net.docv.shizen.world.gen.TreeGenerator;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class PlumTree extends Tree {
	@Nullable
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
		return TreeGenerator.PLUM.setConfiguration();
	}
}
