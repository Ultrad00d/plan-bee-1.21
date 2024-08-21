package net.ultradood.planbee.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.ultradood.planbee.PlanBee;


public class CandleMedovikBlock extends CandleCakeBlock {
    public CandleMedovikBlock(Block candle, Settings settings) {
        super(candle, settings);
    }
    /*
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ActionResult actionResult = MedovikBlock.eatDaCake(world, pos, ModBlocks.MEDOVIK.getDefaultState(), player);
        PlanBee.LOGGER.info("\n\nPLAN_BEE_LOGGING FROM CandleMedovikBlock");
        PlanBee.LOGGER.info("PLAN_BEE_LOG: actionResult - " + actionResult);
        PlanBee.LOGGER.info("PLAN_BEE_LOG: state - " + state);
        PlanBee.LOGGER.info("PLAN_BEE_LOG: Blocks.CAKE.getDefaultState() - " + Blocks.CAKE.getDefaultState());
        PlanBee.LOGGER.info("PLAN_BEE_LOG: ModBlocks.MEDOVIK.getDefaultState() - " + ModBlocks.MEDOVIK.getDefaultState());
        PlanBee.LOGGER.info("PLAN_BEE_LOG: Blocks.CANDLE_CAKE.getDefaultState() - " + Blocks.CANDLE_CAKE.getDefaultState());
        PlanBee.LOGGER.info("PLAN_BEE_LOG: state.getBlock().getDefaultState() - " + state.getBlock().getDefaultState());
        if (actionResult.isAccepted()) {
            dropStacks(state, world, pos);
        }
        return actionResult;


    }
    */
}
