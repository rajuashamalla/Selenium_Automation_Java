package day17_Selenium_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllAnnotations {

	// Runs once before the entire suite
    @BeforeSuite
    void beforeSuite() {
        System.out.println("this is @BeforeSuite");
    }

    // Runs once after the entire suite
    @AfterSuite
     void afterSuite() {
        System.out.println("this is @AfterSuite");
    }

    // Runs before any test in <test> tag of testng.xml
    @BeforeTest
    void beforeTest() {
        System.out.println("this is @BeforeTest ");
    }

    // Runs after all tests in <test> tag of testng.xml
    @AfterTest
    void afterTest() {
        System.out.println("this is @AfterTest ");
    }

    // Runs once before first method of the class
    @BeforeClass
    void beforeClass() {
        System.out.println("this is @BeforeClass");
    }

    // Runs once after all methods of the class
    @AfterClass
    void afterClass() {
        System.out.println("this is @AfterClass ");
    }

    // Runs before each @Test method
    @BeforeMethod
    void beforeMethod() {
        System.out.println("this is @BeforeMethod ");
    }

    // Runs after each @Test method
    @AfterMethod
    void afterMethod() {
        System.out.println("this is @AfterMethod ");
    }

    // Test
    @Test(priority = 1)
    void test1() {
        System.out.println("this is @Test1");
    }

    // Test
    @Test(priority = 2)
    void test2() {
        System.out.println("this is  @Test2 ");
    }

	
	
	
}
