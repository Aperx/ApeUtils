package com.github.apeutils.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Score;

import com.github.apeutils.ApeUtils;

public class OPJoinListener implements Listener{
	int players = Bukkit.getServer().getOnlinePlayers().length; 
	int maxp = Bukkit.getServer().getMaxPlayers();
	int worlds = Bukkit.getServer().getWorlds().size();
	int offplayers = Bukkit.getServer().getOfflinePlayers().length;
	int version = Integer.parseInt(Bukkit.getBukkitVersion());
	
	public void onOpJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        
        if(p.isOp()){
        	p.setScoreboard(ApeUtils.getInstance().OPboard);
        	
        	final Score score = ApeUtils.getInstance().OPObj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Online: "));
			score.setScore(players);
			
			final Score score1 = ApeUtils.getInstance().OPObj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Max Players: "));
			score1.setScore(maxp);
			
			final Score score2 = ApeUtils.getInstance().OPObj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Worlds: "));
			score2.setScore(worlds);
			
			final Score score3 = ApeUtils.getInstance().OPObj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Total Players: "));
			score3.setScore(offplayers);
			
			final Score score4 = ApeUtils.getInstance().OPObj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Version: "));
			score4.setScore(version);
			
			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(ApeUtils.getInstance(), new Runnable(){

				@Override
				public void run() {
					ApeUtils.getInstance().OPboard.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Online: "));
					
					ApeUtils.getInstance().OPboard.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Max Players: "));
					
					ApeUtils.getInstance().OPboard.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Worlds: "));
					
					ApeUtils.getInstance().OPboard.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Total Players: "));
					
					ApeUtils.getInstance().OPboard.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Version: "));
					
					
				}							
			}, 0L, 20L * 60);
        }
	      
	}

}