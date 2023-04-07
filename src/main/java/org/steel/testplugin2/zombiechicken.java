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

public class zombiechicken  implements CommandExecutor {

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


        int quantity = (int)(Math.random() * 10) + 1;

        for(int i = 0; i<10;i++){
            Location horseSpot = new Location(world,
                    spot.getX() - 15 + Math.random() * 30,
                    spot.getY() + 10 + Math.random() * 1,
                    spot.getZ() - 15 + Math.random() * 30
            );

            if(horseSpot.getBlock().getType() != Material.AIR){
                continue;
            }
            Horse horsey = world.spawn(horseSpot, Horse.class);
            Zombie rob = world.spawn(horseSpot, Zombie.class);
            PigZombie zomb = world.spawn(horseSpot, PigZombie.class);

            zomb.setAnger(10);


            rob.getLocation();
            horsey.setColor(Horse.Color.WHITE);
            rob.setAdult();
            horsey.setGliding(true);
            horsey.setPassenger(rob);
            if(i==1) {
                world.createExplosion(rob.getLocation(), 10, true, true);
                world.strikeLightning(rob.getLocation());
            }


   




            int speed =(int) (Math. random() * 10);
            PotionEffect potion = new PotionEffect(PotionEffectType.SPEED,
                    Integer.MAX_VALUE,
                    speed);
            horsey.addPotionEffect(potion);

        }
        LOG.info(quantity + " chicken-riding zombies");
    }
}
