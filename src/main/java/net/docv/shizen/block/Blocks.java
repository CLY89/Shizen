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

	public static Block APRICOT_WOOD = register("apricot_wood", new ApricotTreeBlock());
	public static Block APRICOT_LOG= register("apricot_log", new ApricotTreeLogBlock());
	public static Block APRICOT_LEAVES = register("apricot_leaves", new ApricotTreeLeavesBlock());
	public static Block APRICOT_SAPLING = register("apricot_sapling", new ApricotTreeSaplingBlock());

	public static Block BANANA_WOOD = register("banana_wood", new BananaTreeBlock());
	public static Block BANANA_LOG = register("banana_log", new BananaTreeLogBlock());
	public static Block BANANA_LEAVES = register("banana_leaves", new BananaTreeLeavesBlock());
	public static Block BANANA_SAPLING = register("banana_sapling", new BananaTreeSaplingBlock());

	public static Block GRAPE_WOOD = register("grape_wood", new GrapeTreeBlock());
	public static Block GRAPE_LOG = register("grape_log", new GrapeTreeLogBlock());
	public static Block GRAPE_LEAVES = register("grape_leaves", new GrapeTreeLeavesBlock());
	public static Block GRAPE_SAPLING = register("grape_sapling", new GrapeTreeSaplingBlock());

	public static Block LEMON_WOOD = register("lemon_wood", new LemonTreeBlock());
	public static Block LEMON_LOG = register("lemon_log", new LemonTreeLogBlock());
	public static Block LEMON_LEAVES = register("lemon_leaves", new LemonTreeLeavesBlock());
	public static Block LEMON_SAPLING = register("lemon_sapling", new LemonTreeSaplingBlock());

	public static Block ORANGE_WOOD = register("orange_wood", new OrangeTreeBlock());
	public static Block ORANGE_LOG = register("orange_log", new OrangeTreeLogBlock());
	public static Block ORANGE_LEAVES = register("orange_leaves", new OrangeTreeLeavesBlock());
	public static Block ORANGE_SAPLING = register("orange_sapling", new OrangeTreeSaplingBlock());

	public static Block PEACH_WOOD = register("peach_wood", new PeachTreeBlock());
	public static Block PEACH_LOG = register("peach_log", new PeachTreeLogBlock());
	public static Block PEACH_LEAVES = register("peach_leaves", new PeachTreeLeavesBlock());
	public static Block PEACH_SAPLING = register("peach_sapling", new PeachTreeSaplingBlock());

	public static Block PEAR_WOOD = register("pear_wood", new PearTreeBlock());
	public static Block PEAR_LOG = register("pear_log", new PearTreeLogBlock());
	public static Block PEAR_LEAVES = register("pear_leaves", new PearTreeLeavesBlock());
	public static Block PEAR_SAPLING = register("pear_sapling", new PearTreeSaplingBlock());

	public static Block PLUM_WOOD = register("plum_wood", new PlumTreeBlock());
	public static Block PLUM_LOG = register("plum_log", new PlumTreeLogBlock());
	public static Block PLUM_LEAVES = register("plum_leaves", new PlumTreeLeavesBlock());
	public static Block PLUM_SAPLING = register("plum_sapling", new PlumTreeSaplingBlock());

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
