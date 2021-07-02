package me.doublenico.hypeapi.json;

import java.util.List;

import org.bukkit.entity.Player;

public interface JSON_Handler {

    void sendJSON(Player player, String json);
    
    void sendListJSON(Player player, List<String> jsonList);
	
	
}
