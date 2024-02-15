package mod.connectedglass;

import mod.connectedglass.common.block.BlockGlass;
import mod.connectedglass.common.block.BlockGlassStained;
import mod.connectedglass.common.block.BlockPane;
import mod.connectedglass.common.block.BlockPaneStained;
import net.minecraft.world.item.*;
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

@SuppressWarnings("unused")
public class Register {
	
	// Create Deferred Registers to hold whatever is written in <...> which will all be registered under the MODID namespace
	private static final DeferredRegister<Block>               BLOCKS         = DeferredRegister.create(ForgeRegistries.BLOCKS,             "minecraft");
	private static final DeferredRegister<Item>                ITEMS          = DeferredRegister.create(ForgeRegistries.ITEMS,              "minecraft");
	
	
	
	
	
	// ---------- ---------- ---------- ----------  BLOCKS / ITEMS  ---------- ---------- ---------- ---------- //
	
	// ----- Glass Blocks ----- //
	public static final RegistryObject<Block> BLOCK_GLASS_CLEAR      = register("glass",                    () -> new BlockGlass(       Blocks.GLASS                                   ),      true);
	public static final RegistryObject<Block> BLOCK_GLASS_WHITE      = register("white_stained_glass",      () -> new BlockGlassStained(Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE),      true);
	public static final RegistryObject<Block> BLOCK_GLASS_ORANGE     = register("orange_stained_glass",     () -> new BlockGlassStained(Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE),     true);
	public static final RegistryObject<Block> BLOCK_GLASS_MAGENTA    = register("magenta_stained_glass",    () -> new BlockGlassStained(Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA),    true);
	public static final RegistryObject<Block> BLOCK_GLASS_LIGHT_BLUE = register("light_blue_stained_glass", () -> new BlockGlassStained(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE), true);
	public static final RegistryObject<Block> BLOCK_GLASS_YELLOW     = register("yellow_stained_glass",     () -> new BlockGlassStained(Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW),     true);
	public static final RegistryObject<Block> BLOCK_GLASS_LIME       = register("lime_stained_glass",       () -> new BlockGlassStained(Blocks.LIME_STAINED_GLASS,       DyeColor.LIME),       true);
	public static final RegistryObject<Block> BLOCK_GLASS_PINK       = register("pink_stained_glass",       () -> new BlockGlassStained(Blocks.PINK_STAINED_GLASS,       DyeColor.PINK),       true);
	public static final RegistryObject<Block> BLOCK_GLASS_GRAY       = register("gray_stained_glass",       () -> new BlockGlassStained(Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY),       true);
	public static final RegistryObject<Block> BLOCK_GLASS_LIGHT_GRAY = register("light_gray_stained_glass", () -> new BlockGlassStained(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY), true);
	public static final RegistryObject<Block> BLOCK_GLASS_CYAN       = register("cyan_stained_glass",       () -> new BlockGlassStained(Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN),       true);
	public static final RegistryObject<Block> BLOCK_GLASS_PURPLE     = register("purple_stained_glass",     () -> new BlockGlassStained(Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE),     true);
	public static final RegistryObject<Block> BLOCK_GLASS_BLUE       = register("blue_stained_glass",       () -> new BlockGlassStained(Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE),       true);
	public static final RegistryObject<Block> BLOCK_GLASS_BROWN      = register("brown_stained_glass",      () -> new BlockGlassStained(Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN),      true);
	public static final RegistryObject<Block> BLOCK_GLASS_GREEN      = register("green_stained_glass",      () -> new BlockGlassStained(Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN),      true);
	public static final RegistryObject<Block> BLOCK_GLASS_RED        = register("red_stained_glass",        () -> new BlockGlassStained(Blocks.RED_STAINED_GLASS,        DyeColor.RED),        true);
	public static final RegistryObject<Block> BLOCK_GLASS_BLACK      = register("black_stained_glass",      () -> new BlockGlassStained(Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK),      true);
	
