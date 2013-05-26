package me.furt.industrial.block.design;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;

public class DesignMiningPipe extends GenericCubeBlockDesign {

	public DesignMiningPipe(Plugin plugin, Texture texture, int[] textureId) {
		super(plugin, texture, textureId);
		setRenderPass(1);
	    setMinBrightness(0.0F);
	    setBrightness(0.5F);
	    setMaxBrightness(1.0F);
	    setBoundingBox(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
	    
	}

}
