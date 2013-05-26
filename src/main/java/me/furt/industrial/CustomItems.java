package me.furt.industrial;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.furt.industrial.item.ItemTemperedIron;

public class CustomItems {
	private IndustrialInc plugin;

	public static ItemTemperedIron temperedIronIngot;
	
	public CustomItems(IndustrialInc instance) {
		this.plugin = instance;
		
	}
	
	public void init() {
		temperedIronIngot = new ItemTemperedIron(plugin);
		
		//recipes
		ItemStack riiResult = new SpoutItemStack(temperedIronIngot, 2);
		SpoutShapedRecipe recipe = new SpoutShapedRecipe(riiResult);
		recipe.shape("CCC", "CAA", "CCB");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.coal);
		recipe.setIngredient('C', MaterialData.air);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	}

}
