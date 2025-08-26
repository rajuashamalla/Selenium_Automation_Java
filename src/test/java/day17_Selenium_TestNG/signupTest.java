package day17_Selenium_TestNG;

import org.testng.annotations.Test;

public class signupTest {

	@Test(priority=1,groups= {"regression"})
	void singupByemail()
	{
		System.out.println("this is signup by  email  ");
	}
	@Test(priority= 2,groups= {"regression"})
	void singupByfacebook()
	{
		System.out.println("this is signup by facebook  ");
	}
	@Test(priority= 3,groups= {"regression"})
	void singupByX()
	{
		System.out.println("this is signup by X  ");
	}
	
		
	
	
}
