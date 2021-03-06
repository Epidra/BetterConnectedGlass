package mod.connectedglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockPane extends PaneBlock {

    /** Contructor with predefined BlockProperty */
    public BlockPane(String modid, String name, Block block) {
        super(Properties.copy(block));
        this.setRegistryName(modid, name);
    }

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
