package mod.connectedglass;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class Register {

    // ...





    //----------------------------------------REGISTER----------------------------------------//

    /** registers Block and corresponding ItemBlock to ForgeRegistries */
    public static void registerBlock(Block block){
        ForgeRegistries.BLOCKS.register(block);
        BlockItem itemblock = new BlockItem(block, (new Item.Properties()));
        itemblock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemblock);
    }

    /** registers Block and predefined ItemBlock to ForgeRegistries */
    public static void registerBlock(Block block, BlockItem itemblock){
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemblock);
    }

    /** registers Item to ForgeRegistries */
    public static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
    }

    public static void registerTileEntite(BlockEntity tileentity){
        ForgeRegistries.BLOCK_ENTITIES.register(tileentity.getType());
    }

    public static void registerEntity(Entity entity){
        ForgeRegistries.ENTITIES.register(entity.getType());
    }



}
