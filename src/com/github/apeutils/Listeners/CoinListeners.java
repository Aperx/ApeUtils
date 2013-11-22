package com.github.apeutils.Listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class CoinListeners implements Listener{
	
	public void GiveCoinCounter(PlayerJoinEvent event){
        Player p = event.getPlayer();
        PlayerInventory inventory = p.getInventory();
       
        
        //Set 'Coin' as a new item: Golden nugget
        ItemStack Coin = new ItemStack(Material.GOLD_NUGGET,1);
        
        
        //Set 'Coin's Lore
        ItemMeta i = Coin.getItemMeta();
        
        List<String> lore = new ArrayList<String>();
        lore.add("Click to Open Coin Shop");
        i.setLore(lore);
        
        if (!inventory.contains(Coin)) {         
        //If player does not have 'Coin' Add item to Players Inventory
        p.getInventory().addItem(Coin);
        }
	}

}
