package day03_Selenium_XPath_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed()
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo:" + logo.isDisplayed());
	
		//isEnabled()
//		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println(status);
		
		//isSelected();
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection..");
		System.out.println(male_rd.isSelected());// false
		System.out.println(female_rd.isSelected());//false

		System.out.println("After selecting male..");
		male_rd.click();
		
		System.out.println(male_rd.isSelected());// true
		System.out.println(female_rd.isSelected());//false

		
		
	}

}
