package day07_Selenium_Frames_iFrames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame_1 Test");
        driver.switchTo().defaultContent(); // go back to page

        // Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame_2 Test");
        driver.switchTo().defaultContent();

        // Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        // Switch to inner iframe inside Frame 3
        WebElement innerIframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(innerIframe);

        // Click inside inner iframe
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

        // Back to main page
        driver.switchTo().defaultContent();

  //      driver.quit();
    }
}
