package me.furt.industrial.item;

import java.io.File;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class ItemTinCell extends GenericCustomItem {

	public ItemTinCell(IndustrialInc plugin, File texture) {
		super(plugin, "Tin Cell");
		setTexture(texture);
	}
}
