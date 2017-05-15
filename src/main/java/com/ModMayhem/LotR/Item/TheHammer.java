package com.ModMayhem.LotR.Item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class TheHammer extends ItemSword{

	public TheHammer(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}
	@Override
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		itemstack.damageItem(2, entityplayer);
		return useHammer(itemstack, world, entityplayer);
	}
	public static ItemStack useHammer(ItemStack itemstack, World world, EntityLivingBase p)
	{
		return itemstack;
	}
}