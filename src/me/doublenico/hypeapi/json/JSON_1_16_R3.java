package me.doublenico.hypeapi.json;

import java.util.List;

import javax.annotation.Nullable;

import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import me.doublenico.hypeapi.util.ColorChat;
import net.minecraft.server.v1_16_R3.ChatMessageType;
import net.minecraft.server.v1_16_R3.IChatBaseComponent;
import net.minecraft.server.v1_16_R3.IChatMutableComponent;
import net.minecraft.server.v1_16_R3.PacketPlayOutChat;

public class JSON_1_16_R3 implements JSON_Handler{
	
    @Override
    public void sendJSON(Player player, String json) {
        try {
            IChatBaseComponent jsonMessage = IChatBaseComponent.ChatSerializer.a(ColorChat.color(json));
            PacketPlayOutChat packet = new PacketPlayOutChat(jsonMessage, ChatMessageType.CHAT, player.getUniqueId());
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
        }
        catch (Exception e) {
	         System.out.println("There was an error sending the json.");
	         System.out.println("Check if the player or the message is not null");
        }
    }
    
    @Override
    public void sendListJSON(Player player, List<String> jsonList) {
        if (jsonList == null) 
            return;
      
        if(jsonList.isEmpty()) 
        	return;
        
        try {
        	IChatBaseComponent json = IChatBaseComponent.ChatSerializer.a(ColorChat.color(jsonList.get(0)));
        	for(String s : jsonList) {
        		if(s != null && !s.isEmpty()) {
        			if(s.equals(jsonList.get(0)))
        				continue;
        			((@Nullable IChatMutableComponent) json).addSibling(IChatBaseComponent.ChatSerializer.a(ColorChat.color(s)));
        		}
        	}
        	PacketPlayOutChat packet = new PacketPlayOutChat(json, ChatMessageType.CHAT, player.getUniqueId());
        	((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
        }
        catch (Exception e) {
	         System.out.println("There was an error sending the json list.");
	         System.out.println("Check if the player or the list is not null");
        }
    }

	
	
}
