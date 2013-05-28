package me.furt.industrial.block.design;

import me.furt.industrial.IndustrialInc;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Quad;

public class DesignTube extends GenericCuboidBlockDesign {

	public DesignTube(IndustrialInc plugin) {
		super(plugin, plugin.assets.getTexture("block_0"), 0, 0.38F, 0.0F, 0.38F, 0.62F, 1.0F, 0.62F);
		setRenderPass(0);
	    setMinBrightness(0.5F);
	    setBrightness(1.0F);
	    setMaxBrightness(1.0F);
	    setBoundingBox(0.38F, 0.0F, 0.38F, 0.62F, 1.0F, 0.62F);
	    
	    setQuadNumber(6);
	    Quad top = new Quad(0, texture.getSubTexture(35));
	    top.addVertex(0, 0.38F, 1F, 0.62F);
	    top.addVertex(1, 0.62F, 1F, 0.62F);
	    top.addVertex(2, 0.62F, 1F, 0.38F);
	    top.addVertex(3, 0.38F, 1F, 0.38F);
	    setQuad(top);
	    
	    Quad side1 = new Quad(1, texture.getSubTexture(35));
	    side1.addVertex(0, 0.38F, 0F, 0.62F);
	    side1.addVertex(1, 0.38F, 1F, 0.62F);
	    side1.addVertex(2, 0.38F, 1F, 0.38F);
	    side1.addVertex(3, 0.38F, 0F, 0.38F);
	    setQuad(side1);
	    
	    Quad side2 = new Quad(2, texture.getSubTexture(35));
	    side2.addVertex(0, 0.62F, 0F, 0.62F);
	    side2.addVertex(1, 0.62F, 1F, 0.62F);
	    side2.addVertex(2, 0.38F, 1F, 0.62F);
	    side2.addVertex(3, 0.38F, 0F, 0.62F);
	    setQuad(side2);
	    
	    Quad side3 = new Quad(3, texture.getSubTexture(35));
	    side3.addVertex(0, 0.62F, 0F, 0.38F);
	    side3.addVertex(1, 0.62F, 1F, 0.38F);
	    side3.addVertex(2, 0.62F, 1F, 0.62F);
	    side3.addVertex(3, 0.62F, 0F, 0.62F);
	    setQuad(side3);
	    
	    Quad side4 = new Quad(4, texture.getSubTexture(35));
	    side4.addVertex(0, 0.38F, 0F, 0.38F);
	    side4.addVertex(1, 0.38F, 1F, 0.38F);
	    side4.addVertex(2, 0.62F, 1F, 0.38F);
	    side4.addVertex(3, 0.62F, 0F, 0.38F);
	    setQuad(side4);
	    
	    Quad bottom = new Quad(5, texture.getSubTexture(35));
	    bottom.addVertex(0, 0.62F, 0F, 0.62F);
	    bottom.addVertex(1, 0.38F, 0F, 0.62F);
	    bottom.addVertex(2, 0.38F, 0F, 0.38F);
	    bottom.addVertex(3, 0.62F, 0F, 0.38F);
	    setQuad(bottom);
	}
}