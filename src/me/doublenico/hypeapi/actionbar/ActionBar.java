package me.doublenico.hypeapi.actionbar;

import me.doublenico.hypeapi.util.VersionUtils;
import org.bukkit.entity.Player;

public class ActionBar {

	public static void sendBar(Player player, String message) {
		
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			ActionBar_1_8_R1 bar = new ActionBar_1_8_R1(message);
			bar.sendToPlayer(player);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			ActionBar_1_8_R2 bar = new ActionBar_1_8_R2(message);
			bar.sendToPlayer(player);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			ActionBar_1_8_R3 bar = new ActionBar_1_8_R3(message);
			bar.sendToPlayer(player);
		}	
		
	}
	
	public static void sendBarALL(Player player, String message) {
		
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			ActionBar_1_8_R1 bar = new ActionBar_1_8_R1(message);
			bar.sendToAll();
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			ActionBar_1_8_R2 bar = new ActionBar_1_8_R2(message);
			bar.sendToAll();
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			ActionBar_1_8_R3 bar = new ActionBar_1_8_R3(message);
			bar.sendToAll();
		}	
		
	}
	
	
	
}
