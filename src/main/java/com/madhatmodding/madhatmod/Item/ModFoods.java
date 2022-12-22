package com.madhatmodding.madhatmod.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    // 1 nutrition = 0.5 a hunger leg;

    public static final FoodProperties COFFEE_CUP = stew(6).fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 0.3F).build();

    public static final FoodProperties COFFEE_CUP2 = stew(6).fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 0.3F).build();

    public static final FoodProperties PEACH = (new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build());

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
}
