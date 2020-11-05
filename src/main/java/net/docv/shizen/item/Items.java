package net.docv.shizen.item;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.Shizen;
import net.docv.shizen.block.Blocks;
import net.docv.shizen.food.fruits.Apricot;
import net.docv.shizen.food.fruits.Banana;
import net.docv.shizen.food.fruits.Grape;
import net.docv.shizen.food.fruits.Lemon;
import net.docv.shizen.food.fruits.Orange;
import net.docv.shizen.food.fruits.Peach;
import net.docv.shizen.food.fruits.Pear;
import net.docv.shizen.food.fruits.Plum;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Shizen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items {
	public static List<Item> itemList = new ArrayList<Item>();

	public static final Item APRICOT = register("apricot", new Apricot());
	public static final Item APRICOT_TREE = register("apricot_tree", Blocks.APRICOT_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_TREE_LOG = register("apricot_tree_log", Blocks.APRICOT_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_TREE_LEAVES = register("apricot_tree_leaves", Blocks.APRICOT_TREE_LEAVES, ItemGroup.DECORATIONS);
	//public static final Item APRICOT_TREE_SAPLING = register("apricot_tree_sapling", Blocks.APRICOT_TREE_SAPLING, ItemGroup.);

	public static final Item BANANA = register("banana", new Banana());
	public static final Item BANANA_TREE = register("banana_tree", Blocks.BANANA_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_TREE_LOG = register("banana_tree_log", Blocks.BANANA_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_TREE_LEAVES = register("banana_tree_leaves", Blocks.BANANA_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item GRAPE = register("grape", new Grape());
	public static final Item GRAPE_TREE = register("grape_tree", Blocks.GRAPE_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_TREE_LOG = register("grape_tree_log", Blocks.GRAPE_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_TREE_LEAVES = register("grape_tree_leaves", Blocks.GRAPE_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item LEMON = register("lemon", new Lemon());
	public static final Item LEMON_TREE = register("lemon_tree", Blocks.LEMON_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_TREE_LOG = register("lemon_tree_log", Blocks.LEMON_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_TREE_LEAVES = register("lemon_tree_leaves", Blocks.LEMON_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PEACH = register("peach", new Peach());
	public static final Item PEACH_TREE = register("peach_tree", Blocks.PEACH_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_TREE_LOG = register("peach_tree_log", Blocks.PEACH_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_TREE_LEAVES = register("peach_tree_leaves", Blocks.PEACH_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item ORANGE = register("orange", new Orange());
	public static final Item ORANGE_TREE = register("orange_tree", Blocks.ORANGE_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_TREE_LOG = register("orange_tree_log", Blocks.ORANGE_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_TREE_LEAVES = register("orange_tree_leaves", Blocks.ORANGE_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PEAR = register("pear", new Pear());
	public static final Item PEAR_TREE = register("pear_tree", Blocks.PEAR_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_TREE_LOG = register("pear_tree_log", Blocks.PEAR_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_TREE_LEAVES = register("pear_tree_leaves", Blocks.PEAR_TREE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PLUM = register("plum", new Plum());
	public static final Item PLUM_TREE = register("plum_tree", Blocks.PLUM_TREE, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_TREE_LOG = register("plum_tree_log", Blocks.PLUM_TREE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_TREE_LEAVES = register("plum_tree_leaves", Blocks.PLUM_TREE_LEAVES, ItemGroup.DECORATIONS);

	private static Item register(String key, Item itemIn) {
		itemList.add(itemIn);
		return itemIn.setRegistryName(Shizen.MOD_ID, key);
	}

	private static Item register(String key, Block blockIn, ItemGroup itemGroupIn) {
		return register(key, new BlockItem(blockIn, (new Item.Properties()).group(itemGroupIn)));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for (Item item : itemList) {
			event.getRegistry().register(item);
		}
	}
}
