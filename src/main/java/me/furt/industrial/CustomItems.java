package me.furt.industrial;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.furt.industrial.item.ItemTemperedIron;

public class CustomItems {
	private IndustrialInc plugin;

	public ItemTemperedIron temperedIronIngot;
	
	public CustomItems(IndustrialInc instance) {
		this.plugin = instance;
		
	}
	
	public void init() {
		temperedIronIngot = new ItemTemperedIron(plugin);
		
		//recipes
		ItemStack riiResult = new SpoutItemStack(temperedIronIngot, 2);
		SpoutShapedRecipe riirecipe = new SpoutShapedRecipe(riiResult);
		riirecipe.shape("   ", " AA", "  B");
		riirecipe.setIngredient('A', MaterialData.ironIngot);
		riirecipe.setIngredient('B', MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(riirecipe);
	}

}
