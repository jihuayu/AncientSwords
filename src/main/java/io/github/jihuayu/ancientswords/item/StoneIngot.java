package io.github.jihuayu.ancientswords.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StoneIngot extends Item
{
    public StoneIngot(){
        this.setMaxStackSize(64);
        this.setMaxDamage(0);
        this.setUnlocalizedName("stone_ingot");
        this.setRegistryName("stone_ingot");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
    public void Render(){
        ModelResourceLocation model = new ModelResourceLocation(this.getRegistryName(), "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this,0, model);
    }
}
