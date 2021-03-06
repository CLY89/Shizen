package net.docv.shizen.item.fruits;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Lemon extends Item {
	public Lemon() {
		super(new Item.Properties()
				.food(new Food.Builder()
						.hunger(4)
						.saturation(1.2f)
						.setAlwaysEdible()
						.build())
				.group(ItemGroup.FOOD));
	}
}
