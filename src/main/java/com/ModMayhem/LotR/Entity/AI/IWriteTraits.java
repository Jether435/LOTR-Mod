package com.ModMayhem.LotR.Entity.AI;

import com.ModMayhem.LotR.Nemesis.NameGen;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class IWriteTraits {
	public String Name;
	private NBTTagCompound Tag;
	public void WriteTraitsAndName(NBTTagCompound Tag, EntityMob e){
		this.Tag = Tag;
		Tag.setString("Name", Name);
		this.Name = NameGen.getName();
		String list = e.tasks.taskEntries.toString();
		NBTTagCompound Tag1 = new NBTTagCompound();
		Tag1.setString("traits", list);
		NBTTagCompound c = new NBTTagCompound();
	}
	public String ReadTraitsAndName(){
		return Tag.getString(Name);
	}
}
