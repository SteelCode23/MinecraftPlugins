package org.steel.testplugin2;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.io.IOException;
import java.util.logging.*;

public class ThrowExplosion  implements CommandExecutor {

    public static final Logger LOG = Logger.getLogger("Minecraft");
    //    FileHandler fh = new FileHandler(FileHandler handler = new FileHandler("/path/to/my/logs/Minecraft.log"););
//    fh.setFormatter(new SimpleFormatter());
    private static final int NUM_Citizens = 30;


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
        Location spot = me.getLocation();
        World world = me.getWorld();
        Location Explosion = new Location(world, me.getLocation().getX(),me.getLocation().getY()+20,me.getLocation().getZ());
        world.createExplosion(Explosion, 5, true, true);
    }
}
