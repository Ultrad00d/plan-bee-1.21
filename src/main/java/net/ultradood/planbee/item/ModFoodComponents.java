package net.ultradood.planbee.item;


import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent OVERHEATED_HONEY_BOTTLE = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(1.2f)
            .build();
    public static final FoodComponent SWEET_BERRIES_WITH_HONEY = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
    public static final FoodComponent BREAD_WITH_HONEY = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .build();
    public static final FoodComponent COOKIE_WITH_HONEY = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
}
