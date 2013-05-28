package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemTemperedIronIngot extends GenericCustomItem {

	public ItemTemperedIronIngot(IndustrialInc plugin, File texture) {
		super(plugin, "Tempered Iron Ingot");
		setTexture(texture);
	}

}
