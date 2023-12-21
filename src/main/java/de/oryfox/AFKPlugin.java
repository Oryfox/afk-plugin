package de.oryfox;

import org.bukkit.plugin.java.JavaPlugin;

public class AFKPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("afk").setExecutor(new AFKCommandHandler());
        this.getServer().getPluginManager().registerEvents(new EventListeners(), this);
        getLogger().info("AFKPlugin enabled!");
    }
}