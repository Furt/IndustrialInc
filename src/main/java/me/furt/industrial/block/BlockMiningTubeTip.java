package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockMiningTubeTip extends GenericCubeCustomBlock {

	public BlockMiningTubeTip(IndustrialInc plugin) {
		super(
				plugin,
				"Mining Tube Tip",
				"https://dl.dropboxusercontent.com/u/17392489/IndustrialInc/miningtubetip.png",
				16);
		this.setHardness(7.0F);
	}
}
