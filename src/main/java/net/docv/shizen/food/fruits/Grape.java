package net.docv.shizen.food.fruits;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Grape extends Item {
	public Grape() {
		super(new Item.Properties()
				.food(new Food.Builder()
						.hunger(4)
						.saturation(1.2f)
						.setAlwaysEdible()
						.build())
				.group(ItemGroup.FOOD));
	}
}
