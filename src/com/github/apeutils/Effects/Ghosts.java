package com.github.apeutils.Effects;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Ghosts implements Listener {
	public ArrayList<String> ghosts = new ArrayList<String>();

	
	@EventHandler
    public void onPlayerUse(PlayerInteractEvent event){
        Player p = event.getPlayer();
 
        if(p.getItemInHand().getType() == Material.EYE_OF_ENDER){
        	  p.getLocation().getWorld().playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 500000000); 
              p.sendMessage (ChatColor.GREEN + "On");
                p.getLocation().getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 500000000);
              if(!p.hasPotionEffect(PotionEffectType.INVISIBILITY))
                  p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 20));
 
                ItemStack item2 = new ItemStack(Material.ENDER_PEARL, 1);
                  PlayerInventory pi = p.getInventory();
                  pi.setItem(1, item2);
                  event.setCancelled(true);
 
 
        }
        else if(p.getItemInHand().getType() == Material.ENDER_PEARL){ 
        	p.getLocation().getWorld().playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 500000000); 
        	 p.getLocation().getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 500000000);
              p.sendMessage (ChatColor.GREEN + "Off");
            event.setCancelled(true);
            ItemStack item1 = new ItemStack(Material.EYE_OF_ENDER, 1);
              PlayerInventory pi = p.getInventory();
              pi.setItem(1, item1);
              p.removePotionEffect(PotionEffectType.INVISIBILITY);
        }
    }
	
	@EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        
        if(ghosts.contains(p.getName())){
        	if(!p.hasPotionEffect(PotionEffectType.INVISIBILITY)){
        		p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 20));
        	}
        }
	}

}