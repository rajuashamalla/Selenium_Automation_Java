package day10_Selenium_DynamicWebTable_Pagination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleautomationtestpractice.blogspot.com/2025/08/pagination.html");
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.xpath("//div[@id='pageInfo' and contains(text(),'Pages')]")).getText();
	//	int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//repeating pages
		for(int p=1;p<=3;p++)
		{
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//div[@id='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
		}
		//reading data from the page
		int NoOfRows=driver.findElements(By.xpath("//table[@id='dataTable']//tbody//tr")).size();
		for(int r=1;r<=NoOfRows;r++)
		{
			String EmpName=driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr["+r+"]//td[2]")).getText();
			String EmpEmail=driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr["+r+"]//td[4]")).getText();
			String EmpDep=driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr["+r+"]//td[3]")).getText();
			
			System.out.println(EmpName+"\t"+EmpEmail+"\t"+EmpDep);
		}
		driver.close();
		
	}

}
