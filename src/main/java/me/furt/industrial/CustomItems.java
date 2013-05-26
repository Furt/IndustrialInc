package me.furt.industrial;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.furt.industrial.item.ItemCopperIngot;
import me.furt.industrial.item.ItemCopperWire;
import me.furt.industrial.item.ItemMixedIngot;
import me.furt.industrial.item.ItemTemperedIronIngot;
import me.furt.industrial.item.ItemTinCell;
import me.furt.industrial.item.ItemTinIngot;

public class CustomItems {
	private IndustrialInc plugin;

	public ItemTemperedIronIngot temperedIronIngot;
	public ItemCopperIngot copperIngot;
	public ItemCopperWire copperWire;
	public ItemTinIngot tinIngot;
	public ItemTinCell tinCell;
	public ItemMixedIngot mixedIngot;
	
	public CustomItems(IndustrialInc instance) {
		this.plugin = instance;
		
	}
	
	public void init() {
		temperedIronIngot = new ItemTemperedIronIngot(plugin);
		copperIngot = new ItemCopperIngot(plugin);
		copperWire = new ItemCopperWire(plugin);
		tinIngot = new ItemTinIngot(plugin);
		tinCell = new ItemTinCell(plugin);
		mixedIngot = new ItemMixedIngot(plugin);
		
		//recipes
		ItemStack riiResult = new SpoutItemStack(temperedIronIngot, 2);
		SpoutShapedRecipe riirecipe = new SpoutShapedRecipe(riiResult);
		riirecipe.shape("   ", " AA", "  B");
		riirecipe.setIngredient('A', MaterialData.ironIngot);
		riirecipe.setIngredient('B', MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(riirecipe);
	}

}
