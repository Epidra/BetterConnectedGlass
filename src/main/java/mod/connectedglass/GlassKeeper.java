package mod.connectedglass;

import mod.connectedglass.blocks.BlockGlass;
import mod.connectedglass.blocks.BlockGlassStained;
import mod.connectedglass.blocks.BlockPane;
import mod.connectedglass.blocks.BlockPaneStained;
import mod.shared.Register;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ForgeRegistries;

public class GlassKeeper {

    public static final Block BLOCK_GLASS_CLEAR      = new BlockGlass("minecraft", "glass", Blocks.GLASS);
    public static final Block BLOCK_GLASS_WHITE      = new BlockGlassStained("minecraft", "white_stained_glass",      Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE);
    public static final Block BLOCK_GLASS_ORANGE     = new BlockGlassStained("minecraft", "orange_stained_glass",     Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE);
    public static final Block BLOCK_GLASS_MAGENTA    = new BlockGlassStained("minecraft", "magenta_stained_glass",    Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA);
    public static final Block BLOCK_GLASS_LIGHT_BLUE = new BlockGlassStained("minecraft", "light_blue_stained_glass", Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE);
    public static final Block BLOCK_GLASS_YELLOW     = new BlockGlassStained("minecraft", "yellow_stained_glass",     Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW);
    public static final Block BLOCK_GLASS_LIME       = new BlockGlassStained("minecraft", "lime_stained_glass",       Blocks.LIME_STAINED_GLASS,       DyeColor.LIME);
    public static final Block BLOCK_GLASS_PINK       = new BlockGlassStained("minecraft", "pink_stained_glass",       Blocks.PINK_STAINED_GLASS,       DyeColor.PINK);
    public static final Block BLOCK_GLASS_GRAY       = new BlockGlassStained("minecraft", "gray_stained_glass",       Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY);
    public static final Block BLOCK_GLASS_LIGHT_GRAY = new BlockGlassStained("minecraft", "light_gray_stained_glass", Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY);
    public static final Block BLOCK_GLASS_CYAN       = new BlockGlassStained("minecraft", "cyan_stained_glass",       Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN);
    public static final Block BLOCK_GLASS_PURPLE     = new BlockGlassStained("minecraft", "purple_stained_glass",     Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE);
    public static final Block BLOCK_GLASS_BLUE       = new BlockGlassStained("minecraft", "blue_stained_glass",       Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE);
    public static final Block BLOCK_GLASS_BROWN      = new BlockGlassStained("minecraft", "brown_stained_glass",      Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN);
    public static final Block BLOCK_GLASS_GREEN      = new BlockGlassStained("minecraft", "green_stained_glass",      Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN);
    public static final Block BLOCK_GLASS_RED        = new BlockGlassStained("minecraft", "red_stained_glass",        Blocks.RED_STAINED_GLASS,        DyeColor.RED);
    public static final Block BLOCK_GLASS_BLACK      = new BlockGlassStained("minecraft", "black_stained_glass",      Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK);

