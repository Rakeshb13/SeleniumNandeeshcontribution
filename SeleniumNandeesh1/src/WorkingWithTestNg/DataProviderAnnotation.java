package WorkingWithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	
	
	@Test(dataProvider = "data")
	public void testCaseLogin(String email,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step 2 : To perform login
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
	@DataProvider(name="data")
	public Object dataSupply()
	{
		Object[][] arr = new Object[3][2];
		arr[0][0] = "mymail001@gmail.com";
		arr[0][1] = "password";
		arr[1][0] = "mymail002@gmail.com";
		arr[1][1] = "password";
		arr[2][0] = "mymail003@gmail.com";
		arr[2][1] = "password";
		
		
		return arr;
	}

}
