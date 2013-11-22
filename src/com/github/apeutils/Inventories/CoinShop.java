package com.github.apeutils.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CoinShop {
	
	public static Inventory CoinShop = Bukkit.createInventory(null, 9, ChatColor.GOLD+"Coin Shop");
	
	static {
		CoinShop.setItem(0, new ItemStack(Material.WATER_BUCKET, 1));
		CoinShop.setItem(1, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(2, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(3, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(4, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(5, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(6, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(7, new ItemStack(Material.WEB, 1));
		CoinShop.setItem(8, new ItemStack(Material.LAVA_BUCKET, 1));

		}

}
