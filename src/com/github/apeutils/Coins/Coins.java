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
	public void payPlayer(Player player, int amount)
	    {
	        if(coins.containsKey(player.getName()))
	            coins.put(player.getName(), coins.get(player.getName()) + amount);
	    }
	 
	
	
	//Take amount of coins from player
	public void takefromPlayer(Player player, int amount)
	    {
	        if(coins.containsKey(player.getName()))
	        {
	            int newAmount = coins.get(player.getName());
	 
	            if(newAmount <= 0)
	                coins.put(player.getName(), 0);
	            else
	                coins.put(player.getName(), newAmount);
	        }
	    }
	
	
	}
			