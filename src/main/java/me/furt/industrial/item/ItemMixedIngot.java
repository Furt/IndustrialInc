package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemMixedIngot extends GenericCustomItem {

	public ItemMixedIngot(IndustrialInc plugin, File texture) {
		super(plugin, "Mixed Ingot");
		setTexture(texture);
	}
}
