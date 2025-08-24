package day15_Selenium_Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(options);
		
	
			driver.get("https://www.google.com/");
		
		
			String act_title=driver.getTitle();
			if(act_title.equals("Google"))
			{
				System.out.println("Test Passed....");
			}
			else
			{
				System.out.println("Test Failed....");
			}
			
			driver.quit();			

	}

}
