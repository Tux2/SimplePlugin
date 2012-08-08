package Tux2.SimplePlugin;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * SimplePlugin block listener
 * @author Tux2
 */
public class SimplePluginBlockListener implements Listener {
    private final SimplePlugin plugin;

    public SimplePluginBlockListener(final SimplePlugin plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockPlace(BlockPlaceEvent event) {
    	if(event.isCancelled()) {
    		return;
    	}
    	if(event.getBlock().getType() == Material.TNT) {
    		event.getPlayer().sendMessage(ChatColor.RED + "You just placed a TNT block");
    	}
    }

    //put all Block related code here
}
