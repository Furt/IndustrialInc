package me.furt.industrial.block.design;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Quad;

public class DesignMiningMachine extends GenericCubeBlockDesign {
	public DesignMiningMachine(IndustrialInc plugin) {
		super(plugin, plugin.assets.getTexture("block_machine"), 6);
		setRenderPass(0);
	    setMinBrightness(0.5F);
	    setBrightness(1.0F);
	    setMaxBrightness(1.0F);
	    setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	    
	    setQuadNumber(6);
	    Quad top = new Quad(0, texture.getSubTexture(23));
	    top.addVertex(0, 0F, 1F, 1F);
	    top.addVertex(1, 1F, 1F, 1F);
	    top.addVertex(2, 1F, 1F, 0F);
	    top.addVertex(3, 0F, 1F, 0F);
	    setQuad(top);
	    
	    Quad side1 = new Quad(1, texture.getSubTexture(38));
	    side1.addVertex(0, 0F, 0F, 1F);
	    side1.addVertex(1, 0F, 1F, 1F);
	    side1.addVertex(2, 0F, 1F, 0F);
	    side1.addVertex(3, 0F, 0F, 0F);
	    setQuad(side1);
	    
	    Quad side2 = new Quad(2, texture.getSubTexture(53));
	    side2.addVertex(0, 1F, 0F, 1F);
	    side2.addVertex(1, 1F, 1F, 1F);
	    side2.addVertex(2, 0F, 1F, 1F);
	    side2.addVertex(3, 0F, 0F, 1F);
	    setQuad(side2);
	    
	    Quad side3 = new Quad(3, texture.getSubTexture(68));
	    side3.addVertex(0, 1F, 0F, 0F);
	    side3.addVertex(1, 1F, 1F, 0F);
	    side3.addVertex(2, 1F, 1F, 1F);
	    side3.addVertex(3, 1F, 0F, 1F);
	    setQuad(side3);
	    
	    Quad side4 = new Quad(4, texture.getSubTexture(83));
	    side4.addVertex(0, 0F, 0F, 0F);
	    side4.addVertex(1, 0F, 1F, 0F);
	    side4.addVertex(2, 1F, 1F, 0F);
	    side4.addVertex(3, 1F, 0F, 0F);
	    setQuad(side4);
	    
	    Quad bottom = new Quad(5, texture.getSubTexture(98));
	    bottom.addVertex(0, 1F, 0F, 1F);
	    bottom.addVertex(1, 0F, 0F, 1F);
	    bottom.addVertex(2, 0F, 0F, 0F);
	    bottom.addVertex(3, 1F, 0F, 0F);
	    setQuad(bottom);
	}

}
