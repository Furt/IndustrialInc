package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockMiningTube  extends GenericCubeCustomBlock{

	public BlockMiningTube(IndustrialInc plugin) {
        super(plugin, "Mining Tube", "https://dl.dropboxusercontent.com/u/17392489/IndustrialInc/miningtube.png", 16);
        this.setHardness(4.0F);
    }
}
