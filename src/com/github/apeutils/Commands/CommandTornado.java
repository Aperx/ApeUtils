package com.github.apeutils.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.github.apeutils.ApeUtils;
import com.github.apeutils.Effects.Tornado;

public class CommandTornado implements CommandExecutor {



	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        Player p = (Player) sender;
        
        if(!sender.hasPermission("apeutils.tornado"))
        {
        p.sendMessage(ChatColor.RED+"You do not have permission");
        }
        Tornado.spawnTornado(ApeUtils.getInstance(), p.getLocation(), Material.WOOL,(byte) 0, null, 0.06, 200, 300, true);
		return false;
	
	}

}