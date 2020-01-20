package me.awfulmatt.template;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.print("[Template] Plugin Started");
		
		new ListenerClass(this);
		
		getCommand("temp").setExecutor(new Commands());
		
		//"E:\\Servers\\Minecraft\\Minecraft\\Classic\\plugins\\Template"
		new DataFile(this.getDataFolder().getAbsolutePath());
		DataFile.createFile("Test");
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void timedTask() {
		/* 
		 * Run a timed task every 300 seconds.
		 * It is multiplied by 20 as thats how much the server ticks for a second.
		 */
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			 
		    @Override
		    public void run() {
		       for ( Player player : getServer().getOnlinePlayers() ) {
		    	   System.out.print(player.getName() + " - " + player.getUniqueId());
		       }
		    }
		 
		}, 1L , (long) 300 * 20);
		
	}
}
