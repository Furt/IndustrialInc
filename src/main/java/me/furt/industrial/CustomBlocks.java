package me.furt.industrial;

import me.furt.industrial.block.BlockCopperOre;
import me.furt.industrial.block.BlockMiningMachine;
import me.furt.industrial.block.BlockMiningTube;
import me.furt.industrial.block.BlockMiningTubeTip;
import me.furt.industrial.block.BlockTinOre;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class CustomBlocks {
	private IndustrialInc plugin;
	public static BlockMiningMachine miningMachine;
	public static BlockMiningTube miningTube;
	public static BlockMiningTubeTip miningTubeTip;
	public static BlockCopperOre copperOre;
	public static BlockTinOre tinOre;
	
	public CustomBlocks(IndustrialInc instance) {
		this.plugin = instance;
	}

	public void init() {
		copperOre = new BlockCopperOre(plugin);
		tinOre = new BlockTinOre(plugin);
		miningMachine = new BlockMiningMachine(plugin);
		miningTubeTip = new BlockMiningTubeTip(plugin);
		miningTube = new BlockMiningTube(plugin);
		
		//Crafting Recipes
		ItemStack mmResult = new SpoutItemStack(miningMachine, 1);
		SpoutShapedRecipe mmRecipe = new SpoutShapedRecipe(mmResult);
		mmRecipe.shape("ACA", "BDB", "ADA");
		mmRecipe.setIngredient('A', CustomItems.temperedIronIngot);
		mmRecipe.setIngredient('B', MaterialData.redstone);
		mmRecipe.setIngredient('C', MaterialData.diamondPickaxe);
		mmRecipe.setIngredient('D', miningTube);
		
		ItemStack mtResult = new SpoutItemStack(miningTube, 6);
		SpoutShapedRecipe mtRecipe = new SpoutShapedRecipe(mtResult);
		mtRecipe.shape(" A ", " A ", " A ");
		mtRecipe.setIngredient('A', CustomItems.temperedIronIngot);
		
		SpoutManager.getMaterialManager().registerSpoutRecipe(mmRecipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(mtRecipe);
	}

}
