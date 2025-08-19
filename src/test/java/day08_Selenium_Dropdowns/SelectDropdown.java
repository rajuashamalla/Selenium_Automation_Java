package day08_Selenium_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drCountry=new Select(drCountryEle);
		
		//Select option from the dropdown
		
//	drCountry.selectByVisibleText("France");
		drCountry.selectByValue("india");
//		drCountry.selectByIndex(9);
		
		//capture options from the dropdown
//		List<WebElement> options=drCountry.getOptions();
//		System.out.println("Number of options in a Dropdown:" + options.size());
		
		//printing the options
/*		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
*/	
		//enhanced for loop
//		for(WebElement op:options)
//		{
//			System.out.println(op.getText());
		}
	}

//}
