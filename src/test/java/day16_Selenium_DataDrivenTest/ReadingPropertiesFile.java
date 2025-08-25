package day16_Selenium_DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		//location of the properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading properties file
		Properties propertiesobj=new Properties();
		propertiesobj.load(file);
		//reading data from properties file
		String url=propertiesobj.getProperty("appurl");
		String Username=propertiesobj.getProperty("Username");
		String Password=propertiesobj.getProperty("Password");
		
		System.out.println(url+" "+Username+" "+ Password);
		
		// reading all the keys from the properties file
		Set<String> keys=propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		//reading all the values from properties file
		Collection<Object> values=propertiesobj.values();
		System.out.println(values);
	}

}
