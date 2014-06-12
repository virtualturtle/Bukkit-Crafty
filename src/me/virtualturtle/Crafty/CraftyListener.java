package me.virtualturtle.Crafty;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CraftyListener implements Listener {
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerRightClick(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_AIR && event.getPlayer().getItemInHand().getType() == Material.WORKBENCH) {
			event.getPlayer().openWorkbench(null, true);
		}
	}
}
