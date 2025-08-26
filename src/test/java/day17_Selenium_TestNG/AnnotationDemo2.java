package day17_Selenium_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * login -@BeforeClass
 * Search--@Test
 * Logout -@AfterClass
 *  login -
 * Search--@Test
 * Logout -
 */

public class AnnotationDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("This is login..");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is search...");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advanced search...");
	}
	@AfterClass
	void logout()
	{
		System.out.println("this is logout...");
	}
	

}
