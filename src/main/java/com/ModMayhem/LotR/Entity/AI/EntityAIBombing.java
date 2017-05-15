package com.ModMayhem.LotR.Entity.AI;

import com.ModMayhem.LotR.Entity.EntityBomb;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public class EntityAIBombing extends EntityAIBase{
	private int RunDelay;
	private PathEntity path;
	private World worldObj;
	private EntityLivingBase p;
	private EntityMob e;
	public EntityAIBombing(EntityMob e, World world, EntityLivingBase p){
		this.e = e;
		this.worldObj = world;
		this.p = p;
	}
	@Override
	public boolean shouldExecute() {
		EntityLivingBase target = this.e.getAttackTarget();
		if (target == null){
			return false;
		}
		else{
		p = target;
		path = e.getNavigator().getPathToEntityLiving(p);
		return true;
		}
	}
	  @Override
	    public void resetTask()
	    {
	        p = null;
	        e.getNavigator().clearPathEntity();
	    }
	   @Override
	    public void startExecuting()
	    {
	        e.getNavigator().setPath(path, 1);
	        RunDelay = 0;
	    }
	   @Override
	    public void updateTask()
	    {
	        e.getLookHelper().setLookPositionWithEntity(p, 30.0F, 30.0F);
	        if (this.e.getDistanceToEntity(p) <= 100)
	        {
	        	
	            RunDelay = 4 + e.getRNG().nextInt(7);
	            e.getNavigator().tryMoveToEntityLiving(p, 1);
	        }
	        if (e.getDistanceToEntity(p) < 4)
	        {
	            EntityBomb bomb = new EntityBomb(worldObj);				
				worldObj.spawnEntityInWorld(bomb);
				worldObj.playSoundAtEntity(e, "random.fuse", 1F, 1F);
	        }
	        
	        if ((this.e.isCollidedHorizontally && this.worldObj.blockExists((int)(this.e.posX + 1), (int)(this.e.posY + 1), (int)(this.e.posZ))) || (this.e.isCollidedHorizontally && this.worldObj.blockExists((int)(this.e.posX - 1), (int)(this.e.posY + 1), (int)(this.e.posZ))) || (this.e.isCollidedHorizontally && this.worldObj.blockExists((int)(this.e.posX), (int)(this.e.posY + 1), (int)(this.e.posZ + 1))) || (this.e.isCollidedHorizontally && this.worldObj.blockExists((int)(this.e.posX + 1), (int)(this.e.posY + 1), (int)(this.e.posZ - 1))))
	        {
	            EntityBomb bomb = new EntityBomb(worldObj);				
				worldObj.spawnEntityInWorld(bomb);
				worldObj.playSoundAtEntity(e, "random.fuse", 1F, 1F);
	        }
	    }
}
