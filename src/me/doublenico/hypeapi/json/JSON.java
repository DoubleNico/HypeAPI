package me.doublenico.hypeapi.json;

import java.util.List;

import org.bukkit.entity.Player;

import me.doublenico.hypeapi.util.VersionUtils;

public class JSON {
	
	public static void sendJSON(Player player, String message) {
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			JSON_1_8_R1 json = new JSON_1_8_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			JSON_1_8_R2 json = new JSON_1_8_R2();
			json.sendJSON(player, message);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			JSON_1_8_R3 json = new JSON_1_8_R3();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_9_R1")) {
			JSON_1_9_R1 json = new JSON_1_9_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_9_R2")) {
			JSON_1_9_R2 json = new JSON_1_9_R2();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_10_R1")) {
			JSON_1_10_R1 json = new JSON_1_10_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_11_R1")) {
			JSON_1_11_R1 json = new JSON_1_11_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_12_R1")) {
			JSON_1_12_R1 json = new JSON_1_12_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_13_R1")) {
			JSON_1_13_R1 json = new JSON_1_13_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_13_R2")) {
			JSON_1_13_R2 json = new JSON_1_13_R2();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_14_R1")) {
			JSON_1_14_R1 json = new JSON_1_14_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_15_R1")) {
			JSON_1_15_R1 json = new JSON_1_15_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R1")) {
			JSON_1_16_R1 json = new JSON_1_16_R1();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R2")) {
			JSON_1_16_R2 json = new JSON_1_16_R2();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R3")) {
			JSON_1_16_R3 json = new JSON_1_16_R3();
			json.sendJSON(player, message);
		}
		if (VersionUtils.getNMSVersion().equals("v1_17_R1")) {
			JSON_1_17_R1 json = new JSON_1_17_R1();
			json.sendJSON(player, message);
		}
	}
	
	public static void sendJSONList(Player player, List<String> list) {
		if (VersionUtils.getNMSVersion().equals("v1_8_R1")) {
			JSON_1_8_R1 json = new JSON_1_8_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_8_R2")) {
			JSON_1_8_R2 json = new JSON_1_8_R2();
			json.sendListJSON(player, list);
		}		
		if (VersionUtils.getNMSVersion().equals("v1_8_R3")) {
			JSON_1_8_R3 json = new JSON_1_8_R3();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_9_R1")) {
			JSON_1_9_R1 json = new JSON_1_9_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_9_R2")) {
			JSON_1_9_R2 json = new JSON_1_9_R2();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_10_R1")) {
			JSON_1_10_R1 json = new JSON_1_10_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_11_R1")) {
			JSON_1_11_R1 json = new JSON_1_11_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_12_R1")) {
			JSON_1_12_R1 json = new JSON_1_12_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_13_R1")) {
			JSON_1_13_R1 json = new JSON_1_13_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_13_R2")) {
			JSON_1_13_R2 json = new JSON_1_13_R2();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_14_R1")) {
			JSON_1_14_R1 json = new JSON_1_14_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_15_R1")) {
			JSON_1_15_R1 json = new JSON_1_15_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R1")) {
			JSON_1_16_R1 json = new JSON_1_16_R1();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R2")) {
			JSON_1_16_R2 json = new JSON_1_16_R2();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_16_R3")) {
			JSON_1_16_R3 json = new JSON_1_16_R3();
			json.sendListJSON(player, list);
		}
		if (VersionUtils.getNMSVersion().equals("v1_17_R1")) {
			JSON_1_17_R1 json = new JSON_1_17_R1();
			json.sendListJSON(player, list);
		}
	}
	
	
}
