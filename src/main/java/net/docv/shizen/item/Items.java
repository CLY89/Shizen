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
	public static final Item APRICOT_WOOD = register("apricot_wood", Blocks.APRICOT_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_LOG = register("apricot_log", Blocks.APRICOT_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_LEAVES = register("apricot_leaves", Blocks.APRICOT_LEAVES, ItemGroup.DECORATIONS);
	public static final Item APRICOT_SAPLING = register("apricot_sapling", Blocks.APRICOT_SAPLING, ItemGroup.MISC);

	public static final Item BANANA = register("banana", new Banana());
	public static final Item BANANA_WOOD = register("banana_wood", Blocks.BANANA_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_LOG = register("banana_log", Blocks.BANANA_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item BANANA_LEAVES = register("banana_leaves", Blocks.BANANA_LEAVES, ItemGroup.DECORATIONS);
	public static final Item BANANA_SAPLING = register("banana_sapling", Blocks.BANANA_SAPLING, ItemGroup.MISC);

	public static final Item GRAPE = register("grape", new Grape());
	public static final Item GRAPE_WOOD = register("grape_wood", Blocks.GRAPE_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_LOG = register("grape_log", Blocks.GRAPE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_LEAVES = register("grape_leaves", Blocks.GRAPE_LEAVES, ItemGroup.DECORATIONS);
	public static final Item GRAPE_SAPLING = register("grape_sapling", Blocks.GRAPE_SAPLING, ItemGroup.MISC);

	public static final Item LEMON = register("lemon", new Lemon());
	public static final Item LEMON_WOOD = register("lemon_wood", Blocks.LEMON_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_LOG = register("lemon_log", Blocks.LEMON_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_LEAVES = register("lemon_leaves", Blocks.LEMON_LEAVES, ItemGroup.DECORATIONS);
	public static final Item LEMON_SAPLING = register("lemon_sapling", Blocks.LEMON_SAPLING, ItemGroup.MISC);

	public static final Item PEACH = register("peach", new Peach());
	public static final Item PEACH_WOOD = register("peach_wood", Blocks.PEACH_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_LOG = register("peach_log", Blocks.PEACH_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_LEAVES = register("peach_leaves", Blocks.PEACH_LEAVES, ItemGroup.DECORATIONS);
	public static final Item PEACH_SAPLING = register("peach_sapling", Blocks.PEACH_SAPLING, ItemGroup.MISC);

	public static final Item ORANGE = register("orange", new Orange());
	public static final Item ORANGE_WOOD = register("orange_wood", Blocks.ORANGE_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_LOG = register("orange_log", Blocks.ORANGE_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_LEAVES = register("orange_leaves", Blocks.ORANGE_LEAVES, ItemGroup.DECORATIONS);
	public static final Item ORANGE_SAPLING = register("orange_sapling", Blocks.ORANGE_SAPLING, ItemGroup.MISC);

	public static final Item PEAR = register("pear", new Pear());
	public static final Item PEAR_WOOD = register("pear_wood", Blocks.PEAR_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_LOG = register("pear_log", Blocks.PEAR_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_LEAVES = register("pear_leaves", Blocks.PEAR_LEAVES, ItemGroup.DECORATIONS);
	public static final Item PEAR_SAPLING = register("pear_sapling", Blocks.PEAR_SAPLING, ItemGroup.MISC);

	public static final Item PLUM = register("plum", new Plum());
	public static final Item PLUM_WOOD = register("plum_wood", Blocks.PLUM_WOOD, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_LOG = register("plum_log", Blocks.PLUM_LOG, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_LEAVES = register("plum_leaves", Blocks.PLUM_LEAVES, ItemGroup.DECORATIONS);
	public static final Item PLUM_SAPLING = register("plum_sapling", Blocks.PLUM_SAPLING, ItemGroup.MISC);

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
