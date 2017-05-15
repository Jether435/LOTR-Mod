package com.ModMayhem.LotR.Entity.AI;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.entity.projectile.EntityArrow;

public class EntityAISeigeUse extends EntityAIBase {
	protected int x;
	protected EntityLiving e;
	protected EntityLiving b;
	protected World worldObj;
	protected EntityLivingBase p;
	public EntityAISeigeUse(EntityLiving e, EntityLiving b, World w, EntityLivingBase p){
		this.e = e;
		this.b = b;
		this.worldObj = w;
		this.p = p;
	}
	@Override
	public boolean shouldExecute() {
		return false;
	}
	@Override
	public void updateTask(){
		x++;
		if (x == 10){
			this.e.getLookHelper().setLookPositionWithEntity(p, 1, 1);
			this.worldObj.spawnEntityInWorld(b);
			this.b.motionX += this.p.posX - this.e.posX;
			this.b.motionY += this.p.posY - this.e.posY;
			this.b.motionZ += this.p.posZ - this.e.posZ;
		
		}
		if (this.b.isCollided){
			new Explosion(worldObj, b, b.posX, b.posY, b.posZ, 12);
		}
	}

}
