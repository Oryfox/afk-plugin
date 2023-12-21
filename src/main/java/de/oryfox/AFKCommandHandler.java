package de.oryfox;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AFKCommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p) {
            if (p.getPlayerListName().endsWith(" [AFK]")) {
                p.setPlayerListName(p.getName());
                Bukkit.broadcastMessage(p.getName() + " is no longer AFK!");
            } else {
                p.setPlayerListName(p.getName() + " [AFK]");
                Bukkit.broadcastMessage(p.getName() + " is now AFK!");
            }
            return true;
        }
        commandSender.sendMessage("Only players can use this command!");
        return false;
    }
}
