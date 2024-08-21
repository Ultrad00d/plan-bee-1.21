package net.ultradood.planbee.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ultradood.planbee.PlanBee;
import net.ultradood.planbee.block.ModBlocks;

import static net.ultradood.planbee.PlanBee.MOD_ID;

public class ModItemGroups {
    public static final ItemGroup PLAN_BEE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "plan_bee_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SWEET_BERRIES_WITH_HONEY))
                    .displayName(Text.translatable("itemgroup.plan_bee.plan_bee"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OVERHEATED_HONEY_BOTTLE);
                        entries.add(ModItems.BREAD_WITH_HONEY);
                        entries.add(ModItems.COOKIE_WITH_HONEY);
                        entries.add(ModItems.SWEET_BERRIES_WITH_HONEY);
                        entries.add(ModBlocks.MEDOVIK);
                    })
                    .build());

    public static void registerItemGroups() {
        PlanBee.LOGGER.info("Registring Item Groups for " + MOD_ID);
    }
}
