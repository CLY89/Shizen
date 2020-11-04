package net.docv.shizen.block;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.Shizen;
import net.docv.shizen.block.trees.ApricotTreeBlock;
import net.docv.shizen.block.trees.ApricotTreeLeavesBlock;
import net.docv.shizen.block.trees.ApricotTreeLogBlock;
import net.docv.shizen.block.trees.BananaTreeBlock;
import net.docv.shizen.block.trees.BananaTreeLeavesBlock;
import net.docv.shizen.block.trees.BananaTreeLogBlock;
import net.docv.shizen.block.trees.GrapeTreeBlock;
import net.docv.shizen.block.trees.GrapeTreeLeavesBlock;
import net.docv.shizen.block.trees.GrapeTreeLogBlock;
import net.docv.shizen.block.trees.LemonTreeBlock;
import net.docv.shizen.block.trees.LemonTreeLeavesBlock;
import net.docv.shizen.block.trees.LemonTreeLogBlock;
import net.docv.shizen.block.trees.OrangeTreeBlock;
import net.docv.shizen.block.trees.OrangeTreeLeavesBlock;
import net.docv.shizen.block.trees.OrangeTreeLogBlock;
import net.docv.shizen.block.trees.PeachTreeBlock;
import net.docv.shizen.block.trees.PeachTreeLeavesBlock;
import net.docv.shizen.block.trees.PeachTreeLogBlock;
import net.docv.shizen.block.trees.PearTreeBlock;
import net.docv.shizen.block.trees.PearTreeLeavesBlock;
import net.docv.shizen.block.trees.PearTreeLogBlock;
import net.docv.shizen.block.trees.PlumTreeBlock;
import net.docv.shizen.block.trees.PlumTreeLeavesBlock;
import net.docv.shizen.block.trees.PlumTreeLogBlock;
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

	public static Block APRICOT_TREE_BLOCK = register("apricot_tree_block", new ApricotTreeBlock());
	public static Block APRICOT_TREE_LOG_BLOCK= register("apricot_tree_log_block", new ApricotTreeLogBlock());
	public static Block APRICOT_TREE_LEAVES_BLOCK = register("apricot_tree_leaves_block", new ApricotTreeLeavesBlock());

	public static Block BANANA_TREE_BLOCK = register("banana_tree_block", new BananaTreeBlock());
	public static Block BANANA_TREE_LOG_BLOCK = register("banana_tree_log_block", new BananaTreeLogBlock());
	public static Block BANANA_TREE_LEAVES_BLOCK = register("banana_tree_leaves_block", new BananaTreeLeavesBlock());
	//public static Block APRICOT_TREE_SAPLING = register("apricot_tree_sapling", new SaplingBlock(new ApricotTree(), AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static Block GRAPE_TREE_BLOCK = register("grape_tree_block", new GrapeTreeBlock());
	public static Block GRAPE_TREE_LOG_BLOCK = register("grape_tree_log_block", new GrapeTreeLogBlock());
	public static Block GRAPE_TREE_LEAVES_BLOCK = register("grape_tree_leaves_block", new GrapeTreeLeavesBlock());

	public static Block LEMON_TREE_BLOCK = register("lemon_tree_block", new LemonTreeBlock());
	public static Block LEMON_TREE_LOG_BLOCK = register("lemon_tree_log_block", new LemonTreeLogBlock());
	public static Block LEMON_TREE_LEAVES_BLOCK = register("lemon_tree_leaves_block", new LemonTreeLeavesBlock());

	public static Block ORANGE_TREE_BLOCK = register("orange_tree_block", new OrangeTreeBlock());
	public static Block ORANGE_TREE_LOG_BLOCK = register("orange_tree_log_block", new OrangeTreeLogBlock());
	public static Block ORANGE_TREE_LEAVES_BLOCK = register("orange_tree_leaves_block", new OrangeTreeLeavesBlock());

	public static Block PEACH_TREE_BLOCK = register("peach_tree_block", new PeachTreeBlock());
	public static Block PEACH_TREE_LOG_BLOCK = register("peach_tree_log_block", new PeachTreeLogBlock());
	public static Block PEACH_TREE_LEAVES_BLOCK = register("peach_tree_leaves_block", new PeachTreeLeavesBlock());

	public static Block PEAR_TREE_BLOCK = register("pear_tree_block", new PearTreeBlock());
	public static Block PEAR_TREE_LOG_BLOCK = register("pear_tree_log_block", new PearTreeLogBlock());
	public static Block PEAR_TREE_LEAVES_BLOCK = register("pear_tree_leaves_block", new PearTreeLeavesBlock());

	public static Block PLUM_TREE_BLOCK = register("plum_tree_block", new PlumTreeBlock());
	public static Block PLUM_TREE_LOG_BLOCK = register("plum_tree_log_block", new PlumTreeLogBlock());
	public static Block PLUM_TREE_LEAVES_BLOCK = register("plum_tree_leaves_block", new PlumTreeLeavesBlock());

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
