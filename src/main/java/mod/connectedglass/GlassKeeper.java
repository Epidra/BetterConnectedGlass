package mod.connectedglass;

import mod.connectedglass.blocks.BlockGlass;
import mod.connectedglass.blocks.BlockGlassStained;
import mod.connectedglass.blocks.BlockPane;
import mod.connectedglass.blocks.BlockPaneStained;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GlassKeeper {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    private static final DeferredRegister<Item>  ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS,  "minecraft");





    // Blocks
    public static final RegistryObject<Block> BLOCK_GLASS_CLEAR      = register("glass",                    () -> new BlockGlass(       Blocks.GLASS                                   ),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_WHITE      = register("white_stained_glass",      () -> new BlockGlassStained(Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_ORANGE     = register("orange_stained_glass",     () -> new BlockGlassStained(Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_MAGENTA    = register("magenta_stained_glass",    () -> new BlockGlassStained(Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_LIGHT_BLUE = register("light_blue_stained_glass", () -> new BlockGlassStained(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_YELLOW     = register("yellow_stained_glass",     () -> new BlockGlassStained(Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_LIME       = register("lime_stained_glass",       () -> new BlockGlassStained(Blocks.LIME_STAINED_GLASS,       DyeColor.LIME),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_PINK       = register("pink_stained_glass",       () -> new BlockGlassStained(Blocks.PINK_STAINED_GLASS,       DyeColor.PINK),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_GRAY       = register("gray_stained_glass",       () -> new BlockGlassStained(Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_LIGHT_GRAY = register("light_gray_stained_glass", () -> new BlockGlassStained(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_CYAN       = register("cyan_stained_glass",       () -> new BlockGlassStained(Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_PURPLE     = register("purple_stained_glass",     () -> new BlockGlassStained(Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_BLUE       = register("blue_stained_glass",       () -> new BlockGlassStained(Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_BROWN      = register("brown_stained_glass",      () -> new BlockGlassStained(Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_GREEN      = register("green_stained_glass",      () -> new BlockGlassStained(Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_RED        = register("red_stained_glass",        () -> new BlockGlassStained(Blocks.RED_STAINED_GLASS,        DyeColor.RED),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_GLASS_BLACK      = register("black_stained_glass",      () -> new BlockGlassStained(Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK),      CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Panes
    public static final RegistryObject<Block> BLOCK_PANE_CLEAR      = register("glass_pane",                    () -> new BlockPane(       Blocks.GLASS                                        ),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_WHITE      = register("white_stained_glass_pane",      () -> new BlockPaneStained(Blocks.WHITE_STAINED_GLASS_PANE,      DyeColor.WHITE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_ORANGE     = register("orange_stained_glass_pane",     () -> new BlockPaneStained(Blocks.ORANGE_STAINED_GLASS_PANE,     DyeColor.ORANGE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_MAGENTA    = register("magenta_stained_glass_pane",    () -> new BlockPaneStained(Blocks.MAGENTA_STAINED_GLASS_PANE,    DyeColor.MAGENTA),    CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_LIGHT_BLUE = register("light_blue_stained_glass_pane", () -> new BlockPaneStained(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_YELLOW     = register("yellow_stained_glass_pane",     () -> new BlockPaneStained(Blocks.YELLOW_STAINED_GLASS_PANE,     DyeColor.YELLOW),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_LIME       = register("lime_stained_glass_pane",       () -> new BlockPaneStained(Blocks.LIME_STAINED_GLASS_PANE,       DyeColor.LIME),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_PINK       = register("pink_stained_glass_pane",       () -> new BlockPaneStained(Blocks.PINK_STAINED_GLASS_PANE,       DyeColor.PINK),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_GRAY       = register("gray_stained_glass_pane",       () -> new BlockPaneStained(Blocks.GRAY_STAINED_GLASS_PANE,       DyeColor.GRAY),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_LIGHT_GRAY = register("light_gray_stained_glass_pane", () -> new BlockPaneStained(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_CYAN       = register("cyan_stained_glass_pane",       () -> new BlockPaneStained(Blocks.CYAN_STAINED_GLASS_PANE,       DyeColor.CYAN),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_PURPLE     = register("purple_stained_glass_pane",     () -> new BlockPaneStained(Blocks.PURPLE_STAINED_GLASS_PANE,     DyeColor.PURPLE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_BLUE       = register("blue_stained_glass_pane",       () -> new BlockPaneStained(Blocks.BLUE_STAINED_GLASS_PANE,       DyeColor.BLUE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_BROWN      = register("brown_stained_glass_pane",      () -> new BlockPaneStained(Blocks.BROWN_STAINED_GLASS_PANE,      DyeColor.BROWN),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_GREEN      = register("green_stained_glass_pane",      () -> new BlockPaneStained(Blocks.GREEN_STAINED_GLASS_PANE,      DyeColor.GREEN),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_RED        = register("red_stained_glass_pane",        () -> new BlockPaneStained(Blocks.RED_STAINED_GLASS_PANE,        DyeColor.RED),        CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_PANE_BLACK      = register("black_stained_glass_pane",      () -> new BlockPaneStained(Blocks.BLACK_STAINED_GLASS_PANE,      DyeColor.BLACK),      CreativeModeTab.TAB_DECORATIONS);





    //----------------------------------------REGISTER----------------------------------------//

    static void register(IEventBus FMLbus){
        BLOCKS.register(    FMLbus);
        ITEMS.register(     FMLbus);
    }

    private static RegistryObject<Block> register(String name, java.util.function.Supplier<? extends Block> block, CreativeModeTab CreativeModeTab){
        RegistryObject<Block> rob = BLOCKS.register(name, block);
        if(CreativeModeTab != null){ ITEMS.register(name, () -> new BlockItem(rob.get(), (new Item.Properties()).tab(CreativeModeTab))); }
        return rob;
    }



}
