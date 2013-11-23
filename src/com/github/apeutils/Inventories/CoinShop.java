package com.github.apeutils.Inventories;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CoinShop {
	
	public static Inventory CoinShop = Bukkit.createInventory(null, 9, ChatColor.GOLD+"Coin Shop");
	
	static {
		

        ItemStack Lava = new ItemStack(Material.LAVA_BUCKET,1);
        ItemMeta il = Lava.getItemMeta();
        il.setDisplayName(ChatColor.RED+"Close");
        List<String> lorel = new ArrayList<String>();
        lorel.add(ChatColor.RED+"Click to Close Coin Shop");
        il.setLore(lorel);
        
        ItemStack Coin = new ItemStack(Material.GOLD_NUGGET,1);
        ItemMeta ic = Coin.getItemMeta();
        ic.setDisplayName(ChatColor.RED+"Coins");
        List<String> lorec = new ArrayList<String>();
        lorec.add(ChatColor.RED+"Your Coins!");       
        ic.setLore(lorec);
		
		
		CoinShop.setItem(0, Coin);
		CoinShop.setItem(1, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(2, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(3, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(4, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(5, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(6, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(7, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(8, Lava);
		

		}

}
