package WorkingWithTestNg;

import org.testng.annotations.Test;

public class WorkingWithMulipleTestAnnotation {

	@Test(priority = 1)
	public void register()
	{
		System.out.println("Registration Done..");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Done..");
	}
	
	@Test(enabled = false)
	public void AddToCart()
	{
		System.out.println("AddToCart Done..");
	}
	
	@Test(priority = 4)
	public void placeOrder()
	{
		System.out.println("Order Placed..");
	}
	
	
	
	
}
