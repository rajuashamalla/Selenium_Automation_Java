package day01_BrowserSetup_And_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 1) Launch browser (chrome)
 * 2) open url https://www.google.com/
 * 3) validate title should be"Google"
 * 4) close browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
		
		 // 1) Launch browser (chrome)
	//	ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		// 2) open url https://www.google.com/
			driver.get("https://www.google.com/");
		
		//3) validate title should be "Google"
			String act_title=driver.getTitle();
			if(act_title.equals("Google"))
			{
				System.out.println("Test Passed....");
			}
			else
			{
				System.out.println("Test Failed....");
			}
			//4) close browser
			//driver.close();
			driver.quit();			
	}

}
