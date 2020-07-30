package com.avard.tame_them.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.avard.tame_them.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Wood_planks extends Block
{
    //@SideOnly(Side.CLIENT)
    public IIcon[] field_150095_b;

    public Wood_planks()
    {
        super(Material.wood);
        this.setCreativeTab(main.tab1);
        this.setStepSound(soundTypeWood);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ >= this.field_150095_b.length)
        {
            p_149691_2_ = 0;
        }

        return this.field_150095_b[p_149691_2_];
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }
    
    
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        ret.add(new ItemStack(Item.getItemFromBlock(this), 1, metadata));
        return ret;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    //@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
        for (int i = 0; i < 15; ++i)
        {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
    	world.setBlockMetadataWithNotify(x, y, z, itemStack.getItemDamage(), 3);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150095_b = new IIcon[15];

        for (int i = 0; i < this.field_150095_b.length; ++i)
        {
           this.field_150095_b[i] = p_149651_1_.registerIcon(this.getTextureName() + i);
        }
    }
}