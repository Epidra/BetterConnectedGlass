package mod.betterglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockGlass extends GlassBlock {

    /** Contructor with predefined BlockProperty */
    public BlockGlass(String modid, String name, Block block) {
        super(Properties.from(block));
        this.setRegistryName(modid, name);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return (adjacentBlockState.getBlock() instanceof BlockGlass || adjacentBlockState.getBlock() instanceof BlockGlassStained) ? true : super.isSideInvisible(state, adjacentBlockState, side);
    }

}
