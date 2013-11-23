package com.github.apeutils.Listeners;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.github.apeutils.Inventories.CoinShop;

public class CoinShopListeners implements Listener {
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(CoinShop.CoinShop)) {
		if (clicked.getType() == Material.LAVA_BUCKET) { 
			event.setCancelled(true); 
			player.closeInventory(); 
			}
		}
	}
	
	@EventHandler
	public void openInventory(PlayerInteractEvent event){
		Player player = (Player) event.getPlayer();
		
		if(event.getAction() == Action.LEFT_CLICK_BLOCK){
			if(event.getClickedBlock().equals(Material.GOLD_NUGGET)){
				player.openInventory(CoinShop.CoinShop);
				player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 20);
			}
		}
	}
}
