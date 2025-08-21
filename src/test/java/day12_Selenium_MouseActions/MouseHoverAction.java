package day12_Selenium_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement Ele=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		Actions act=new Actions(driver);
		// mouse hover action
		act.moveToElement(Ele).click().build().perform();
		}

}
