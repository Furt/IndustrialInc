package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockMiningMachine extends GenericCubeCustomBlock{

	public BlockMiningMachine(IndustrialInc plugin) {
        super(plugin, "Mining Machine", "https://dl.dropboxusercontent.com/u/17392489/IndustrialInc/MiningMachine.png", 16);
        this.setHardness(4.0F);
    }
}
