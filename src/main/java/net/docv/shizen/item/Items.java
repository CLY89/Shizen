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
	public static final Item APRICOT_WOOD = register("apricot_tree", Blocks.APRICOT_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_LOG = register("apricot_tree_log", Blocks.APRICOT_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_LEAVES = register("apricot_tree_leaves", Blocks.APRICOT_LEAVES, ItemGroup.DECORATIONS);
	//public static final Item APRICOT_WOOD_SAPLING = register("apricot_tree_sapling", Blocks.APRICOT_WOOD_SAPLING, ItemGroup.);

	public static final Item BANANA = register("banana", new Banana());
	public static final Item BANANA_WOOD = register("banana_tree", Blocks.BANANA_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_LOG = register("banana_tree_log", Blocks.BANANA_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_LEAVES = register("banana_tree_leaves", Blocks.BANANA_LEAVES, ItemGroup.DECORATIONS);

	public static final Item GRAPE = register("grape", new Grape());
	public static final Item GRAPE_WOOD = register("grape_tree", Blocks.GRAPE_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_LOG = register("grape_tree_log", Blocks.GRAPE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_LEAVES = register("grape_tree_leaves", Blocks.GRAPE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item LEMON = register("lemon", new Lemon());
	public static final Item LEMON_WOOD = register("lemon_tree", Blocks.LEMON_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_LOG = register("lemon_tree_log", Blocks.LEMON_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_LEAVES = register("lemon_tree_leaves", Blocks.LEMON_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PEACH = register("peach", new Peach());
	public static final Item PEACH_WOOD = register("peach_tree", Blocks.PEACH_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_LOG = register("peach_tree_log", Blocks.PEACH_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_LEAVES = register("peach_tree_leaves", Blocks.PEACH_LEAVES, ItemGroup.DECORATIONS);

	public static final Item ORANGE = register("orange", new Orange());
	public static final Item ORANGE_WOOD = register("orange_tree", Blocks.ORANGE_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_LOG = register("orange_tree_log", Blocks.ORANGE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_LEAVES = register("orange_tree_leaves", Blocks.ORANGE_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PEAR = register("pear", new Pear());
	public static final Item PEAR_WOOD = register("pear_tree", Blocks.PEAR_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_LOG = register("pear_tree_log", Blocks.PEAR_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_LEAVES = register("pear_tree_leaves", Blocks.PEAR_LEAVES, ItemGroup.DECORATIONS);

	public static final Item PLUM = register("plum", new Plum());
	public static final Item PLUM_WOOD = register("plum_tree", Blocks.PLUM_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_LOG = register("plum_tree_log", Blocks.PLUM_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_LEAVES = register("plum_tree_leaves", Blocks.PLUM_LEAVES, ItemGroup.DECORATIONS);

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
