package com.ModMayhem.LotR.Nemesis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import com.ModMayhem.LotR.Traits.AmbusherAI;
import com.ModMayhem.LotR.Traits.BloodThirsty;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import akka.actor.dsl.Inbox.Get;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;

public class TraitFactory {
public EntityMob e;
public TraitFactory(){
	AddTrait(e);
}
public static EntityAIBase MakeTrait(){
	Random rand = null;
	ArrayList<Object> list2 = new ArrayList<Object>();
	ArrayList<Object> list = new ArrayList<Object>();
	list.add(TraitList.Ambusher);
	list.add(TraitList.ArmouredMount);
	list.add(TraitList.Assassin);
	list.add(TraitList.Backlash);
	list.add(TraitList.BattleHardened);
	list.add(TraitList.BeastMaster);
	list.add(TraitList.BloodThirsty);
	list.add(TraitList.BodySlam);
	list.add(TraitList.BoomerangThrow);
	list.add(TraitList.Cautious);
	list.add(TraitList.Charge);
	list.add(TraitList.Clumsy);
	list.add(TraitList.CombatMaster);
	list.add(TraitList.Deadly);
	list.add(TraitList.Deflect);
	list.add(TraitList.DeflectAndCounter);
	list.add(TraitList.Demanding);
	list.add(TraitList.ExplosiveArrows);
	list.add(TraitList.Fast);
	list.add(TraitList.Fearless);
	list.add(TraitList.FearOfBetrayal);
	list.add(TraitList.FearOfBurning);
	list.add(TraitList.FearOfCaragors);
	list.add(TraitList.FearOfGhuls);
	list.add(TraitList.FearOfGraugs);
	list.add(TraitList.FearOfMorgaiFlies);
	list.add(TraitList.FearOfRival);
	list.add(TraitList.FireWeapon);
	list.add(TraitList.Fury);
	list.add(TraitList.Grapple);
	list.add(TraitList.GroundPound);
	list.add(TraitList.HateOfBurns);
	list.add(TraitList.HateOfDefeat);
	list.add(TraitList.HateOfCaragors);
	list.add(TraitList.HateOfGhuls);
	list.add(TraitList.HateOfGraugs);
	list.add(TraitList.HateOfGuardSuffer);
	list.add(TraitList.HateOfMasterSuffering);
	list.add(TraitList.HateOfMorgaiFlies);
	list.add(TraitList.HateOfRival);
	list.add(TraitList.HeavyHit);
	list.add(TraitList.Humiliator);
	list.add(TraitList.Initiative);
	list.add(TraitList.Inspiring);
	list.add(TraitList.InvunerableToFinishers);
	list.add(TraitList.InvunerableToRanged);
	list.add(TraitList.InvunerableToStealth);
	list.add(TraitList.JumpAttack);
	list.add(TraitList.Mangler);
	list.add(TraitList.Marksman);
	list.add(TraitList.MonsterKiller);
	list.add(TraitList.Necromancer);
	list.add(TraitList.NoChance);
	list.add(TraitList.PoisonCloud);
	list.add(TraitList.PoisonWeapon);
	list.add(TraitList.PowerLevel);
	list.add(TraitList.QuickShoot);
	list.add(TraitList.Quickturn);
	list.add(TraitList.RapidHit);
	list.add(TraitList.Regenerator);
	list.add(TraitList.Respawning);
	list.add(TraitList.SavageWeapons);
	list.add(TraitList.Skirmisher);
	list.add(TraitList.Sniffer);
	list.add(TraitList.Sniper);
	list.add(TraitList.Stealthy);
	list.add(TraitList.Summoner);
	list.add(TraitList.Tank);
	list.add(TraitList.ThroatGrab);
	list.add(TraitList.Tracker);
	list.add(TraitList.Trickster);
	list.add(TraitList.VaultBreaker);
	list.add(TraitList.VunerableToFinishers);
	list.add(TraitList.VunerableToMountedBeasts);
	list.add(TraitList.VunerableToRanged);
	list.add(TraitList.VunerableToStealthFinishers);
	list.add(TraitList.Wrecker);
	@SuppressWarnings("null")
	Object randomAI = list.get(rand.nextInt(list.size()));
	return (EntityAIBase) randomAI;
	}
public void AddTrait(EntityMob e){
	this.e = e;
	if(this.e.worldObj.findingSpawnPoint){
	if(this.e.worldObj.getLoadedEntityList().contains(e));
	if (this.e.addedToChunk){
		this.e.tasks.addTask(1, MakeTrait());
	}
	}
	//if(this.e.onSpawnWithEgg(data){	
	//	}
}
}