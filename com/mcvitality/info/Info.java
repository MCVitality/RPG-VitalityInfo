package com.mcvitality.info;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Harry.Williams
 */
public class Info extends JavaPlugin {
	 
    public void onEnable() {
        System.out.println("[VitalityInfo]" + "Plugin Enabled");
        
    }
    public void onDisable() {
                System.out.println("VitalityInfo" + "Plugin Disabled");
    }
	
    public boolean onCommand(CommandSender s, Command c, String l, String [] args) {
        if(l.equalsIgnoreCase("store")) {
	String prefix = ChatColor.DARK_GREEN + "[VitalityInfo] ";
	s.sendMessage(prefix + ChatColor.WHITE + "Visit the NEW store for In-Game perks and bonuses!" + ChatColor.GOLD + "http://store.mcvitality.com/");
            
        }
		
	    if(l.equalsIgnoreCase("vote")) {
	s.sendMessage(prefix + ChatColor.WHITE + "Vote for in-game money and a Token!" + ChatColor.GOLD + "http://vote.mcvitality.com/");
                             
        }				
	    if(l.equalsIgnoreCase("Social")) {
    s.sendMessage(prefix + ChatColor.WHITE + "Like us on Facebook" + ChatColor.GOLD + "http://facebook.com/MinecraftVitality/);
	s.sendMessage(prefix + ChatColor.WHITE + "Like us on Twitter" + ChatColor.GOLD + "http://Twitter.com/MCVitality_Dev");
	   }
		
     if(l.equalsIgnoreCase("reportabug")) {
    s.sendMessage(prefix + ChatColor.WHITE + "Please fill out a bug report on the forums" + ChatColor.GOLD + "bugs.mcvitality.org");
	
        }	

     if(l.equalsIgnoreCase("Version")) {
    s.sendMessage(prefix + ChatColor.WHITE + "Current Version for VitalityRPG" + ChatColor.GOLD + "Alpha 0.1");
	
        }			
          return true;
    }
}
