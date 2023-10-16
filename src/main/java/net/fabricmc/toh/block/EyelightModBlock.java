package net.fabricmc.toh.block;

import net.minecraft.block.*;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;

public class EyelightModBlock extends CobwebBlock implements Waterloggable {
    public EyelightModBlock(Settings settings) {
        super(settings);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState2 = world.getBlockState(pos.up());
        return (blockState2.isOf(ModBlocks.FLESH_BLOCK) || blockState2.isOf(Blocks.STONE)) || blockState2.isOf(ModBlocks.TITANSTONE) && !world.getBlockState(pos.up()).getMaterial().isLiquid();
    }
}
