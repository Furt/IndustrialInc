package me.furt.industrial.block.design;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;

public class DesignGenericBlock extends GenericCubeBlockDesign {

	public DesignGenericBlock(IndustrialInc plugin, Texture texture, int[] textureid) {
		super(plugin, texture, textureid);
	}
	
	public DesignGenericBlock(IndustrialInc plugin, Texture texture, int textureid) {
		super(plugin, texture, textureid);
	}

}
