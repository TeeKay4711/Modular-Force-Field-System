package mffs.common.item;

import java.util.List;

import mffs.common.MFFSMachines;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

public class ItemCapacitorUpgradeRange extends ItemMFFSBase
{
	public ItemCapacitorUpgradeRange(int i)
	{
		super(i);
		setIconIndex(33);
		setMaxStackSize(9);
	}

	public String getTextureFile()
	{
		return "/chb/mods/mffs/sprites/items.png";
	}

	public boolean isRepairable()
	{
		return false;
	}

	public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean b)
	{
		if ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)))
		{
			info.add("compatible with:");
			info.add("MFFS " + MFFSMachines.Capacitor.displayName);
		}
		else
		{
			info.add("compatible with: (Hold Shift)");
		}
	}
}