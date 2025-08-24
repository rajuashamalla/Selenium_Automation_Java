package day15_Selenium_Advanced;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		1) Capture full Page screenshot
/*		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		srcfile.renameTo(trgfile); // copy srcfile to trgfile
*/		
//      2) Capture the screenshot of specific section
/*		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File srcfile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		srcfile.renameTo(trgfile);
*/		
//      3)Capture the screenshot of webelement		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File srcfile=logo.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		srcfile.renameTo(trgfile);
		driver.quit();
		
	}

}
