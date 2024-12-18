package net.matt.christmas.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent EGGNOG = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SPEED,
                    200),
                    0.15f)
            .build();

    public static final FoodComponent HOT_COCOA = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .build();

}
