package com.crindigo.emcredits;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EMCredits.MOD_ID, name = EMCredits.NAME, version = EMCredits.VERSION,
        dependencies = "required-after:gregtech@[2.4.0,);")
public class EMCredits
{
    public static final String MOD_ID = "emcredits";
    public static final String NAME = "EM Credits";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance
    public static EMCredits instance;

    @SidedProxy(modId = MOD_ID, clientSide = "com.crindigo.emcredits.ClientProxy",
            serverSide = "com.crindigo.emcredits.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void onStartup(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
