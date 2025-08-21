package day12_Selenium_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sampleautomationtestpractice.blogspot.com/2025/08/drag-and-drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//dragAndDrop
		WebElement hyd= driver.findElement(By.xpath("//div[@id='Hyderabad']"));
		WebElement tg= driver.findElement(By.xpath("//div[normalize-space()='Telangana']"));
		act.dragAndDrop(hyd, tg).perform();
		
		//dragAndDrop2
		WebElement amv= driver.findElement(By.xpath("//div[@id='Amaravati']"));
		WebElement ap= driver.findElement(By.xpath("//div[normalize-space()='Andhra Pradesh']"));
		act.dragAndDrop(amv, ap).perform();
	}

}
