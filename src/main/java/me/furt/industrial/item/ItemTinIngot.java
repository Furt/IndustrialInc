package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemTinIngot extends GenericCustomItem {

	public ItemTinIngot(IndustrialInc plugin, File texture) {
		super(plugin, "Tin Ingot");
		setTexture(texture);
	}
}
