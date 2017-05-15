package com.ModMayhem.LotR.Traits;

import com.sun.xml.internal.stream.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTTagCompound;

public class Necromancer extends EntityAIBase{
	protected EntityMob e;
	protected EntityMob n;
	private NBTTagCompound tag;
	public Necromancer(EntityMob e, EntityMob n){
		this.e = e;
		this.n = n;
	}
	@Override
	public boolean shouldExecute() {
		if(this.e.getDistanceToEntity(n) <= 9){
		return true;
		}
		return false;
	}
	@Override
	public void startExecuting(){
		this.n.writeEntityToNBT(tag);
	}


}
