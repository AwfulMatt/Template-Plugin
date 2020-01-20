package me.awfulmatt.template;

import java.io.File;


import org.bukkit.configuration.file.YamlConfiguration;

public class DataFile {
	
	static String pluginFolder;
	
	public DataFile(String _pluginFolder) {
		pluginFolder = _pluginFolder;	
		
		/* This creates a folder called data in the Data Folder which is the folder in the plugins folder. */
		try {
			File filePath = new File(pluginFolder + File.separator + "data" + File.separator);
			filePath.mkdirs();
		} catch(Exception e) {
			
		}
	}
	
	/* Creates a file with the name you pass through */
	static void createFile(String name) {
		try {
			File file = new File(pluginFolder + File.separator + "data" + File.separator + name + ".yml");
			if(file.exists()) {
				/* Set some properties */
				YamlConfiguration yamlFile = YamlConfiguration.loadConfiguration(file);
				yamlFile.set("name", "matt");
				yamlFile.save(file);
				
				/* Get properties */
				String s = yamlFile.getString("name");
			} else {
				file.createNewFile();
			}
		} catch (Exception e) {
			
		}
	}
}
