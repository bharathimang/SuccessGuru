package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import pages.BasePage;

public class ConfigUtils extends BasePage {
	
	public ConfigUtils() throws IOException {
		File file=new File("src/test/resources/Config.properties");
		FileReader reader=new FileReader(file);
		prop=new Properties();
		prop.load(reader);
	}
	
	public String getURL() {
		return prop.getProperty("url");
	}
	
	public String getUserName() {
		return prop.getProperty("userName");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}

}
