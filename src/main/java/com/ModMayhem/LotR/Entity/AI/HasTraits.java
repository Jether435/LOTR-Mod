package com.ModMayhem.LotR.Entity.AI;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;

public class HasTraits {
	/**
    public NBTTagCompound writeToNBT(NBTTagCompound p_77955_1_)
    {
        p_77955_1_.setShort("id", (short)Item.getIdFromItem(this.field_151002_e));
        p_77955_1_.setByte("Count", (byte)this.stackSize);
        p_77955_1_.setShort("Damage", (short)this.itemDamage);

        if (this.stackTagCompound != null)
        {
            p_77955_1_.setTag("tag", this.stackTagCompound);
        }

        return p_77955_1_;
    }
    */
	
    /**
     * Read the stack fields from a NBT object.
     */
    
    /**
    public void readFromNBT(NBTTagCompound p_77963_1_)
    {
        func_150996_a(Item.getItemById(p_77963_1_.getShort("id")));
        this.stackSize = p_77963_1_.getByte("Count");
        this.itemDamage = p_77963_1_.getShort("Damage");
        if (p_77963_1_.hasKey("tag", 10))
        {
            this.stackTagCompound = p_77963_1_.getCompoundTag("tag");
        }
    }
    */

}
