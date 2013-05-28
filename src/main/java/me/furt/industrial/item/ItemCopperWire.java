package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemCopperWire extends GenericCustomItem {

	public ItemCopperWire(IndustrialInc plugin, File texture) {
		super(plugin, "Copper Wire");
		setTexture(texture);
	}
}
