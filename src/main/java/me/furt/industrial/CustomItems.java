package me.furt.industrial;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

import com.github.Zarklord1.FurnaceApi.FurnaceRecipes;

import me.furt.industrial.item.ItemCopperIngot;
import me.furt.industrial.item.ItemCopperWire;
import me.furt.industrial.item.ItemMixedIngot;
import me.furt.industrial.item.ItemTemperedIronIngot;
import me.furt.industrial.item.ItemTinCell;
import me.furt.industrial.item.ItemTinIngot;

public class CustomItems {
	private IndustrialInc plugin;

	public static ItemTemperedIronIngot temperedIronIngot;
	public static ItemCopperIngot copperIngot;
	public static ItemCopperWire copperWire;
	public static ItemTinIngot tinIngot;
	public static ItemTinCell tinCell;
	public static ItemMixedIngot mixedIngot;
	
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
		SpoutShapedRecipe riiRecipe = new SpoutShapedRecipe(riiResult);
		riiRecipe.shape("   ", " AA", "  B");
		riiRecipe.setIngredient('A', MaterialData.ironIngot);
		riiRecipe.setIngredient('B', MaterialData.coal);
		
		ItemStack cwResult = new SpoutItemStack(copperWire, 12);
		SpoutShapedRecipe cwRecipe = new SpoutShapedRecipe(cwResult);
		cwRecipe.shape("   ", "AAA", "   ");
		cwRecipe.setIngredient('A', copperIngot);
		
		ItemStack miResult = new SpoutItemStack(mixedIngot, 6);
		SpoutShapedRecipe miRecipe = new SpoutShapedRecipe(miResult);
		miRecipe.shape("AAA", "BBB", "CCC");
		miRecipe.setIngredient('A', temperedIronIngot);
		miRecipe.setIngredient('B', copperIngot);
		miRecipe.setIngredient('C', tinIngot);
		
		ItemStack tcResult = new SpoutItemStack(tinCell, 16);
		SpoutShapedRecipe tcRecipe = new SpoutShapedRecipe(tcResult);
		tcRecipe.shape(" A ", "A A", " A ");
		tcRecipe.setIngredient('A', tinIngot);
		
		SpoutManager.getMaterialManager().registerSpoutRecipe(riiRecipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(cwRecipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(miRecipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(tcRecipe);
		
		//Furnace recipes
		FurnaceRecipes.CustomFurnaceRecipe(new SpoutItemStack(copperIngot), 318, CustomBlocks.copperOre.getCustomId());
		FurnaceRecipes.CustomFurnaceRecipe(new SpoutItemStack(tinIngot), 318, CustomBlocks.tinOre.getCustomId());
		FurnaceRecipes.CustomFurnaceRecipe(new SpoutItemStack(temperedIronIngot), Material.IRON_INGOT.getId(), Material.IRON_INGOT.getId());
		
	}

}
