package net.ultradood.planbee.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ultradood.planbee.PlanBee;

import static net.ultradood.planbee.PlanBee.MOD_ID;

public class ModBlocks {

    public static final Block MEDOVIK = registerBlockWithItem("medovik",
            new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final Block CANDLE_MEDOVIK = registerBlock("candle_medovik",
            new CandleCakeBlock(Blocks.CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block WHITE_CANDLE_MEDOVIK = registerBlock("white_candle_medovik",
            new CandleCakeBlock(Blocks.WHITE_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block LIGHT_GRAY_CANDLE_MEDOVIK = registerBlock("light_gray_candle_medovik",
            new CandleCakeBlock(Blocks.LIGHT_GRAY_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block GRAY_CANDLE_MEDOVIK = registerBlock("gray_candle_medovik",
            new CandleCakeBlock(Blocks.GRAY_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block BLACK_CANDLE_MEDOVIK = registerBlock("black_candle_medovik",
            new CandleCakeBlock(Blocks.BLACK_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block BROWN_CANDLE_MEDOVIK = registerBlock("brown_candle_medovik",
            new CandleCakeBlock(Blocks.BROWN_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block RED_CANDLE_MEDOVIK = registerBlock("red_candle_medovik",
            new CandleCakeBlock(Blocks.RED_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block ORANGE_CANDLE_MEDOVIK = registerBlock("orange_candle_medovik",
            new CandleCakeBlock(Blocks.ORANGE_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block YELLOW_CANDLE_MEDOVIK = registerBlock("yellow_candle_medovik",
            new CandleCakeBlock(Blocks.YELLOW_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block LIME_CANDLE_MEDOVIK = registerBlock("lime_candle_medovik",
            new CandleCakeBlock(Blocks.LIME_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block GREEN_CANDLE_MEDOVIK = registerBlock("green_candle_medovik",
            new CandleCakeBlock(Blocks.GREEN_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block CYAN_CANDLE_MEDOVIK = registerBlock("cyan_candle_medovik",
            new CandleCakeBlock(Blocks.CYAN_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block LIGHT_BLUE_CANDLE_MEDOVIK = registerBlock("light_blue_candle_medovik",
            new CandleCakeBlock(Blocks.LIGHT_BLUE_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block BLUE_CANDLE_MEDOVIK = registerBlock("blue_candle_medovik",
            new CandleCakeBlock(Blocks.BLUE_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block PURPLE_CANDLE_MEDOVIK = registerBlock("purple_candle_medovik",
            new CandleCakeBlock(Blocks.PURPLE_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block MAGENTA_CANDLE_MEDOVIK = registerBlock("magenta_candle_medovik",
            new CandleCakeBlock(Blocks.MAGENTA_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));
    public static final Block PINK_CANDLE_MEDOVIK = registerBlock("pink_candle_medovik",
            new CandleCakeBlock(Blocks.PINK_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    private static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PlanBee.LOGGER.info("Registering mod blocks for " + MOD_ID);
    }
}
