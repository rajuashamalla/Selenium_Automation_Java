package day17_Selenium_TestNG;

import org.testng.annotations.Test;

public class PaymentTests {

	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinrupees()
	{
		System.out.println(" payment in rupees  ...........");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentindollors()
	{
		System.out.println(" payment in dollors  ...........");
	}
	
}
