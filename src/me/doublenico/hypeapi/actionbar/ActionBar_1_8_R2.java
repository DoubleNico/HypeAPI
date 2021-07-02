package me.doublenico.hypeapi.actionbar;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R2.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R2.PacketPlayOutChat;


public class ActionBar_1_8_R2 {


    private PacketPlayOutChat packet;

    public ActionBar_1_8_R2(String text) {
        PacketPlayOutChat packet = new PacketPlayOutChat(ChatSerializer.a("{\"text\":\"" + text + "\"}"), (byte) 2);
        this.packet = packet;
    }
   
    public void sendToPlayer(Player p) {
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    }
   
    public void sendToAll() {
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);;
        }
    }
	
	
}
