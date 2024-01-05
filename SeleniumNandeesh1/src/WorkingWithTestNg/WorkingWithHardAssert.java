package WorkingWithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DemoWebShopTestCases.DataUtility;

public class WorkingWithHardAssert 
{
	@Test
	public void Login()
	{
DataUtility data_Utility = new DataUtility();
		
		//Step 1 : To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step 2 : To perform login
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
		Reporter.log("Login Page Displayed", true);
		
		driver.findElement(By.id("Email")).sendKeys("kavipriya@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passw0rd@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		Reporter.log("Home Page Displayed", true);
		
		
		driver.close();
		
		
	}

}
