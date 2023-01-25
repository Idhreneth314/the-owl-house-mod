package net.fabricmc.toh.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TallSandPlantBlock extends TallPlantBlock {
    public TallSandPlantBlock(Settings settings) {
        super(settings);
    }
@Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SAND);
    }
}
