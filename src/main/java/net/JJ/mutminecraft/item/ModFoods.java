package net.JJ.mutminecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_MEAT = new FoodProperties.Builder().meat().nutrition(3).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 150), 0.3F).build();
    public static final FoodProperties COOKED_MEAT = new FoodProperties.Builder().meat().nutrition(9).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200), 0.6F).build();

}
