package me.virtualturtle.Crafty;

import org.bukkit.plugin.java.JavaPlugin;

public class Crafty extends JavaPlugin {
	private CraftyListener listener; 
	
	public Crafty() {
		listener = new CraftyListener();
	}
	
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(listener, this);
	}
}
