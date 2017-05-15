package com.ModMayhem.LotR.Entity;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

public class EntityBomb extends EntityTNTPrimed{

	public EntityBomb(World w) {
		super(w);
		
	}
	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.fuse = 40 + 20;
		dataWatcher.addObject(16, Integer.valueOf(1));
	}
	 private void explode()
     {
 		worldObj.newExplosion(this, posX, posY, posZ, 60, true, true);
     }
	@Override
    public void onUpdate()
    {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        motionY -= 0.04D;
        moveEntity(motionX, motionY, motionZ);
        motionX *= 0.98D;
        motionY *= 0.98D;
        motionZ *= 0.98D;

        if (onGround)
        {
            motionX *= 0.7D;
            motionZ *= 0.7D;
            motionY *= -0.5D;
        }

        if (fuse-- <= 0 && !worldObj.isRemote)
        {
            setDead();
            explode();
        }
       
    }

}
