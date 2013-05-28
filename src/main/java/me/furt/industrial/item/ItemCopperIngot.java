package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemCopperIngot extends GenericCustomItem {

	public ItemCopperIngot(IndustrialInc plugin, File texture) {
		super(plugin, "Copper Ingot");
		setTexture(texture);
	}
}
