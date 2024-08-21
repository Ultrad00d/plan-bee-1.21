package net.ultradood.planbee.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import net.ultradood.planbee.PlanBee;

public class MedovikBlock extends CakeBlock {

    public MedovikBlock(Settings settings) {
        super(settings);
    }
    /*
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            if (eatDaCake(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }

            if (player.getStackInHand(Hand.MAIN_HAND).isEmpty()) {
                return ActionResult.CONSUME;
            }
        }
        return eatDaCake(world, pos, state, player);
    }
    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Item item = stack.getItem();
        if (stack.isIn(ItemTags.CANDLES) && state.get(BITES) == 0 && Block.getBlockFromItem(item) instanceof CandleBlock candleBlock) {
            stack.decrementUnlessCreative(1, player);
            world.playSound(null, pos, SoundEvents.BLOCK_CAKE_ADD_CANDLE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.setBlockState(pos, CandleCakeBlock.getCandleCakeFromCandle(candleBlock));
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.USED.getOrCreateStat(item));
            return ItemActionResult.SUCCESS;
        } else {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
    }
    public static ActionResult eatDaCake(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        } else {
            player.incrementStat(Stats.EAT_CAKE_SLICE);
            player.getHungerManager().add(2, 0.5f);
            int i = state.get(BITES);
            world.emitGameEvent(player, GameEvent.EAT, pos);
            if (i < 6) {
                world.setBlockState(pos, state.with(BITES, i + 1), Block.NOTIFY_ALL);
            } else {
                world.removeBlock(pos, false);
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
            PlanBee.LOGGER.info("\n\nPLAN_BEE_LOGGING FROM MedovikBlock");
            PlanBee.LOGGER.info("PLAN_BEE_LOG: state - " + state);
            PlanBee.LOGGER.info("PLAN_BEE_LOG: state.getBlock() - " + state.getBlock());
            PlanBee.LOGGER.info("PLAN_BEE_LOG: state.getBlock().getDefaultState() - " + state.getBlock().getDefaultState());
            PlanBee.LOGGER.info("PLAN_BEE_LOG: ModBlocks.MEDOVIK.getDefaultState() - " + ModBlocks.MEDOVIK.getDefaultState());
            return ActionResult.SUCCESS;
        }
    }
    */
}
