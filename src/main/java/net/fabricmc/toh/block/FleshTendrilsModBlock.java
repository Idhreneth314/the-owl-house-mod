package net.fabricmc.toh.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CobwebBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class FleshTendrilsModBlock extends PlantBlock {
    public FleshTendrilsModBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.25, 0.05f, 0.25));
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState2 = world.getBlockState(pos.down());
        return (blockState2.isOf(ModBlocks.FLESH_BLOCK) || blockState2.isOf(Blocks.STONE)) || blockState2.isOf(ModBlocks.TITANSTONE) && world.getBlockState(pos.up()).isLiquid();
    }
}
