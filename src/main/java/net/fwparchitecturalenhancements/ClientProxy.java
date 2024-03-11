package net.fwparchitecturalenhancements;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = FwparchitecturalenhancementsMod.MODID ,value = Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInitializationEvent(FMLPreInitializationEvent event) {
        super.preInitializationEvent(event);
        OBJLoader.INSTANCE.addDomain("fwparchitecturalenhancements");
    }

    @Override
    public void initializationEvent(FMLInitializationEvent event) {
        super.initializationEvent(event);
    }

    @Override
    public void postInitializationEvent(FMLPostInitializationEvent event) {
        super.postInitializationEvent(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

    }

    @Override
    public void registerRenderers() {

    }


}
