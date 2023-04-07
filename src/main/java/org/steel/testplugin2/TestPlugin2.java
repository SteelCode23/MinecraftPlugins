package org.steel.testplugin2;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.*;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.AbstractHorseInventory;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.loot.LootTable;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.util.*;

public final class TestPlugin2 extends JavaPlugin implements Listener {


    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    @Override
    public void onEnable() {
        getCommand("chicken").setExecutor(new ChickenStorm());
        getCommand("TestCommand").setExecutor(new TestCommand());
        getCommand("zombiechicken").setExecutor(new zombiechicken());
        getCommand("bigdig").setExecutor(new bigdig());
        getCommand("iamgod").setExecutor(new iamgod());
        getCommand("LightningStrike").setExecutor(new LightningStrike());
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public class WeirdHorse implements AbstractHorse{

        @Override
        public Horse.Variant getVariant() {
            return null;
        }

        @Override
        public void setVariant(Horse.Variant variant) {

        }

        @Override
        public int getDomestication() {
            return 0;
        }

        @Override
        public void setDomestication(int i) {

        }

        @Override
        public int getMaxDomestication() {
            return 0;
        }

        @Override
        public void setMaxDomestication(int i) {

        }

        @Override
        public double getJumpStrength() {
            return 0;
        }

        @Override
        public void setJumpStrength(double v) {

        }

        @Override
        public boolean isEatingHaystack() {
            return false;
        }

        @Override
        public void setEatingHaystack(boolean b) {

        }

        @Override
        public AbstractHorseInventory getInventory() {
            return null;
        }

        @Override
        public boolean isTamed() {
            return false;
        }

        @Override
        public void setTamed(boolean b) {

        }

        @Override
        public AnimalTamer getOwner() {
            return null;
        }

        @Override
        public void setOwner(AnimalTamer animalTamer) {

        }

        @Override
        public UUID getBreedCause() {
            return null;
        }

        @Override
        public void setBreedCause(UUID uuid) {

        }

        @Override
        public boolean isLoveMode() {
            return false;
        }

        @Override
        public int getLoveModeTicks() {
            return 0;
        }

        @Override
        public void setLoveModeTicks(int i) {

        }

        @Override
        public boolean isBreedItem(ItemStack itemStack) {
            return false;
        }

        @Override
        public boolean isBreedItem(Material material) {
            return false;
        }

        @Override
        public int getAge() {
            return 0;
        }

        @Override
        public void setAge(int i) {

        }

        @Override
        public void setAgeLock(boolean b) {

        }

        @Override
        public boolean getAgeLock() {
            return false;
        }

        @Override
        public void setBaby() {

        }

        @Override
        public void setAdult() {

        }

        @Override
        public boolean isAdult() {
            return false;
        }

        @Override
        public boolean canBreed() {
            return false;
        }

        @Override
        public void setBreed(boolean b) {

        }

        @Override
        public void setTarget(LivingEntity livingEntity) {

        }

        @Override
        public LivingEntity getTarget() {
            return null;
        }

        @Override
        public void setAware(boolean b) {

        }

        @Override
        public boolean isAware() {
            return false;
        }

        @Override
        public Sound getAmbientSound() {
            return null;
        }

        @Override
        public double getEyeHeight() {
            return 0;
        }

        @Override
        public double getEyeHeight(boolean b) {
            return 0;
        }

        @Override
        public Location getEyeLocation() {
            return null;
        }

        @Override
        public List<Block> getLineOfSight(Set<Material> set, int i) {
            return null;
        }

        @Override
        public Block getTargetBlock(Set<Material> set, int i) {
            return null;
        }

        @Override
        public List<Block> getLastTwoTargetBlocks(Set<Material> set, int i) {
            return null;
        }

        @Override
        public Block getTargetBlockExact(int i) {
            return null;
        }

        @Override
        public Block getTargetBlockExact(int i, FluidCollisionMode fluidCollisionMode) {
            return null;
        }

        @Override
        public RayTraceResult rayTraceBlocks(double v) {
            return null;
        }

        @Override
        public RayTraceResult rayTraceBlocks(double v, FluidCollisionMode fluidCollisionMode) {
            return null;
        }

        @Override
        public int getRemainingAir() {
            return 0;
        }

        @Override
        public void setRemainingAir(int i) {

        }

        @Override
        public int getMaximumAir() {
            return 0;
        }

        @Override
        public void setMaximumAir(int i) {

        }

        @Override
        public int getArrowCooldown() {
            return 0;
        }

        @Override
        public void setArrowCooldown(int i) {

        }

        @Override
        public int getArrowsInBody() {
            return 0;
        }

        @Override
        public void setArrowsInBody(int i) {

        }

        @Override
        public int getMaximumNoDamageTicks() {
            return 0;
        }

        @Override
        public void setMaximumNoDamageTicks(int i) {

        }

        @Override
        public double getLastDamage() {
            return 0;
        }

        @Override
        public void setLastDamage(double v) {

        }

        @Override
        public int getNoDamageTicks() {
            return 0;
        }

        @Override
        public void setNoDamageTicks(int i) {

        }

        @Override
        public Player getKiller() {
            return null;
        }

        @Override
        public boolean addPotionEffect(PotionEffect potionEffect) {
            return false;
        }

        @Override
        public boolean addPotionEffect(PotionEffect potionEffect, boolean b) {
            return false;
        }

        @Override
        public boolean addPotionEffects(Collection<PotionEffect> collection) {
            return false;
        }

        @Override
        public boolean hasPotionEffect(PotionEffectType potionEffectType) {
            return false;
        }

        @Override
        public PotionEffect getPotionEffect(PotionEffectType potionEffectType) {
            return null;
        }

        @Override
        public void removePotionEffect(PotionEffectType potionEffectType) {

        }

        @Override
        public Collection<PotionEffect> getActivePotionEffects() {
            return null;
        }

        @Override
        public boolean hasLineOfSight(Entity entity) {
            return false;
        }

        @Override
        public boolean getRemoveWhenFarAway() {
            return false;
        }

        @Override
        public void setRemoveWhenFarAway(boolean b) {

        }

        @Override
        public EntityEquipment getEquipment() {
            return null;
        }

        @Override
        public void setCanPickupItems(boolean b) {

        }

        @Override
        public boolean getCanPickupItems() {
            return false;
        }

        @Override
        public boolean isLeashed() {
            return false;
        }

        @Override
        public Entity getLeashHolder() throws IllegalStateException {
            return null;
        }

        @Override
        public boolean setLeashHolder(Entity entity) {
            return false;
        }

        @Override
        public boolean isGliding() {
            return false;
        }

        @Override
        public void setGliding(boolean b) {

        }

        @Override
        public boolean isSwimming() {
            return false;
        }

        @Override
        public void setSwimming(boolean b) {

        }

        @Override
        public boolean isRiptiding() {
            return false;
        }

        @Override
        public boolean isSleeping() {
            return false;
        }

        @Override
        public boolean isClimbing() {
            return false;
        }

        @Override
        public void setAI(boolean b) {

        }

        @Override
        public boolean hasAI() {
            return false;
        }

        @Override
        public void attack(Entity entity) {

        }

        @Override
        public void swingMainHand() {

        }

        @Override
        public void swingOffHand() {

        }

        @Override
        public void setCollidable(boolean b) {

        }

        @Override
        public boolean isCollidable() {
            return false;
        }

        @Override
        public Set<UUID> getCollidableExemptions() {
            return null;
        }

        @Override
        public <T> T getMemory(MemoryKey<T> memoryKey) {
            return null;
        }

        @Override
        public <T> void setMemory(MemoryKey<T> memoryKey, T t) {

        }

        @Override
        public Sound getHurtSound() {
            return null;
        }

        @Override
        public Sound getDeathSound() {
            return null;
        }

        @Override
        public Sound getFallDamageSound(int i) {
            return null;
        }

        @Override
        public Sound getFallDamageSoundSmall() {
            return null;
        }

        @Override
        public Sound getFallDamageSoundBig() {
            return null;
        }

        @Override
        public Sound getDrinkingSound(ItemStack itemStack) {
            return null;
        }

        @Override
        public Sound getEatingSound(ItemStack itemStack) {
            return null;
        }

        @Override
        public boolean canBreatheUnderwater() {
            return false;
        }

        @Override
        public EntityCategory getCategory() {
            return null;
        }

        @Override
        public void setInvisible(boolean b) {

        }

        @Override
        public boolean isInvisible() {
            return false;
        }

        @Override
        public AttributeInstance getAttribute(Attribute attribute) {
            return null;
        }

        @Override
        public void damage(double v) {

        }

        @Override
        public void damage(double v, Entity entity) {

        }

        @Override
        public double getHealth() {
            return 0;
        }

        @Override
        public void setHealth(double v) {

        }

        @Override
        public double getAbsorptionAmount() {
            return 0;
        }

        @Override
        public void setAbsorptionAmount(double v) {

        }

        @Override
        public double getMaxHealth() {
            return 0;
        }

        @Override
        public void setMaxHealth(double v) {

        }

        @Override
        public void resetMaxHealth() {

        }

        @Override
        public Vector getVelocity() {
            return null;
        }

        @Override
        public double getHeight() {
            return 0;
        }

        @Override
        public double getWidth() {
            return 0;
        }

        @Override
        public BoundingBox getBoundingBox() {
            return null;
        }

        @Override
        public boolean isOnGround() {
            return false;
        }

        @Override
        public boolean isInWater() {
            return false;
        }

        @Override
        public World getWorld() {
            return null;
        }

        @Override
        public void setRotation(float v, float v1) {

        }

        @Override
        public boolean teleport(Location location) {
            return false;
        }

        @Override
        public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
            return false;
        }

        @Override
        public boolean teleport(Entity entity) {
            return false;
        }

        @Override
        public boolean teleport(Entity entity, PlayerTeleportEvent.TeleportCause teleportCause) {
            return false;
        }

        @Override
        public List<Entity> getNearbyEntities(double v, double v1, double v2) {
            return null;
        }

        @Override
        public int getEntityId() {
            return 0;
        }

        @Override
        public int getFireTicks() {
            return 0;
        }

        @Override
        public int getMaxFireTicks() {
            return 0;
        }

        @Override
        public void setFireTicks(int i) {

        }

        @Override
        public void setVisualFire(boolean b) {

        }

        @Override
        public boolean isVisualFire() {
            return false;
        }

        @Override
        public int getFreezeTicks() {
            return 0;
        }

        @Override
        public int getMaxFreezeTicks() {
            return 0;
        }

        @Override
        public void setFreezeTicks(int i) {

        }

        @Override
        public boolean isFrozen() {
            return false;
        }

        @Override
        public void remove() {

        }

        @Override
        public boolean isDead() {
            return false;
        }

        @Override
        public boolean isValid() {
            return false;
        }

        @Override
        public void sendMessage(String s) {

        }

        @Override
        public void sendMessage(String... strings) {

        }

        @Override
        public void sendMessage(UUID uuid, String s) {

        }

        @Override
        public void sendMessage(UUID uuid, String... strings) {

        }

        @Override
        public Server getServer() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean isPersistent() {
            return false;
        }

        @Override
        public void setPersistent(boolean b) {

        }

        @Override
        public Entity getPassenger() {
            return null;
        }

        @Override
        public boolean setPassenger(Entity entity) {
            return false;
        }

        @Override
        public List<Entity> getPassengers() {
            return null;
        }

        @Override
        public boolean addPassenger(Entity entity) {
            return false;
        }

        @Override
        public boolean removePassenger(Entity entity) {
            return false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean eject() {
            return false;
        }

        @Override
        public float getFallDistance() {
            return 0;
        }

        @Override
        public void setFallDistance(float v) {

        }

        @Override
        public void setLastDamageCause(EntityDamageEvent entityDamageEvent) {

        }

        @Override
        public EntityDamageEvent getLastDamageCause() {
            return null;
        }

        @Override
        public UUID getUniqueId() {
            return null;
        }

        @Override
        public int getTicksLived() {
            return 0;
        }

        @Override
        public void setTicksLived(int i) {

        }

        @Override
        public void playEffect(EntityEffect entityEffect) {

        }

        @Override
        public EntityType getType() {
            return null;
        }

        @Override
        public Sound getSwimSound() {
            return null;
        }

        @Override
        public Sound getSwimSplashSound() {
            return null;
        }

        @Override
        public Sound getSwimHighSpeedSplashSound() {
            return null;
        }

        @Override
        public boolean isInsideVehicle() {
            return false;
        }

        @Override
        public boolean leaveVehicle() {
            return false;
        }

        @Override
        public Entity getVehicle() {
            return null;
        }

        @Override
        public void setCustomNameVisible(boolean b) {

        }

        @Override
        public boolean isCustomNameVisible() {
            return false;
        }

        @Override
        public void setVisibleByDefault(boolean b) {

        }

        @Override
        public boolean isVisibleByDefault() {
            return false;
        }

        @Override
        public void setGlowing(boolean b) {

        }

        @Override
        public boolean isGlowing() {
            return false;
        }

        @Override
        public void setInvulnerable(boolean b) {

        }

        @Override
        public boolean isInvulnerable() {
            return false;
        }

        @Override
        public boolean isSilent() {
            return false;
        }

        @Override
        public void setSilent(boolean b) {

        }

        @Override
        public boolean hasGravity() {
            return false;
        }

        @Override
        public void setGravity(boolean b) {

        }

        @Override
        public int getPortalCooldown() {
            return 0;
        }

        @Override
        public void setPortalCooldown(int i) {

        }

        @Override
        public Set<String> getScoreboardTags() {
            return null;
        }

        @Override
        public boolean addScoreboardTag(String s) {
            return false;
        }

        @Override
        public boolean removeScoreboardTag(String s) {
            return false;
        }

        @Override
        public PistonMoveReaction getPistonMoveReaction() {
            return null;
        }

        @Override
        public BlockFace getFacing() {
            return null;
        }

        @Override
        public Pose getPose() {
            return null;
        }

        @Override
        public SpawnCategory getSpawnCategory() {
            return null;
        }

        @Override
        public Spigot spigot() {
            return null;
        }

        @Override
        public Location getLocation() {
            return null;
        }

        @Override
        public Location getLocation(Location location) {
            return null;
        }

        @Override
        public void setVelocity(Vector vector) {

        }

        @Override
        public String getCustomName() {
            return null;
        }

        @Override
        public void setCustomName(String s) {

        }

        @Override
        public void setLootTable(LootTable lootTable) {

        }

        @Override
        public LootTable getLootTable() {
            return null;
        }

        @Override
        public void setSeed(long l) {

        }

        @Override
        public long getSeed() {
            return 0;
        }

        @Override
        public void setMetadata(String s, MetadataValue metadataValue) {

        }

        @Override
        public List<MetadataValue> getMetadata(String s) {
            return null;
        }

        @Override
        public boolean hasMetadata(String s) {
            return false;
        }

        @Override
        public void removeMetadata(String s, Plugin plugin) {

        }

        @Override
        public boolean isPermissionSet(String s) {
            return false;
        }

        @Override
        public boolean isPermissionSet(Permission permission) {
            return false;
        }

        @Override
        public boolean hasPermission(String s) {
            return false;
        }

        @Override
        public boolean hasPermission(Permission permission) {
            return false;
        }

        @Override
        public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b) {
            return null;
        }

        @Override
        public PermissionAttachment addAttachment(Plugin plugin) {
            return null;
        }

        @Override
        public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b, int i) {
            return null;
        }

