package me.doublenico.hypeapi.util;

import org.bukkit.Bukkit;

public class VersionUtils {

	
	public static String getNMSVersion(){
        String v = Bukkit.getServer().getClass().getPackage().getName();
        return v.substring(v.lastIndexOf('.') + 1);
    }
	
	
}
