package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class EnderJellyFoodItem extends Item implements IGarnishedUtilities {
	public EnderJellyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.ENDER_JELLY));
	}
}
