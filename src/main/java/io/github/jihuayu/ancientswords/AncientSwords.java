package io.github.jihuayu.ancientswords;

import io.github.jihuayu.ancientswords.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AncientSwords.MODID, name = AncientSwords.NAME, version = AncientSwords.VERSION)
public class AncientSwords
{
    public static final String MODID = "ancient_swords";
    public static final String NAME = "Ancient Swords";
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @Mod.Instance(AncientSwords.MODID)
    public static AncientSwords instance;

    @SidedProxy(clientSide = "io.github.jihuayu.ancientswords.proxy.ClientProxy",
            serverSide = "io.github.jihuayu.ancientswords.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
