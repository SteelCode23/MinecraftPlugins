package org.steel.testplugin2;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.logging.Logger;


public class Fly implements CommandExecutor, Listener {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
        if(sender instanceof Player){
            executeCommand(sender);
            return true;
        }
        return false;
    }

    public void executeCommand(CommandSender sender){
        Player me = (Player)sender;
        me.setAllowFlight(true);
    }
}
