package WorkingWithPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());
		String mainId=driver.getWindowHandle();
		System.out.println(mainId);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id : allIds)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	
	
	}

}
