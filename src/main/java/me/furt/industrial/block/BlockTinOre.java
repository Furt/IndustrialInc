package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;
import me.furt.industrial.block.design.DesignGenericBlock;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockTinOre extends GenericCubeCustomBlock {

	public BlockTinOre(IndustrialInc plugin) {
		super(plugin, "Tin Ore", new DesignGenericBlock(plugin,
				plugin.assets.getTexture("block_0"), 33));
		this.setHardness(4.0F);
	}
}
