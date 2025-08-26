package day17_Selenium_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login -@BeforeMethod
 * Search--@Test
 * Logout -@AfterMethod
 *  login -
 * Search--@Test
 * Logout -
 */

public class AnnotationDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login..");
	}
	@Test
	void Search()
	{
		System.out.println("This is search...");
	}
	@Test
	void advancedsearch()
	{
		System.out.println("advanced search...");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout...");
	}
	

}
