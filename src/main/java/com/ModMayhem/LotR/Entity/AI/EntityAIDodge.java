package com.ModMayhem.LotR.Entity.AI;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class EntityAIDodge extends EntityAIBase{
protected EntityMob e;
public Random rand;
protected EntityLivingBase p;
public EntityAIDodge(EntityMob e, EntityLivingBase p){
	this.e = e;
	this.p = p;
	
}
@Override
public boolean shouldExecute() {
	return false;
}
@Override
public void updateTask(){
	if (this.e.getRNG().nextInt() == 4 && this.p.getDistanceSqToEntity(e) <= 1){
		if (this.e.posX == this.p.posX - 1 && this.e.getRNG().nextInt() == 3 ){
			this.e.motionX += -1;
			}
		if (this.e.posX == this.p.posX - 1 && this.e.getRNG().nextInt() == 6 ){
			this.e.motionX += 1;
			}
		if (this.e.posX == this.p.posX + 1 && this.e.getRNG().nextInt() == 5 ){
			this.e.motionX += -1;
			}
		if (this.e.posX == this.p.posX + 1 && this.e.getRNG().nextInt() == 7 ){
			this.e.motionX += 1;
			}
		if (this.e.posZ == this.p.posZ - 1 && this.e.getRNG().nextInt() == 11){
			this.e.motionX += 1;
			}
		if (this.e.posZ == this.p.posZ - 1 && this.e.getRNG().nextInt() == 10 ){
			this.e.motionX += -1;
			}
		if (this.e.posZ == this.p.posZ + 1 && this.e.getRNG().nextInt() == 8 ){
			this.e.motionX += 1;
			}
		if (this.e.posZ == this.p.posZ + 1 && this.e.getRNG().nextInt() == 9 ){
			this.e.motionX += -1;
			}
		if (this.e.posZ -1 == this.p.posX - 1 && this.e.getRNG().nextInt() == 38 ){
			this.e.motionZ += -1;
			}
		if (this.e.posZ - 1 == this.p.posX + 1 && this.e.getRNG().nextInt() == 18){
			this.e.motionZ += -1;
			}
		if (this.e.posZ + 1 == this.p.posX + 1 && this.e.getRNG().nextInt() == 16){
			this.e.motionZ += -1;
			}
		if (this.e.posZ + 1 == this.p.posX - 1 && this.e.getRNG().nextInt() == 15){
			this.e.motionZ += -1;
			}
		if (this.e.posZ -1 == this.p.posX - 1 && this.e.getRNG().nextInt() == 21 ){
			this.e.motionZ += 1;
			}
		if (this.e.posZ - 1 == this.p.posX + 1 && this.e.getRNG().nextInt() == 12 ){
			this.e.motionZ += 1;
			}
		if (this.e.posZ + 1 == this.p.posX + 1 && this.e.getRNG().nextInt() == 13 ){
			this.e.motionZ += 1;
			}
		if (this.e.posZ + 1 == this.p.posX - 1 && this.e.getRNG().nextInt() == 14 ){
			this.e.motionZ += 1;
			}
	}
}
}