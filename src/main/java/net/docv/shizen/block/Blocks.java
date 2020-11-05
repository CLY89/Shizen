package net.docv.shizen.block;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.Shizen;
import net.docv.shizen.block.trees.ApricotTreeBlock;
import net.docv.shizen.block.trees.ApricotTreeLeavesBlock;
import net.docv.shizen.block.trees.ApricotTreeLogBlock;
import net.docv.shizen.block.trees.ApricotTreeSaplingBlock;
import net.docv.shizen.block.trees.BananaTreeBlock;
import net.docv.shizen.block.trees.BananaTreeLeavesBlock;
import net.docv.shizen.block.trees.BananaTreeLogBlock;
import net.docv.shizen.block.trees.BananaTreeSaplingBlock;
import net.docv.shizen.block.trees.GrapeTreeBlock;
import net.docv.shizen.block.trees.GrapeTreeLeavesBlock;
import net.docv.shizen.block.trees.GrapeTreeLogBlock;
import net.docv.shizen.block.trees.GrapeTreeSaplingBlock;
import net.docv.shizen.block.trees.LemonTreeBlock;
import net.docv.shizen.block.trees.LemonTreeLeavesBlock;
import net.docv.shizen.block.trees.LemonTreeLogBlock;
import net.docv.shizen.block.trees.LemonTreeSaplingBlock;
import net.docv.shizen.block.trees.OrangeTreeBlock;
import net.docv.shizen.block.trees.OrangeTreeLeavesBlock;
import net.docv.shizen.block.trees.OrangeTreeLogBlock;
import net.docv.shizen.block.trees.OrangeTreeSaplingBlock;
import net.docv.shizen.block.trees.PeachTreeBlock;
import net.docv.shizen.block.trees.PeachTreeLeavesBlock;
import net.docv.shizen.block.trees.PeachTreeLogBlock;
import net.docv.shizen.block.trees.PeachTreeSaplingBlock;
import net.docv.shizen.block.trees.PearTreeBlock;
import net.docv.shizen.block.trees.PearTreeLeavesBlock;
import net.docv.shizen.block.trees.PearTreeLogBlock;
import net.docv.shizen.block.trees.PearTreeSaplingBlock;
import net.docv.shizen.block.trees.PlumTreeBlock;
import net.docv.shizen.block.trees.PlumTreeLeavesBlock;
import net.docv.shizen.block.trees.PlumTreeLogBlock;
import net.docv.shizen.block.trees.PlumTreeSaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SaplingBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Shizen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {
	public static List<Block> blockList = new ArrayList<Block>();

	public static Block APRICOT_TREE = register("apricot_tree", new ApricotTreeBlock());
	public static Block APRICOT_TREE_LOG= register("apricot_tree_log", new ApricotTreeLogBlock());
	public static Block APRICOT_TREE_LEAVES = register("apricot_tree_leaves", new ApricotTreeLeavesBlock());
	public static Block APRICOT_TREE_SAPLING = register("apricot_tree_sapling", new ApricotTreeSaplingBlock());

	public static Block BANANA_TREE = register("banana_tree", new BananaTreeBlock());
	public static Block BANANA_TREE_LOG = register("banana_tree_log", new BananaTreeLogBlock());
	public static Block BANANA_TREE_LEAVES = register("banana_tree_leaves", new BananaTreeLeavesBlock());
	public static Block BANANA_TREE_SAPLING = register("banana_tree_sapling", new BananaTreeSaplingBlock());

	public static Block GRAPE_TREE = register("grape_tree", new GrapeTreeBlock());
	public static Block GRAPE_TREE_LOG = register("grape_tree_log", new GrapeTreeLogBlock());
	public static Block GRAPE_TREE_LEAVES = register("grape_tree_leaves", new GrapeTreeLeavesBlock());
	public static Block GRAPE_TREE_SAPLING = register("grape_tree_sapling", new GrapeTreeSaplingBlock());

	public static Block LEMON_TREE = register("lemon_tree", new LemonTreeBlock());
	public static Block LEMON_TREE_LOG = register("lemon_tree_log", new LemonTreeLogBlock());
	public static Block LEMON_TREE_LEAVES = register("lemon_tree_leaves", new LemonTreeLeavesBlock());
	public static Block LEMON_TREE_SAPLING = register("lemon_tree_sapling", new LemonTreeSaplingBlock());

	public static Block ORANGE_TREE = register("orange_tree", new OrangeTreeBlock());
	public static Block ORANGE_TREE_LOG = register("orange_tree_log", new OrangeTreeLogBlock());
	public static Block ORANGE_TREE_LEAVES = register("orange_tree_leaves", new OrangeTreeLeavesBlock());
	public static Block ORANGE_TREE_SAPLING = register("orange_tree_sapling", new OrangeTreeSaplingBlock());

	public static Block PEACH_TREE = register("peach_tree", new PeachTreeBlock());
	public static Block PEACH_TREE_LOG = register("peach_tree_log", new PeachTreeLogBlock());
	public static Block PEACH_TREE_LEAVES = register("peach_tree_leaves", new PeachTreeLeavesBlock());
	public static Block PEACH_TREE_SAPLING = register("peach_tree_sapling", new PeachTreeSaplingBlock());

	public static Block PEAR_TREE = register("pear_tree", new PearTreeBlock());
	public static Block PEAR_TREE_LOG = register("pear_tree_log", new PearTreeLogBlock());
	public static Block PEAR_TREE_LEAVES = register("pear_tree_leaves", new PearTreeLeavesBlock());
	public static Block PEAR_TREE_SAPLING = register("pear_tree_sapling", new PearTreeSaplingBlock());

	public static Block PLUM_TREE = register("plum_tree", new PlumTreeBlock());
	public static Block PLUM_TREE_LOG = register("plum_tree_log", new PlumTreeLogBlock());
	public static Block PLUM_TREE_LEAVES = register("plum_tree_leaves", new PlumTreeLeavesBlock());
	public static Block PLUM_TREE_SAPLING = register("plum_tree_sapling", new PlumTreeSaplingBlock());

	private static Block register(String key, Block blockIn) {
		blockList.add(blockIn);
		return blockIn.setRegistryName(Shizen.MOD_ID, key);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for (Block block : blockList) {
			event.getRegistry().register(block);
			if (block instanceof SaplingBlock) {
				RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
			}
		}
	}

}
