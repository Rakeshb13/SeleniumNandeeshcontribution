package WorkingWithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation 
{
	@Parameters({"url","email","password"})
	@Test
	public void testCaseLogin(String url,String email,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		//Step 2 : To perform login
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
