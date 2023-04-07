package org.steel.testplugin2;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class bigdig implements CommandExecutor {
    public static final Logger LOG = Logger.getLogger("Minecraft");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
        if(sender instanceof Player){
            executeCommand(sender, arguments);
            return true;
        }
        return false;
    }


    public void executeCommand(CommandSender sender, String[] arguments){

        double rad = 15;
        if(arguments.length>0){
            rad = Double.parseDouble(arguments[0]);
        }
        Player me = (Player) sender;
        Location spot = me.getLocation();
        World world = me.getWorld();

        for(double x = spot.getX() - rad; x < spot.getX() + rad; x++){
            for(double y = spot.getY() - rad; y < spot.getY() + rad; y++){
                for (double z = spot.getZ() - rad; z <spot.getZ() + rad; z++) {
                    Location loc = new Location(world, x,y,z);
                    if(y<2){
                        continue;
                    }

                    double xd = x - spot.getX();
                    double yd = y - spot.getY();
                    double zd = z - spot.getZ();
                    double distance = Math.sqrt(xd * xd + yd * yd + zd * zd);
                    if(distance < rad){
                        Block current = world.getBlockAt(loc);
                        current.setType(Material.AIR);
                    }
                }
            }
        }
        world.playSound(spot, Sound.BLOCK_GLASS_BREAK, 30, 5);
        }
    }

