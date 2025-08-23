package day14_Selenium_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		//single file upload
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\LUCIFER\\Desktop\\upload\\text1.txt");

		//Muliple files upload
		String file1="C:\\Users\\LUCIFER\\Desktop\\upload\\text1.txt";
		String file2="C:\\Users\\LUCIFER\\Desktop\\upload\\text2.txt";
		String file3="C:\\Users\\LUCIFER\\Desktop\\upload\\text3.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		
	}

}
