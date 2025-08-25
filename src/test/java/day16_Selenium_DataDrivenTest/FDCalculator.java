package day16_Selenium_DataDrivenTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FDCalculator {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     // ✅ Handle popup if it appears
        try {
            WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
            cancelBtn.click();
            System.out.println("Popup closed.");
        } catch (Exception e) {
            System.out.println("No popup displayed.");
        }
        String filepath = System.getProperty("user.dir") + "\\testdata\\ddt.xlsx";
        int rows = ExcelUtils.getRowCount(filepath, "Sheet1");   // ✅ must match your Excel sheet name

        for (int i = 1; i <= rows; i++) {
            // read data from excel
            String prin = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
            String RateOfInterest = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
            String per1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
            String per2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
            String freq = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);

            String exp_mvalue = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);

            // pass data into app
            driver.findElement(By.id("principal")).sendKeys(prin);
            driver.findElement(By.id("interest")).sendKeys(RateOfInterest);
            driver.findElement(By.id("tenure")).sendKeys(per1);

            Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
            perdrp.selectByVisibleText(per2);

            Select fredrp = new Select(driver.findElement(By.id("frequency")));
            fredrp.selectByVisibleText(freq);

            driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();

            // validation
            String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if (Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue)) {
                System.out.println("Test passed");
                ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");
                ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
            } else {
                System.out.println("Test failed");
                ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Failed");
                ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
            }

            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click(); // clear button
        }

        driver.close();
    }
}
