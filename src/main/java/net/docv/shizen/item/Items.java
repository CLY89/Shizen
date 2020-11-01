package net.docv.shizen.item;

import java.util.ArrayList;
import java.util.List;

import net.docv.shizen.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "shizen", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items {
	public static List<Item> itemList = new ArrayList<Item>();
	public static final Item BANANA = register("banana", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item APRICOT = register("apricot", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item PEACH = register("peach", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item PLUM = register("plum", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item PEAR = register("pear", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item ORANGE = register("orange", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item GRAPE = register("grape", new Item((new Item.Properties()).group(ItemGroup.FOOD)));
	public static final Item LEMON = register("lemon", new Item((new Item.Properties()).group(ItemGroup.FOOD)));

	public static final Item BANANA_TREE_BLOCK = register("banana_tree_block", Blocks.BANANA_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item APRICOT_TREE_BLOCK = register("apricot_tree_block", Blocks.APRICOT_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item GRAPE_TREE_BLOCK = register("grape_tree_block", Blocks.GRAPE_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item LEMON_TREE_BLOCK = register("olive_tree_block", Blocks.LEMON_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item ORANGE_TREE_BLOCK = register("orange_tree_block", Blocks.ORANGE_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEACH_TREE_BLOCK = register("peach_tree_block", Blocks.PEACH_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item PEAR_TREE_BLOCK = register("pear_tree_block", Blocks.PEAR_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);
	public static final Item PLUM_TREE_BLOCK = register("plum_tree_block", Blocks.PLUM_TREE_BLOCK, ItemGroup.BUILDING_BLOCKS);

	private static Item register(String key, Item itemIn) {
		itemList.add(itemIn);
		return itemIn.setRegistryName("shizen", key);
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
