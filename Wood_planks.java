package com.avard.tame_them.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import com.avard.tame_them.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Wood_planks extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150095_b;

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

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 4));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 6));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 10));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 11));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 12));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 13));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 14));
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