package net.docv.shizen.block;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.Shizen;
import net.docv.shizen.block.tree.ApricotLeavesBlock;
import net.docv.shizen.block.tree.ApricotLogBlock;
import net.docv.shizen.block.tree.ApricotSaplingBlock;
import net.docv.shizen.block.tree.ApricotWoodBlock;
import net.docv.shizen.block.tree.BananaLeavesBlock;
import net.docv.shizen.block.tree.BananaLogBlock;
import net.docv.shizen.block.tree.BananaSaplingBlock;
import net.docv.shizen.block.tree.BananaWoodBlock;
import net.docv.shizen.block.tree.GrapeLeavesBlock;
import net.docv.shizen.block.tree.GrapeLogBlock;
import net.docv.shizen.block.tree.GrapeSaplingBlock;
import net.docv.shizen.block.tree.GrapeWoodBlock;
import net.docv.shizen.block.tree.LemonLeavesBlock;
import net.docv.shizen.block.tree.LemonLogBlock;
import net.docv.shizen.block.tree.LemonSaplingBlock;
import net.docv.shizen.block.tree.LemonWoodBlock;
import net.docv.shizen.block.tree.OrangeLeavesBlock;
import net.docv.shizen.block.tree.OrangeLogBlock;
import net.docv.shizen.block.tree.OrangeSaplingBlock;
import net.docv.shizen.block.tree.OrangeWoodBlock;
import net.docv.shizen.block.tree.PeachLeavesBlock;
import net.docv.shizen.block.tree.PeachLogBlock;
import net.docv.shizen.block.tree.PeachSaplingBlock;
import net.docv.shizen.block.tree.PeachWoodBlock;
import net.docv.shizen.block.tree.PearLeavesBlock;
import net.docv.shizen.block.tree.PearLogBlock;
import net.docv.shizen.block.tree.PearSaplingBlock;
import net.docv.shizen.block.tree.PearWoodBlock;
import net.docv.shizen.block.tree.PlumLeavesBlock;
import net.docv.shizen.block.tree.PlumLogBlock;
import net.docv.shizen.block.tree.PlumSaplingBlock;
import net.docv.shizen.block.tree.PlumWoodBlock;
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

	public static Block APRICOT_WOOD = register("apricot_wood", new ApricotWoodBlock());
	public static Block APRICOT_LOG= register("apricot_log", new ApricotLogBlock());
	public static Block APRICOT_LEAVES = register("apricot_leaves", new ApricotLeavesBlock());
	public static Block APRICOT_SAPLING = register("apricot_sapling", new ApricotSaplingBlock());

	public static Block BANANA_WOOD = register("banana_wood", new BananaWoodBlock());
	public static Block BANANA_LOG = register("banana_log", new BananaLogBlock());
	public static Block BANANA_LEAVES = register("banana_leaves", new BananaLeavesBlock());
	public static Block BANANA_SAPLING = register("banana_sapling", new BananaSaplingBlock());

	public static Block GRAPE_WOOD = register("grape_wood", new GrapeWoodBlock());
	public static Block GRAPE_LOG = register("grape_log", new GrapeLogBlock());
	public static Block GRAPE_LEAVES = register("grape_leaves", new GrapeLeavesBlock());
	public static Block GRAPE_SAPLING = register("grape_sapling", new GrapeSaplingBlock());

	public static Block LEMON_WOOD = register("lemon_wood", new LemonWoodBlock());
	public static Block LEMON_LOG = register("lemon_log", new LemonLogBlock());
	public static Block LEMON_LEAVES = register("lemon_leaves", new LemonLeavesBlock());
	public static Block LEMON_SAPLING = register("lemon_sapling", new LemonSaplingBlock());

	public static Block ORANGE_WOOD = register("orange_wood", new OrangeWoodBlock());
	public static Block ORANGE_LOG = register("orange_log", new OrangeLogBlock());
	public static Block ORANGE_LEAVES = register("orange_leaves", new OrangeLeavesBlock());
	public static Block ORANGE_SAPLING = register("orange_sapling", new OrangeSaplingBlock());

	public static Block PEACH_WOOD = register("peach_wood", new PeachWoodBlock());
	public static Block PEACH_LOG = register("peach_log", new PeachLogBlock());
	public static Block PEACH_LEAVES = register("peach_leaves", new PeachLeavesBlock());
	public static Block PEACH_SAPLING = register("peach_sapling", new PeachSaplingBlock());

	public static Block PEAR_WOOD = register("pear_wood", new PearWoodBlock());
	public static Block PEAR_LOG = register("pear_log", new PearLogBlock());
	public static Block PEAR_LEAVES = register("pear_leaves", new PearLeavesBlock());
	public static Block PEAR_SAPLING = register("pear_sapling", new PearSaplingBlock());

	public static Block PLUM_WOOD = register("plum_wood", new PlumWoodBlock());
	public static Block PLUM_LOG = register("plum_log", new PlumLogBlock());
	public static Block PLUM_LEAVES = register("plum_leaves", new PlumLeavesBlock());
	public static Block PLUM_SAPLING = register("plum_sapling", new PlumSaplingBlock());

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
