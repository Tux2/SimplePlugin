package Tux2.SimplePlugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.PlayerInventory;

/**
 * Handle events for all Player related events
 * @author Tux2
 */
public class SimplePluginPlayerListener implements Listener {
    private final SimplePlugin plugin;

    public SimplePluginPlayerListener(SimplePlugin instance) {
        plugin = instance;
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onBookHold(PlayerItemHeldEvent event) {
    	PlayerInventory inventory = event.getPlayer().getInventory();
    	if(inventory.getItem(event.getNewSlot()).getType() == Material.BOOK) {
    		event.getPlayer().sendMessage(ChatColor.GREEN + "You are now holdng a book. Get a quill to write in it!");
    	}
    }

    //Insert Player related code here
}

