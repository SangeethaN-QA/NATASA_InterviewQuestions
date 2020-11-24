package automationFramework.com;

import java.io.FileOutputStream;
import java.util.Properties;

public class Config {
	
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream output = new FileOutputStream("src/test/resources/propertiesFile/configfile.properties");
			
			Properties prop = new Properties();
			
			prop.setProperty("appURL", "www.gmail.com");
			prop.setProperty("username", "natasatech");
			prop.setProperty("password", "12345678");
			prop.setProperty("key", "value");
			
			prop.store(output, null);
			
			System.out.println(prop);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
	}

}
