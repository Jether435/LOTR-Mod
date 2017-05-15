package com.ModMayhem.LotR.Entity.AI;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityAISwordThrow extends EntityAIBase{
	public World w;
	public EntityMob e;
	public EntityLiving s;
	public EntityLivingBase p;
	public Vec3 Throwpos;
	@Override
	public boolean shouldExecute() {
	if(this.e.getRNG().nextInt() == 102 && this.e.getDistanceToEntity(p) <= 8){
		return true;
	}else{
		return false;
	}
	}
	@Override
	public void startExecuting(){
		this.Throwpos.xCoord = this.p.prevPosX;
		this.Throwpos.yCoord = this.p.prevPosY;
		this.Throwpos.zCoord = this.p.prevPosZ;
	}
	@Override
	public void updateTask(){
		this.e.getLookHelper().setLookPositionWithEntity(p, 1, 1);
		this.w.spawnEntityInWorld(s);
		this.s.motionX = (this.Throwpos.xCoord - this.e.posX);
		this.s.motionY = (this.Throwpos.yCoord - this.e.posY);
		this.s.motionZ = (this.Throwpos.zCoord - this.e.posZ);
	}

}
