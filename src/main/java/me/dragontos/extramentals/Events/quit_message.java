package me.dragontos.extramentals.Events;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class quit_message implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        //extra
        String quitmsg = EXAConfigManager.Messages.getString("Quitmsg");

        event.setQuitMessage(Color(PlaceholderAPI.setPlaceholders(p, quitmsg)));
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
