package automationFramework.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop ;
	public Properties readConfig()
	{

		FileInputStream input;
		try {
			input = new FileInputStream("src/test/resources/propertiesFile/readConfig.properties");
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;

	}
	
	
	public String get_Applicationurl()
	{
		String app_url = readConfig().getProperty("applicationurl");
		System.out.println(" application url ---- > " +app_url);
		return app_url;
	}
	
	public String get_Username()
	{
		String username = readConfig().getProperty("username");
		System.out.println(" username ---- > " +username);
		return username;
	}
	
	public String get_Password()
	{
		String password = readConfig().getProperty("password");
		System.out.println(" password ---- > " +password);
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
