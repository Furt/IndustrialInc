package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;
import me.furt.industrial.block.design.DesignTube;

import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class BlockMiningTube extends GenericCuboidCustomBlock {

	public BlockMiningTube(IndustrialInc plugin) {
		super(plugin, "Mining Tube", new DesignTube(plugin));
		this.setHardness(4.0F);
	}
}
