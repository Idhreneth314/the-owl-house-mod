package net.fabricmc.toh.item;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ModGlyphItem extends Item {
    public ModGlyphItem(Settings settings) {
        super(settings);
    }
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();
        BlockState blockState = world.getBlockState(blockPos);

        if (playerEntity != null) { // Make sure the player exists
            freezeWater(playerEntity, world, context.getBlockPos(), 3); // Call the freezeWater method
        }

        return ActionResult.SUCCESS; // Return ActionResult indicating success
    }

    public void freezeWater(LivingEntity playerEntity, World world, BlockPos blockPos, int level) {
        if (playerEntity.isAlive()) {
            BlockState blockState = Blocks.FROSTED_ICE.getDefaultState();
            float f = (float) Math.min(16, 2 + level);
            BlockPos.Mutable mutable = new BlockPos.Mutable();
            BlockPos.stream(blockPos.add(-f, 0.0, -f), blockPos.add(f, 0.0, f)).forEach((blockPos2) -> {
                if (blockPos2.isWithinDistance(playerEntity.getPos(), f)) {
                    mutable.set(blockPos2.getX(), blockPos2.getY() + 1, blockPos2.getZ());
                    BlockState blockState2 = world.getBlockState(mutable);
                    if (blockState2.isAir()) {
                        BlockState blockState3 = world.getBlockState(blockPos2);
                        if (blockState3.getMaterial() == Material.WATER && blockState3.get(FluidBlock.LEVEL) == 0 && blockState.canPlaceAt(world, blockPos2) && world.canPlace(blockState, blockPos2, ShapeContext.absent())) {
                            world.setBlockState(blockPos2, blockState);
                            world.scheduleBlockTick(blockPos2, Blocks.FROSTED_ICE, MathHelper.nextInt(playerEntity.getRandom(), 60, 120));
                        }
                    }
                }
            });
        }
    }
}
