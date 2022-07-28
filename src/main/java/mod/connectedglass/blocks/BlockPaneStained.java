package mod.connectedglass.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockPaneStained extends StainedGlassPaneBlock {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Contructor with predefined BlockProperty */
    public BlockPaneStained(Block block, DyeColor dyecolor) {
        super(dyecolor, Properties.copy(block));
    }





    //----------------------------------------SUPPORT----------------------------------------//

    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        if ((adjacentBlockState.getBlock() instanceof BlockPane || adjacentBlockState.getBlock() instanceof BlockPaneStained)) {
            if (!side.getAxis().isHorizontal()) {
                return true;
            }

            if (state.getValue(PROPERTY_BY_DIRECTION.get(side)) && adjacentBlockState.getValue(PROPERTY_BY_DIRECTION.get(side.getOpposite()))) {
                return true;
            }
        }

        return super.skipRendering(state, adjacentBlockState, side);
    }



}
