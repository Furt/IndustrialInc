package me.furt.industrial.block;

import me.furt.industrial.IndustrialInc;
import me.furt.industrial.block.design.DesignGenericBlock;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class BlockMiningTubeTip extends GenericCubeCustomBlock {

	public BlockMiningTubeTip(IndustrialInc plugin) {
		super(plugin, "Mining Tube Tip", new DesignGenericBlock(plugin, plugin.assets.getTexture("block_0"), 36));
		this.setHardness(3.0F);
	}
}
