package io.github.jihuayu.ancientswords.item.tool;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class Hammer extends ItemTool
{
    public static final Set<Block> effectiveBlocksIn = Sets.newHashSet(Blocks.STONE,Blocks.LOG,Blocks.LOG2);
    protected Hammer(ToolMaterial materialIn) {
        super(materialIn, effectiveBlocksIn);
    }
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {

        return super.onBlockDestroyed(stack,worldIn,state,pos,entityLiving);
    }
}
