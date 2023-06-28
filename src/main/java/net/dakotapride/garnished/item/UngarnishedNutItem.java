package net.dakotapride.garnished.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UngarnishedNutItem extends UngarnishedFoodItem {
	public UngarnishedNutItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.2F).nutrition(3)
				.effect(new MobEffectInstance(MobEffects.CONFUSION, 240), 1.0F).build()));
	}
}
