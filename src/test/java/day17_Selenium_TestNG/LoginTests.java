package day17_Selenium_TestNG;

import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by Email....");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by Facebook....");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByX()
	{
		System.out.println("this is login by X....");
	}
}
