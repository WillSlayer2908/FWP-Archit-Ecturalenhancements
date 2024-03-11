package com.forgewolfproductions.fwparchitecturalenhancements;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.function.Supplier;

public class CommonProxy {
    public void preInitializationEvent(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain("fwparchitecturalenhancements");

    }

    public void initializationEvent(FMLInitializationEvent event) {

    }

    public void postInitializationEvent(FMLPostInitializationEvent event) {

    }


    public void registerRenderers() {

    }

    public void registerRecipes() {

    }


    public void serverLoad(FMLServerStartingEvent event) {
    }
}

