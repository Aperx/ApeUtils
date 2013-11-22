package com.github.apeutils.Coins;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class Coins {
	public static HashMap<String, Integer> coins = new HashMap<String, Integer>();
	
	

	
	//Add player to Coin hashmap
	public void addPlayer(Player player, int startingCoins)
    {
        if(!coins.containsKey(player.getName()))
            coins.put(player.getName(), startingCoins);
    }
	
	
	
	//Remove player from Coin hashmap
	public void removePlayer(Player player)
	    {
	        if(coins.containsKey(player.getName()))
	            coins.remove(player.getName());
	    }

	
	
	//Pay player amount of coins
	public static void addCoins(String player, int amount) {
	    coins.put(player, coins.get(player) + amount);
	}
	 
	
	
	//Take amount of coins from player
	public static void removeCoins(String player, int amount) {
	    coins.put(player, coins.get(player) - amount);
	}
	
	//Gets number of coins
	public static int getCoins(String player) {
	    return coins.get(player);
	}
	
}
			