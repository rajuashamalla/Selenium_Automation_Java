package day13_Selenium_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        // minimum slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Default Location of the min slider: " + min_slider.getLocation());

        Actions act = new Actions(driver);
        // move min slider to right by 100 pixels (x offset), y = 0
        act.dragAndDropBy(min_slider, 100, 0).perform();
        System.out.println("Location of the min slider after moving: " + min_slider.getLocation());

        // maximum slider
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Default Location of the max slider: " + max_slider.getLocation());

        // move max slider to left by -150 pixels (x offset), y = 0
        act.dragAndDropBy(max_slider, -150, 0).perform();
        System.out.println("Location of the max slider after moving: " + max_slider.getLocation());

        driver.quit();
    }
}
