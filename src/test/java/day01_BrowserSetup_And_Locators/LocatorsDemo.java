package day01_BrowserSetup_And_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Name locator
//		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		
		
		// id 
//		boolean logoDisplaystatus=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//		System.out.println(logoDisplaystatus);
		
		//linkText and Partial
//		driver.findElement(By.linkText("Mobiles")).click();
//		driver.findElement(By.partialLinkText("Mobil")).click();
		
		//TagName and class // used for multiple elements or group of web elements
//		List<WebElement> headerLinks=driver.findElements(By.className("nav-div"));
//		System.out.println("total number of header links: " +headerLinks.size());

		//tagName
//		List<WebElement> Links=driver.findElements(By.tagName("a"));
//		System.out.println("total number of  links: " +Links.size());
	}

}
