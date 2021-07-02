package me.doublenico.hypeapi.bossbar;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R2.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import net.minecraft.server.v1_8_R2.EntityWither;
import net.minecraft.server.v1_8_R2.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_8_R2.PacketPlayOutEntityMetadata;
import net.minecraft.server.v1_8_R2.PacketPlayOutEntityTeleport;
import net.minecraft.server.v1_8_R2.PacketPlayOutSpawnEntityLiving;

public class Bossbar_1_8_R2 extends BukkitRunnable{

	// Thanks to Fr33styler for this amazing code
	
    private String title;
    private HashMap<Player, EntityWither> withers = new HashMap<Player, EntityWither>();

    public Bossbar_1_8_R2(Plugin instance, String title) {
        this.title = title;
        runTaskTimer(instance, 0, 10);
    }
 
    public void addPlayer(Player p) {
        EntityWither wither = new EntityWither(((CraftWorld) p.getWorld()).getHandle());
        Location l = getWitherLocation(p.getLocation());
        wither.setCustomName(title);
        wither.setInvisible(true);
        wither.setLocation(l.getX(), l.getY(), l.getZ(), 0, 0);
        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(wither);
        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
        withers.put(p, wither);
    }

    public void removePlayer(Player p) {
        EntityWither wither = withers.remove(p);
        PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(new int[] {wither.getId()});
        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
    }
 
    public void setTitle(String title) {
        this.title = title;
        for (Entry<Player, EntityWither> entry : withers.entrySet()) {
            EntityWither wither = entry.getValue();
            wither.setCustomName(title);
            PacketPlayOutEntityMetadata packet = new PacketPlayOutEntityMetadata(wither.getId(), wither.getDataWatcher(), true);
            ((CraftPlayer) entry.getKey()).getHandle().playerConnection.sendPacket(packet);
        }
    }
 
    public void setProgress(double progress) {
        for (Entry<Player, EntityWither> entry : withers.entrySet()) {
            EntityWither wither = entry.getValue();
            wither.setHealth((float) (progress * 300) / 100);
            PacketPlayOutEntityMetadata packet = new PacketPlayOutEntityMetadata(wither.getId(), wither.getDataWatcher(), true);
            ((CraftPlayer) entry.getKey()).getHandle().playerConnection.sendPacket(packet);
        }
    }
 
    public Location getWitherLocation(Location l) {
        return l.add(l.getDirection().multiply(60));
    }

    @Override
    public void run() {
        for (Entry<Player, EntityWither> en : withers.entrySet()) {
            EntityWither wither = en.getValue();
            Location l = getWitherLocation(en.getKey().getLocation());
            wither.setLocation(l.getX(), l.getY(), l.getZ(), 0, 0);
            PacketPlayOutEntityTeleport packet = new PacketPlayOutEntityTeleport(wither);
            ((CraftPlayer)en.getKey()).getHandle().playerConnection.sendPacket(packet);
        }
    }

}
