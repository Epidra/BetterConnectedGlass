package mod.connectedglass.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockPane extends IronBarsBlock {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Contructor with predefined BlockProperty */
    public BlockPane(Block block) {
        super(Properties.copy(block));
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
