package mod.connectedglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockGlassStained extends StainedGlassBlock {

    /** Contructor with predefined BlockProperty */
    public BlockGlassStained(String modid, String name, Block block, DyeColor dyecolor) {
        super(dyecolor, Properties.from(block));
        this.setRegistryName(modid, name);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return (adjacentBlockState.getBlock() instanceof BlockGlass || adjacentBlockState.getBlock() instanceof BlockGlassStained) ? true : super.isSideInvisible(state, adjacentBlockState, side);
    }

}
