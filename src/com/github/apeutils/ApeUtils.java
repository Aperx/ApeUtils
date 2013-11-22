/*
 * A Utilities plugin/API for me to use with my plugins
 * 
 * You're welcome to use anything found here
 * for your own use, a lot of this stuff
 * is public resources anyway
 * 
 * 
 */
package com.github.apeutils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import com.github.apeutils.Commands.CommandTornado;
import com.github.apeutils.Effects.Ghosts;
import com.github.apeutils.Listeners.CoinListeners;
import com.github.apeutils.Listeners.CoinShopListeners;


public class ApeUtils extends JavaPlugin{
	private static ApeUtils instance;
	
	//Listeners
	public final Ghosts G = new Ghosts();
	public final CoinListeners CL = new CoinListeners();
	public final CoinShopListeners CSL = new CoinShopListeners();
	
	//Scoreboards
	
	//Countdown Board
	public Objective Obj; 
	public Scoreboard timerBoard = null; 
	public Objective timerObj = null; 
	
	//Op Board
	public Objective OPObj;
	public Scoreboard OPboard = null;
	 


	
	//Start of onEnable
	public void onEnable(){
		
	this.setInstance(this);
	
	PluginManager pm = getServer().getPluginManager();
	
	//Registered Events
	
	pm.registerEvents(G, this);
	pm.registerEvents(CL, this);
	pm.registerEvents(CSL, this);
	
	//End of Registering Events
	
	
	//Register Commands
	getCommand("tornado").setExecutor(new CommandTornado());
	
	//End of Registering Commands
	
	
	//Registering Scoreboards
	
	
	//Countdown scoreboard Start
	Scoreboard board = Bukkit.getServer().getScoreboardManager().getNewScoreboard();
	 
	Obj = board.registerNewObjective("timer", "dummy"); 
	Obj.setDisplayName("Title"); 
	Obj.setDisplaySlot(DisplaySlot.SIDEBAR); 
	 
	this.timerBoard = board; 
	this.timerObj = Obj;
	//Countdown scoreboard End
	
	//OP Board
	OPObj = board.registerNewObjective("OP Board", "dummy");
	OPObj.setDisplayName(ChatColor.GOLD + "OP Board"); 
	OPObj.setDisplaySlot(DisplaySlot.SIDEBAR); 
	
	this.OPboard = board;
	//End OP Board
	
	}
	//End of onEnable
	
	
	
	
	//Start of onDisable
	public void onDisable(){
		saveConfig();
	}
	//End of onDisable
	
	

	//Get Instance of main class
	public static ApeUtils getInstance()
	{
	    return instance;
	}
	
	
	//Set the instance of main class
	private void setInstance(ApeUtils inst)
	{
	    instance = inst;
	}	
	
	
}