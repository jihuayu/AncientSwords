package io.github.jihuayu.ancientswords.proxy;

import io.github.jihuayu.ancientswords.item.StoneIngot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public static Item StoneIngot = new StoneIngot();
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void init(FMLInitializationEvent event)
    {
//        RegistryEvent
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}