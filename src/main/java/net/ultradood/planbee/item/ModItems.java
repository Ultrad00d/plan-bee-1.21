package net.ultradood.planbee.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ultradood.planbee.PlanBee;

import static net.ultradood.planbee.PlanBee.MOD_ID;

public class ModItems {
    public static final Item COOKIE_WITH_HONEY = registerItem("cookie_with_honey", new Item(new Item.Settings()
            .food(ModFoodComponents.COOKIE_WITH_HONEY)));
    public static final Item BREAD_WITH_HONEY = registerItem("bread_with_honey", new Item(new Item.Settings()
            .food(ModFoodComponents.BREAD_WITH_HONEY)));
    public static final Item SWEET_BERRIES_WITH_HONEY = registerItem("sweet_berries_with_honey", new Item(new Item.Settings()
            .food(ModFoodComponents.SWEET_BERRIES_WITH_HONEY)));
    public static final Item OVERHEATED_HONEY_BOTTLE = registerItem("overheated_honey_bottle", new OverheatedHoneyBottle(new Item.Settings()
            .food(ModFoodComponents.OVERHEATED_HONEY_BOTTLE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlanBee.LOGGER.info("Registering Mod Items for " + MOD_ID);
    }
}
