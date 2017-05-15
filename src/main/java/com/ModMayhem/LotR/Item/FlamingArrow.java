package com.ModMayhem.LotR.Item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class FlamingArrow extends Item{
	public EntityLivingBase p;
	public EntityMob e;
	public void use(){
	if (p.getHeldItem().getItem() == Items.bow){
		
	}
	}
}
