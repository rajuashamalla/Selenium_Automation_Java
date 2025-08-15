package day08_Selenium_Dropdowns;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://sampleautomationtestpractice.blogspot.com/2025/08/dropdown.html");
        driver.manage().window().maximize();

        // Open the dropdown
        driver.findElement(By.xpath("//button[contains(@class,'dropdown-toggle')]")).click();

        // Capture all checkboxes
        List<WebElement> options = driver.findElements(
            By.xpath("//input[@type='checkbox' and contains(@class,'form-check-input')]")
        );

        System.out.println("Number of options: " + options.size());

        // Loop through each checkbox
        for (WebElement op : options) {
            // Get label text
            String labelText = op.findElement(By.xpath("./following-sibling::label")).getText();
            System.out.println("Found: " + labelText);

            // Select specific options by label
            if (labelText.equalsIgnoreCase("Option 1") ||
                labelText.equalsIgnoreCase("Option 3") ||
                labelText.equalsIgnoreCase("Option 5")) {

                if (!op.isSelected()) {
                    op.click();
                    System.out.println("Selected: " + labelText);
                }
            }
        }

        // Click Apply button
        driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();

        driver.quit();
    }
}
