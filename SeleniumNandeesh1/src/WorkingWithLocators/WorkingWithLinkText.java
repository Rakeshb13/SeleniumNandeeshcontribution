package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expTitle="Demo Web Shop. Password Recovery";
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		
		if(driver.getTitle().equals(expTitle))
		{
			System.out.println("Test Case Pass");
		}
		else
			System.out.println("Test Case Fail");
		
		driver.close();
	}
}
