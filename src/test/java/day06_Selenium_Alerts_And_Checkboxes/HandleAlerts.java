package day06_Selenium_Alerts_And_Checkboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with Ok button
/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
*/
		//Confirmation alert
/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
	//	driver.switchTo().alert().accept(); //close alert button using OK button
		
	//	driver.switchTo().alert().dismiss(); // close alert using Cancel button
*/
		//Prompt Alert - Input Box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("hello");
		myalert.accept();
		

	}

}
