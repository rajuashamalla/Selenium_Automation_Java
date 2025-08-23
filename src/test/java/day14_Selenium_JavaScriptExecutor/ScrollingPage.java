package day14_Selenium_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,3000)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));

		
		//2) scroll the page until the element is visible
		
//		WebElement el=driver.findElement(By.xpath("//div[normalize-space()='Read next']"));	
//		js.executeScript("arguments[0].scrollIntoView()", el);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3) scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		//4) scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
