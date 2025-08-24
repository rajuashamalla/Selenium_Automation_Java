package day15_Selenium_Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * 1) Launch browser (chrome)
 * 2) open url https://www.google.com/
 * 3) validate title should be"Google"
 * 4) close browser
 */
public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");// setting for headless mode of execution
		
		
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
