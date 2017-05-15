package com.ModMayhem.LotR.Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.monster.EntityMob;

public class HasTraits {
//Specify Types of Traits for Styled Characters.
//Incompatible opposites such as immune to and vulnerable to.
public boolean isTraitable;
protected BufferedReader input;
protected EntityMob e;
public char a;
public HasTraits(EntityMob e){
	this.e = e;
}
public static String getRandomEntry()
{
    Random rand = new Random();
    ArrayList<String> list = readFile();
    return list.get(rand.nextInt(list.size()));
}
public static ArrayList<String> readFile()
{
    String s;
    ArrayList<String> list = new ArrayList<String>();

    try
    {
        String FileDir = "Nemesis/AbilityNames.txt";
        File file = new File(FileDir);
        if (!file.exists())
        {
            file.createNewFile();
        }
        @SuppressWarnings("resource")
		BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(FileDir)));

        while ((s = input.readLine()) != null)
        {
            list.add(s);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }

    return list;
}
public void Apply(){
	String applyString;
	applyString = getRandomEntry();
}
}