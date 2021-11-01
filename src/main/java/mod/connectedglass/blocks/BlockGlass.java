package mod.connectedglass.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockGlass extends GlassBlock {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Contructor with predefined BlockProperty */
    public BlockGlass(String modid, String name, Block block) {
        super(Properties.copy(block));
        this.setRegistryName(modid, name);
    }





    //----------------------------------------SUPPORT----------------------------------------//

    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() instanceof BlockGlass || adjacentBlockState.getBlock() instanceof BlockGlassStained || super.skipRendering(state, adjacentBlockState, side);
    }



}
