package day03_Selenium_XPath_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Iphone 16 pro");
		
		
		//XPath with multiple attributes
//		driver.findElement(By.xpath("//input[@name='q'][@id='small-searchterms']")).sendKeys("Iphone 16 pro");

		
		//XPath with AND and OR Operator
//		driver.findElement(By.xpath("//input[@name='q' and @id='small-searchterms']")).sendKeys("Iphone 16 pro");
//		driver.findElement(By.xpath("//input[@name='q' or @id='small-searchterms']")).sendKeys("Iphone 16 pro");
		
		//XPath With text()
//		driver.findElement(By.xpath("//*[text()='Log in']")).click();
//		boolean displaystatus=driver.findElement(By.xpath("//h1[normalize-space()='Electronics']")).isDisplayed();
//		System.out.println(displaystatus);
		
		//XPath with contains()
//		driver.findElement(By.xpath("//input[contains(@id,'sma')]")).sendKeys("Tshirts");
		
		//XPath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@id,'sma')]")).sendKeys("Tshirts");
	}

}
