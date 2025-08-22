package day13_Selenium_KeyboardActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		//ctrl+reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();		
		//switching to register page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1)); // switch to register page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("IronMan");
		
		//Home page
		driver.switchTo().window(ids.get(0)); // switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("smartphones");

		
		//Selenium 4.x opening new website in another tab
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);// open new tab
		driver.get("https://www.amazon.in/");
		
	//Selenium 4.x opening new website in another window
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);// open new tab
		driver.get("https://www.amazon.in/");

		
		
		
	}

}
