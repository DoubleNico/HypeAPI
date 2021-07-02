package me.doublenico.hypeapi.title;

import org.bukkit.entity.Player;

import me.doublenico.hypeapi.util.VersionUtils;

public class Title {

	public static void sendTitle(Player player, String title, String subtitle, int fadein, int stay, int fadeout) {
		
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			Title_1_8_R1 bar = new Title_1_8_R1(title, subtitle, fadein, stay, fadeout);
			bar.sendToPlayer(player);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			Title_1_8_R2 bar = new Title_1_8_R2(title, subtitle, fadein, stay, fadeout);
			bar.sendToPlayer(player);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			Title_1_8_R3 bar = new Title_1_8_R3(title, subtitle, fadein, stay, fadeout);
			bar.sendToPlayer(player);
		}	
		
	}
	
	public static void sendTitleALL(Player player, String title, String subtitle, int fadein, int stay, int fadeout) {
		
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			Title_1_8_R1 bar = new Title_1_8_R1(title, subtitle, fadein, stay, fadeout);
			bar.sendToAll();
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			Title_1_8_R2 bar = new Title_1_8_R2(title, subtitle, fadein, stay, fadeout);
			bar.sendToAll();
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			Title_1_8_R3 bar = new Title_1_8_R3(title, subtitle, fadein, stay, fadeout);
			bar.sendToAll();
		}	
		
	}
	
	
}
