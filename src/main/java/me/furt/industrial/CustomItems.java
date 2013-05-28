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
		temperedIronIngot = new ItemTemperedIronIngot(plugin, plugin.assets.getTextureFile("temperedironingot"));
		copperIngot = new ItemCopperIngot(plugin, plugin.assets.getTextureFile("copperingot"));
		copperWire = new ItemCopperWire(plugin, plugin.assets.getTextureFile("copperwirebare"));
		tinIngot = new ItemTinIngot(plugin, plugin.assets.getTextureFile("tiningot"));
		tinCell = new ItemTinCell(plugin, plugin.assets.getTextureFile("tincell"));
		mixedIngot = new ItemMixedIngot(plugin, plugin.assets.getTextureFile("mixedingot"));

		// recipes
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

	}

}
