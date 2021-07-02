package me.doublenico.hypeapi.bossbar;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.doublenico.hypeapi.util.VersionUtils;

public class Bossbar {
	
	public static void sendBossBar(Plugin instance, Player player, String message, double progress) {
		
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			Bossbar_1_8_R1 bossBar = new Bossbar_1_8_R1(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			Bossbar_1_8_R2 bossBar = new Bossbar_1_8_R2(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			Bossbar_1_8_R3 bossBar = new Bossbar_1_8_R3(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}	
		
	}
	
	public static void sendBossBarALL(Plugin instance, String message, double progress) {
		for(Player player : Bukkit.getOnlinePlayers()) {
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			Bossbar_1_8_R1 bossBar = new Bossbar_1_8_R1(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			Bossbar_1_8_R2 bossBar = new Bossbar_1_8_R2(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			Bossbar_1_8_R3 bossBar = new Bossbar_1_8_R3(instance, message);
			bossBar.addPlayer(player);
			bossBar.setProgress(progress);
		}	
	  }
	}
	
	public static void sendAnimatedBossBar(Plugin instance, Player player, String message, int seconds, long delay, long period) {
		new BukkitRunnable() {
			
            double progress = 100;
			int time = 100 / seconds;
			@Override
			public void run() {
				
				if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
					Bossbar_1_8_R1 bossBar = new Bossbar_1_8_R1(instance, message);				
					bossBar.addPlayer(player);
					bossBar.setProgress(progress);
					progress -= time;
					if(progress <= 0) {
						bossBar.removePlayer(player);
						cancel();
					}
				}
				if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
					Bossbar_1_8_R2 bossBar = new Bossbar_1_8_R2(instance, message);				
					bossBar.addPlayer(player);
					bossBar.setProgress(progress);
					progress -= time;
					if(progress <= 0) {
						bossBar.removePlayer(player);
						cancel();
					}
				}
				if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
					Bossbar_1_8_R3 bossBar = new Bossbar_1_8_R3(instance, null);		
					bossBar.setTitle(message);
					bossBar.addPlayer(player);
					bossBar.setProgress(progress);
					progress -= time;
					System.out.println("DEBUG " + progress);
					if(progress <= 0) {
						bossBar.removePlayer(player);
						cancel();
						System.out.println("S-a terminat");
					}
				}
			}
		}.runTaskTimer(instance, delay, period);
		
	}
	
	
}
