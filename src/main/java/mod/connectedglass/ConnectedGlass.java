package mod.connectedglass;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("connectedglass")
public class ConnectedGlass {

    public static final String MODID = "connectedglass";





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    public ConnectedGlass() {
        MinecraftForge.EVENT_BUS.register(this);
        GlassKeeper.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



}
