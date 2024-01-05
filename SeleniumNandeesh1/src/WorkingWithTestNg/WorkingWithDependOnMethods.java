package WorkingWithTestNg;

import org.testng.annotations.Test;

public class WorkingWithDependOnMethods 
{
	@Test
	public void register()
	{
		System.out.println("Registration Done..");
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("Login Done..");
	}

}
