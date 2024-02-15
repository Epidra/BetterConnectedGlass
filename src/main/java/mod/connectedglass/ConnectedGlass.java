package mod.connectedglass;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("connectedglass")
public class ConnectedGlass {
	
	// Define mod id in a common place for everything to reference
	public static final String MODID = "connectedglass";
	
	
	
	
	
	// ---------- ---------- ---------- ----------  CONSTRUCTOR  ---------- ---------- ---------- ---------- //
	
	public ConnectedGlass() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
		
		MinecraftForge.EVENT_BUS.register(this);
		Register.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SETUP  ---------- ---------- ---------- ---------- //
	
	private void setupCommon(final FMLCommonSetupEvent event) {
		Register.setup(event);
	}
	
	private void setupClient(final FMLClientSetupEvent event) {
		Register.setup(event);
	}
	
	
	
}