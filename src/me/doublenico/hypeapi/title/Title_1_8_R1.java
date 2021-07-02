package me.doublenico.hypeapi.title;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R1.ChatSerializer;
import net.minecraft.server.v1_8_R1.EnumTitleAction;
import net.minecraft.server.v1_8_R1.PacketPlayOutTitle;

public class Title_1_8_R1 {

	
	private PacketPlayOutTitle title;
	private PacketPlayOutTitle subtitle;
	
	public Title_1_8_R1(String title, String subtitle, int fadeIn, int stay, int fadeOut) {
		this.title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\"" + title + "\"}"), fadeIn, stay, fadeOut);;
		this.subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"" + subtitle + "\"}"), fadeIn, stay, fadeOut);;
	}
	
	public Title_1_8_R1(String title, String subtitle) {
		this.title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\"" + title + "\"}"), 20, 40, 20);;
		this.subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"" + subtitle + "\"}"), 20, 40, 20);;
	}
	
	public Title_1_8_R1(String title) {
		this.title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\"" + title + "\"}"), 20, 40, 20);;
	}
	
	
	public void clearTitle() {
		this.title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\"" + null + "\"}"), 0, 0, 0);;
	}
	
	public void sendToPlayer(Player p) {
		 ((CraftPlayer)p).getHandle().playerConnection.sendPacket(title);
		 ((CraftPlayer)p).getHandle().playerConnection.sendPacket(subtitle);
	}
	
	public void sendToAll() {
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
			 ((CraftPlayer)p).getHandle().playerConnection.sendPacket(title);
			 ((CraftPlayer)p).getHandle().playerConnection.sendPacket(subtitle);
		}
	}
	
	
	
	
}
