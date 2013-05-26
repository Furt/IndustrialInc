package me.furt.industrial;

import java.util.logging.Level;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class IndustrialInc extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new CustomBlocks(this).init();
		new CustomItems(this).init();
		PluginDescriptionFile pdf = this.getDescription();
		this.getLogger().log(Level.INFO,
				"v" + pdf.getVersion() + " is now enabled!");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().log(Level.INFO, "Disabled");
	}

}
