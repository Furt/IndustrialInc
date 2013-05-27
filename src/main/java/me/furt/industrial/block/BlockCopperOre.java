package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockCopperOre extends GenericCubeCustomBlock {

	public BlockCopperOre(IndustrialInc plugin) {
		super(
				plugin,
				"Copper Ore",
				"https://dl.dropboxusercontent.com/u/17392489/IndustrialInc/copperore.png",
				16);
		this.setHardness(4.0F);
	}
}
