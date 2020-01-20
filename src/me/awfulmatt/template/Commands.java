package me.awfulmatt.template;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class Commands implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) return true;
		Player player = (Player) sender;
		
		if(args.length == 0) {
			return true;
		}
		
		/* -Test */
		if(args[0].equalsIgnoreCase("test")) {
			if(player.isOp() || player.hasPermission("template.test")) {
				player.sendMessage(ChatColor.GOLD + "Works.");
			}
		}
		
		
		return true;
	}
}
