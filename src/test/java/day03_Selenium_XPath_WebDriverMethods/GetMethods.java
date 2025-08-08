package day03_Selenium_XPath_WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		//get(url) opens the url 
		driver.get("https://demo.nopcommerce.com/");
		// getTitle() returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() returns URL of the page
		System.out.println(driver.getCurrentUrl());

		//getPageSource() returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() returns ID of the single Browser window
		String windowid=driver.getWindowHandle();
		System.out.println("Window ID:" +windowid);
		
		//getWindowsHandles() returns ID's of the multiple browser windows
		driver.findElement(By.linkText("Digital downloads")).click(); // this will opens new browser window
		Set<String> windowids=driver.getWindowHandles();
		
		
	}

}