    public static final Block BLOCK_PANE_CLEAR      = new BlockPane("minecraft", "glass_pane", Blocks.GLASS);
    public static final Block BLOCK_PANE_WHITE      = new BlockPaneStained("minecraft", "white_stained_glass_pane",      Blocks.WHITE_STAINED_GLASS_PANE,      DyeColor.WHITE);
    public static final Block BLOCK_PANE_ORANGE     = new BlockPaneStained("minecraft", "orange_stained_glass_pane",     Blocks.ORANGE_STAINED_GLASS_PANE,     DyeColor.ORANGE);
    public static final Block BLOCK_PANE_MAGENTA    = new BlockPaneStained("minecraft", "magenta_stained_glass_pane",    Blocks.MAGENTA_STAINED_GLASS_PANE,    DyeColor.MAGENTA);
    public static final Block BLOCK_PANE_LIGHT_BLUE = new BlockPaneStained("minecraft", "light_blue_stained_glass_pane", Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE);
    public static final Block BLOCK_PANE_YELLOW     = new BlockPaneStained("minecraft", "yellow_stained_glass_pane",     Blocks.YELLOW_STAINED_GLASS_PANE,     DyeColor.YELLOW);
    public static final Block BLOCK_PANE_LIME       = new BlockPaneStained("minecraft", "lime_stained_glass_pane",       Blocks.LIME_STAINED_GLASS_PANE,       DyeColor.LIME);
    public static final Block BLOCK_PANE_PINK       = new BlockPaneStained("minecraft", "pink_stained_glass_pane",       Blocks.PINK_STAINED_GLASS_PANE,       DyeColor.PINK);
    public static final Block BLOCK_PANE_GRAY       = new BlockPaneStained("minecraft", "gray_stained_glass_pane",       Blocks.GRAY_STAINED_GLASS_PANE,       DyeColor.GRAY);
    public static final Block BLOCK_PANE_LIGHT_GRAY = new BlockPaneStained("minecraft", "light_gray_stained_glass_pane", Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY);
    public static final Block BLOCK_PANE_CYAN       = new BlockPaneStained("minecraft", "cyan_stained_glass_pane",       Blocks.CYAN_STAINED_GLASS_PANE,       DyeColor.CYAN);
    public static final Block BLOCK_PANE_PURPLE     = new BlockPaneStained("minecraft", "purple_stained_glass_pane",     Blocks.PURPLE_STAINED_GLASS_PANE,     DyeColor.PURPLE);
    public static final Block BLOCK_PANE_BLUE       = new BlockPaneStained("minecraft", "blue_stained_glass_pane",       Blocks.BLUE_STAINED_GLASS_PANE,       DyeColor.BLUE);
    public static final Block BLOCK_PANE_BROWN      = new BlockPaneStained("minecraft", "brown_stained_glass_pane",      Blocks.BROWN_STAINED_GLASS_PANE,      DyeColor.BROWN);
    public static final Block BLOCK_PANE_GREEN      = new BlockPaneStained("minecraft", "green_stained_glass_pane",      Blocks.GREEN_STAINED_GLASS_PANE,      DyeColor.GREEN);
    public static final Block BLOCK_PANE_RED        = new BlockPaneStained("minecraft", "red_stained_glass_pane",        Blocks.RED_STAINED_GLASS_PANE,        DyeColor.RED);
    public static final Block BLOCK_PANE_BLACK      = new BlockPaneStained("minecraft", "black_stained_glass_pane",      Blocks.BLACK_STAINED_GLASS_PANE,      DyeColor.BLACK);

    public static void registerBlocks() {
        // Blocks
        registerBlock(BLOCK_GLASS_CLEAR     , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_WHITE     , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_ORANGE    , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_MAGENTA   , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_LIGHT_BLUE, ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_YELLOW    , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_LIME      , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_PINK      , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_GRAY      , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_LIGHT_GRAY, ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_CYAN      , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_PURPLE    , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_BLUE      , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_BROWN     , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_GREEN     , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_RED       , ItemGroup.TAB_BUILDING_BLOCKS);
        registerBlock(BLOCK_GLASS_BLACK     , ItemGroup.TAB_BUILDING_BLOCKS);

        registerBlock(BLOCK_PANE_CLEAR     , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_WHITE     , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_ORANGE    , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_MAGENTA   , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_LIGHT_BLUE, ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_YELLOW    , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_LIME      , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_PINK      , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_GRAY      , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_LIGHT_GRAY, ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_CYAN      , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_PURPLE    , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_BLUE      , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_BROWN     , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_GREEN     , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_RED       , ItemGroup.TAB_DECORATIONS);
        registerBlock(BLOCK_PANE_BLACK     , ItemGroup.TAB_DECORATIONS);
    }

    /** registers Block and corresponding ItemBlock to ForgeRegistries */
    public static void registerBlock(Block block, ItemGroup group){
        ForgeRegistries.BLOCKS.register(block);
        BlockItem itemblock = new BlockItem(block, (new Item.Properties()).tab(group));
        itemblock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemblock);
    }

}
