package net.docv.shizen.block;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.Shizen;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Shizen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {
	public static List<Block> blockList = new ArrayList<Block>();
	public static Block BANANA_TREE_BLOCK = register("banana_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

	public static Block APRICOT_TREE_BLOCK = register("apricot_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block APRICOT_TREE_LOG = register("apricot_tree_log", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static Block APRICOT_TREE_LEAVES = register("apricot_tree_leaves", new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.WOOD).notSolid()));
	//public static Block APRICOT_TREE_SAPLING = register("apricot_tree_sapling", new SaplingBlock(new ApricotTree(), AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static Block GRAPE_TREE_BLOCK = register("grape_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block LEMON_TREE_BLOCK = register("lemon_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block ORANGE_TREE_BLOCK = register("orange_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block PEACH_TREE_BLOCK = register("peach_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block PEAR_TREE_BLOCK = register("pear_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
	public static Block PLUM_TREE_BLOCK = register("plum_tree_block", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

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
