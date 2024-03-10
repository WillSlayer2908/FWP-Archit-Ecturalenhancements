package com.forgewolfproductions.fwparchitecturalenhancements;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import com.forgewolfproductions.fwparchitecturalenhancements.IProxy;

public class ClientProxy implements IProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain("fwparchitecturalenhancements");
    }
    @Override
    public void init(FMLInitializationEvent event) {
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
    }
    @Override
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
