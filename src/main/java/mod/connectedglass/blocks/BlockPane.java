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
        super(Properties.from(block));
        this.setRegistryName(modid, name);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        if ((adjacentBlockState.getBlock() instanceof BlockPane || adjacentBlockState.getBlock() instanceof BlockPaneStained)) {
            if (!side.getAxis().isHorizontal()) {
                return true;
            }

            if (state.get(FACING_TO_PROPERTY_MAP.get(side)) && adjacentBlockState.get(FACING_TO_PROPERTY_MAP.get(side.getOpposite()))) {
                return true;
            }
        }

        return super.isSideInvisible(state, adjacentBlockState, side);
    }

}
