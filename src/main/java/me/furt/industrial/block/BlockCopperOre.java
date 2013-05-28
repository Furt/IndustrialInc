package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;
import me.furt.industrial.block.design.DesignGenericBlock;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockCopperOre extends GenericCubeCustomBlock {

	public BlockCopperOre(IndustrialInc plugin) {
		super(plugin, "Copper Ore", new DesignGenericBlock(plugin,
				plugin.assets.getTexture("block_0"), 32));
		this.setHardness(4.0F);
	}
}
