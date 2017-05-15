package com.ModMayhem.LotR.Entity;

import com.ModMayhem.LotR.Entity.AI.EntityAISwordThrow;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Assassin extends EntityMob{

	public Assassin(World w) {
		super(w);
		this.tasks.addTask(1, new EntityAISwordThrow());
		
	}
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D); // max health
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23D); // movement speed
    }


}
