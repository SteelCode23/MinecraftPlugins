package org.steel.testplugin2;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class ChickenStorm implements CommandExecutor{

    public static final Logger LOG = Logger.getLogger("Minecraft");
    private static final int NUM_CHICKENS = 30;

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
        int quantity = 0;
        for(int i = 0; i<Math.random()*NUM_CHICKENS+1;i++){
            Location chickenSpot = new Location(world,
                    spot.getX() - 15 + Math.random() * 30,
                    spot.getY() + 10 + Math.random() * 100,
                    spot.getZ() - 15 + Math.random() * 30
            );

            if(chickenSpot.getBlock().getType() != Material.AIR){
                continue;
            }
            Chicken clucky = world.spawn(chickenSpot, Chicken.class);
            if(Math.random() <4 ){
                clucky.setAdult();
            } else{
                clucky.setBaby();
            }
            quantity++;

        }
        LOG.info(quantity + " chickens summoned");
        world.playSound(spot, Sound.AMBIENT_NETHER_WASTES_LOOP, 30, 5);
    }
}