	// ----- Glass Panes ----- //
	public static final RegistryObject<Block> BLOCK_PANE_CLEAR      = register("glass_pane",                    () -> new BlockPane(       Blocks.GLASS                                        ),      true);
	public static final RegistryObject<Block> BLOCK_PANE_WHITE      = register("white_stained_glass_pane",      () -> new BlockPaneStained(Blocks.WHITE_STAINED_GLASS_PANE,      DyeColor.WHITE),      true);
	public static final RegistryObject<Block> BLOCK_PANE_ORANGE     = register("orange_stained_glass_pane",     () -> new BlockPaneStained(Blocks.ORANGE_STAINED_GLASS_PANE,     DyeColor.ORANGE),     true);
	public static final RegistryObject<Block> BLOCK_PANE_MAGENTA    = register("magenta_stained_glass_pane",    () -> new BlockPaneStained(Blocks.MAGENTA_STAINED_GLASS_PANE,    DyeColor.MAGENTA),    true);
	public static final RegistryObject<Block> BLOCK_PANE_LIGHT_BLUE = register("light_blue_stained_glass_pane", () -> new BlockPaneStained(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE), true);
	public static final RegistryObject<Block> BLOCK_PANE_YELLOW     = register("yellow_stained_glass_pane",     () -> new BlockPaneStained(Blocks.YELLOW_STAINED_GLASS_PANE,     DyeColor.YELLOW),     true);
	public static final RegistryObject<Block> BLOCK_PANE_LIME       = register("lime_stained_glass_pane",       () -> new BlockPaneStained(Blocks.LIME_STAINED_GLASS_PANE,       DyeColor.LIME),       true);
	public static final RegistryObject<Block> BLOCK_PANE_PINK       = register("pink_stained_glass_pane",       () -> new BlockPaneStained(Blocks.PINK_STAINED_GLASS_PANE,       DyeColor.PINK),       true);
	public static final RegistryObject<Block> BLOCK_PANE_GRAY       = register("gray_stained_glass_pane",       () -> new BlockPaneStained(Blocks.GRAY_STAINED_GLASS_PANE,       DyeColor.GRAY),       true);
	public static final RegistryObject<Block> BLOCK_PANE_LIGHT_GRAY = register("light_gray_stained_glass_pane", () -> new BlockPaneStained(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY), true);
	public static final RegistryObject<Block> BLOCK_PANE_CYAN       = register("cyan_stained_glass_pane",       () -> new BlockPaneStained(Blocks.CYAN_STAINED_GLASS_PANE,       DyeColor.CYAN),       true);
	public static final RegistryObject<Block> BLOCK_PANE_PURPLE     = register("purple_stained_glass_pane",     () -> new BlockPaneStained(Blocks.PURPLE_STAINED_GLASS_PANE,     DyeColor.PURPLE),     true);
	public static final RegistryObject<Block> BLOCK_PANE_BLUE       = register("blue_stained_glass_pane",       () -> new BlockPaneStained(Blocks.BLUE_STAINED_GLASS_PANE,       DyeColor.BLUE),       true);
	public static final RegistryObject<Block> BLOCK_PANE_BROWN      = register("brown_stained_glass_pane",      () -> new BlockPaneStained(Blocks.BROWN_STAINED_GLASS_PANE,      DyeColor.BROWN),      true);
	public static final RegistryObject<Block> BLOCK_PANE_GREEN      = register("green_stained_glass_pane",      () -> new BlockPaneStained(Blocks.GREEN_STAINED_GLASS_PANE,      DyeColor.GREEN),      true);
	public static final RegistryObject<Block> BLOCK_PANE_RED        = register("red_stained_glass_pane",        () -> new BlockPaneStained(Blocks.RED_STAINED_GLASS_PANE,        DyeColor.RED),        true);
	public static final RegistryObject<Block> BLOCK_PANE_BLACK      = register("black_stained_glass_pane",      () -> new BlockPaneStained(Blocks.BLACK_STAINED_GLASS_PANE,      DyeColor.BLACK),      true);
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SETUP  ---------- ---------- ---------- ---------- //
	
	static void setup(FMLCommonSetupEvent event){
		// RegisterMod.register("acecraft");
	}
	
	@OnlyIn(Dist.CLIENT)
	static void setup(FMLClientSetupEvent event){
		// event.enqueueWork(() -> { });
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  REGISTER  ---------- ---------- ---------- ---------- //
	
	// registers all deferred registries to the game
	public static void register(IEventBus bus){
		BLOCKS.register(        bus);
		ITEMS.register(         bus);
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SUPPORT  ---------- ---------- ---------- ---------- //
	
	private static RegistryObject<Block> register(String name, java.util.function.Supplier<? extends Block> block, boolean b){
		RegistryObject<Block> rob = BLOCKS.register(name, block);
		if(b){ ITEMS.register(name, () -> new BlockItem(rob.get(), (new Item.Properties()))); }
		return rob;
	}
	
	
	
	
}