        @Override
        public PermissionAttachment addAttachment(Plugin plugin, int i) {
            return null;
        }

        @Override
        public void removeAttachment(PermissionAttachment permissionAttachment) {

        }

        @Override
        public void recalculatePermissions() {

        }

        @Override
        public Set<PermissionAttachmentInfo> getEffectivePermissions() {
            return null;
        }

        @Override
        public boolean isOp() {
            return false;
        }

        @Override
        public void setOp(boolean b) {

        }

        @Override
        public PersistentDataContainer getPersistentDataContainer() {
            return null;
        }

        @Override
        public <T extends Projectile> T launchProjectile(Class<? extends T> aClass) {
            return null;
        }

        @Override
        public <T extends Projectile> T launchProjectile(Class<? extends T> aClass, Vector vector) {
            return null;
        }
    }

    @EventHandler
    public void onMouseUp(PlayerInteractEvent e){
        //If Player Swings Hand, Create an Explosion

        if(e.getAction() == Action.LEFT_CLICK_BLOCK){


            Player me = (Player)e.getPlayer();
            Location spot = me.getLocation();
            World world = me.getWorld();

            Location horseSpot = new Location(world,
                    spot.getX() - 15 + Math.random() * 30,
                    spot.getY() + 10 + Math.random() * 1,
                    spot.getZ() - 15 + Math.random() * 30
            );




            Location Explosion = new Location(world, me.getLocation().getX(),me.getLocation().getY()+50,me.getLocation().getZ());
            Horse horsey = world.spawn(Explosion, Horse.class);
            Zombie rob = world.spawn(Explosion, Zombie.class);
            PigZombie zomb = world.spawn(Explosion, PigZombie.class);

            world.createExplosion(Explosion, 20, true, true);

        }

        if(e.getAction() == Action.LEFT_CLICK_AIR){

            Player me = (Player)e.getPlayer();
            Location spot = me.getLocation();
            World world = me.getWorld();
            //Create a massive explosion far far away
            Location Explosion = new Location(world, me.getLocation().getX()+50,me.getLocation().getY(),me.getLocation().getZ());
            world.spawn(Explosion, Horse.class);
            world.spawn(Explosion, Zombie.class);
            List<WeirdHorse> Victims = new ArrayList<WeirdHorse>();
            Victims.add(new WeirdHorse());
            Victims.add(new WeirdHorse());
            Victims.add(new WeirdHorse());
            Victims.add(new WeirdHorse());
            for (WeirdHorse victim : Victims) {
                world.spawn(Explosion,victim.getClass());
            }
            world.createExplosion(Explosion, 75, true, true);

        }

    }
}
