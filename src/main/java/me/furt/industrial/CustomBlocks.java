package me.furt.industrial;

import me.furt.industrial.block.BlockMiningMachine;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class CustomBlocks {
	public Texture machines;
	public Texture generators;
	
	private IndustrialInc plugin;
	public BlockMiningMachine miningMachine;
	
	public CustomBlocks(IndustrialInc instance) {
		this.plugin = instance;
	}

	public void init() {
		machines = new Texture(plugin, "block_machine.png", 256, 256, 16);
		generators = new Texture(plugin, "block_generator.png", 256, 256, 16);
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
