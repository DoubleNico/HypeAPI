package me.doublenico.hypeapi.util;

import org.bukkit.ChatColor;

public class ColorChat {

	public static String color(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	
}
