package day02_CssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); // maximize the browser window
		
		
		//tag id          tag#ID
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("smartphone");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("smartphone");

		//tag class    tag.class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("smartphone");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("smartphone");
		
		//tag attribute tag[attribute="value"]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		
		//tag class attribute    tag.classname[attribute="value"]
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("SmartPhone");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("SmartPhone");

		
		
	}

}
