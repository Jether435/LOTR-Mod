package com.ModMayhem.LotR.Music;

import java.io.File;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.EntityLivingBase;

public class MusicEvent extends Event{
	private int x;
	private boolean bool;
	

	protected String nameOfSong;
	protected EntityLivingBase p;
	protected File file = new File("resources/musicPacks/");
	public void getSongName(){
		this.file.getPath();
	}
	public void DoMusic(){
		x++;
		if (x == 2999){
			this.p.playSound("resources/musicPacks/" + this.nameOfSong , 1.0F, 1.0F);
			this.x = 0;
		}
	}
}
