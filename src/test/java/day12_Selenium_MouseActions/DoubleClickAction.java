package day12_Selenium_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://sampleautomationtestpractice.blogspot.com/2025/08/double-click.html");
		driver.manage().window().maximize();
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[@id='copytext']"));
		
		box1.clear();
		box1.sendKeys("HELLO TESTERS");
		
		//Double Click actions on the button
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation : box 2 should contains "HELLO TESTERS"
		
		String text=box2.getAttribute("value");
		
		System.out.println("captured value is:" +text);
		
		if(text.equals("HELLO TESTERS"))
		{
			System.out.println("Text Copied");
		}
		else
		{
			System.out.println("Text not Copied");
		}
		driver.close();

	}

}
