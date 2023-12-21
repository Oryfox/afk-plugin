package de.oryfox;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListeners implements Listener {

    @EventHandler
    public void onPlayerMessage(AsyncPlayerChatEvent event) {
        if (event.getPlayer().getPlayerListName().endsWith(" [AFK]")) {
            event.getPlayer().setPlayerListName(event.getPlayer().getName());
            event.getPlayer().sendMessage("You are no longer AFK!");
        }
    }

    @EventHandler
    public void onPlayerDisconnect(PlayerQuitEvent event) {
        if (event.getPlayer().getPlayerListName().endsWith(" [AFK]")) {
            event.getPlayer().setPlayerListName(event.getPlayer().getName());
        }
    }
}
