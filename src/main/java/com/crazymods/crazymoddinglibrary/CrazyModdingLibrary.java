package com.crazymods.crazymoddinglibrary;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrazyModdingLibrary.MOD_ID)
public class CrazyModdingLibrary
{
    public static final String MOD_ID = "crazymoddinglibrary";

    public CrazyModdingLibrary()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
