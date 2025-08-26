package day17_Selenium_TestNG;

import org.testng.annotations.Test;

/*
 * 1) open app
 * 2)Login
 * 3)logout
 */


public class FirstTestCase {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening app");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login to app");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from app");
	}
	
	
}
