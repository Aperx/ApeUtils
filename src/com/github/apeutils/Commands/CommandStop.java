package com.github.apeutils.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Score;

import com.github.apeutils.ApeUtils;

public class CommandStop implements CommandExecutor {
	int countdown = 120;
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        Player p = (Player) sender;
        
        if(!p.hasPermission("apeutils.stop"))
        {
        	p.sendMessage(ChatColor.RED + "You do not have permission");
        }
        p.setScoreboard(ApeUtils.getInstance().timerBoard);
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(ApeUtils.getInstance(), new Runnable(){

			@Override
			public void run() {
				countdown --;
				
				final Score score = ApeUtils.getInstance().Obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Time:"));
				score.setScore(countdown);
				
				if(countdown == 0){
					ApeUtils.getInstance().getServer().getScheduler().cancelTasks(ApeUtils.getInstance());
					Bukkit.getServer().shutdown();
				}
			}
			
		}, 0L, 20L);
		
        return false;
        
	}

}