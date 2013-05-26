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
	public BlockMiningMachine miningMachine;
	public BlockMiningTube miningTube;
	public BlockMiningTubeTip miningTubeTip;
	public BlockCopperOre copperOre;
	public BlockTinOre tinOre;
	
	public CustomBlocks(IndustrialInc instance) {
		this.plugin = instance;
	}

	public void init() {
		copperOre = new BlockCopperOre(plugin);
		tinOre = new BlockTinOre(plugin);
		miningMachine = new BlockMiningMachine(plugin);
		
		//Mining Machine Recipe
		ItemStack mmResult = new SpoutItemStack(miningMachine, 1);
		SpoutShapedRecipe recipe = new SpoutShapedRecipe(mmResult);
		recipe.shape("AAA", "ACA", "BBB");
		recipe.setIngredient('A', plugin.ci.temperedIronIngot);
		recipe.setIngredient('B', MaterialData.redstone);
		recipe.setIngredient('C', MaterialData.diamondPickaxe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	}

}
