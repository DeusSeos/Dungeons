package seos.dungeons;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Dungeons extends JavaPlugin {

    PluginManager pm = Bukkit.getPluginManager();

    @Override
    public void onEnable() {
        pm.registerEvents(new ArtifactRegister(), this);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
