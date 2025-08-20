package day11_Selenium_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	//selecting future date
	static void selectFutureDate(WebDriver driver,String year,String month,String date)
	{
	
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   // actual year

            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next
            // driver.findElement(By.xpath("//a[@title='Prev']")).click(); // previous
        }
//        select date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt : allDates) 
        {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }


	}
	
	//selecting past date
	static void selectPastDate(WebDriver driver,String year,String month,String date)
	{
	
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   // actual year

            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
//            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next
             driver.findElement(By.xpath("//a[@title='Prev']")).click(); // previous
        }
//        select date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt : allDates) 
        {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }


	}
	
	

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);

        // Method 1 using sendKeys
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/19/2025");

        // Method 2 : using datepicker

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
  //      selectFutureDate(driver,"2025","August","20");
        String year="2026";
        String month="August";
        String date="20";
        
        selectFutureDate(driver,year,month,date);
 //       selectPastDate(driver,year,month,date);
        
       
        
    } 
} 
