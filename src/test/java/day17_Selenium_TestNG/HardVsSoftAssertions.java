package day17_Selenium_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
//	void test_hardassertion()
//	{
//		System.out.println("Testing.....");
//		System.out.println("Testing.....");
//		
//		Assert.assertEquals(1, 2); // hard assert
//		
//		System.out.println("Testing.....");
//		System.out.println("Testing.....");
//		
//	}
	
	void test_softassertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(1, 2);					//soft Assert
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		sa.assertAll();// mandatory
		
	}
	
	
	

}
