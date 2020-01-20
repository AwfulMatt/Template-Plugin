package me.awfulmatt.template;

import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ListenerClass implements Listener {
	
		Main main;
		
		public ListenerClass(Main _main) {
			main = _main;
			main.getServer().getPluginManager().registerEvents(this, main);
		}
		
		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent e) {
			Player player = e.getPlayer();
			Bukkit.broadcastMessage(player.getDisplayName() + " has joined the server!");
		}
}
