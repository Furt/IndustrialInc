package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockTinOre extends GenericCubeCustomBlock {

	public BlockTinOre(IndustrialInc plugin) {
		super(
				plugin,
				"Tin Ore",
				"https://dl.dropboxusercontent.com/u/17392489/IndustrialInc/tinore.png",
				16);
		this.setHardness(4.0F);
	}
}
