package day09_Selenium_AutoSuggestDropdown_StaticWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1) find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//		System.out.println("Number of rows:" +rows); //7
		
		//2) find total number of columns
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns is:"+cols);//4
		
		//3) read data from specific rows and columns ex=5R and 3col
	//	String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
	//	System.out.println(BookName);
		
		//4) read data from all the rows and columns
//		for(int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=cols;c++)
//			{
//			String value=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//			System.out.println(value+"\t");
//			}
//			
//		}
//		
		//5) print book names whose author is Mukesh
	/*	for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(authorName);
			
			if(authorName.equals("Mukesh"))
			{
				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println("Mukesh:"+BookName);
			}
			
		}
		
	*/
		//6) find total price of all the books
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("price of books:"+total);//7100
		
		
	}

}
