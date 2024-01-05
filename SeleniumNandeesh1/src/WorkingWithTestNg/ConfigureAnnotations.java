package WorkingWithTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigureAnnotations {
	
	@BeforeSuite
	public void beforeSuit() 
	{
		System.out.println("Establish Connection With Server");
	}
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Establish Connection With DB");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Launch The Browser");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Perform Login");
	}
	
	@Test
	public void testCase1() 
	{
		System.out.println("Test Case 1 is Pass");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Perform Logout");
	}
	@AfterClass
	public void afterClass() 
	{
		System.out.println("Close the Browser");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("Disconnect form DB");
	}
	@AfterSuite
	public void afterSuit() 
	{
		System.out.println("Disconnect from server.");
	}
}
