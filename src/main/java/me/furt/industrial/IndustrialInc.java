package me.furt.industrial;

import java.util.logging.Level;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.Zarklord1.FurnaceApi.FurnaceListener;

public class IndustrialInc extends JavaPlugin {
	@Override
	public void onEnable() {
		new CustomItems(this).init();
		new CustomBlocks(this).init();
		this.getServer().getPluginManager().registerEvents(new FurnaceListener(this), this);
		PluginDescriptionFile pdf = this.getDescription();
		this.getLogger().log(Level.INFO,
				"v" + pdf.getVersion() + " is now enabled!");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().log(Level.INFO, "Disabled");
	}

}
