package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {

	public static void main(String[] args) throws InterruptedException {
		// Test Data
		String url="https://demowebshop.tricentis.com/";
		String homePageExpTitle="Demo Web Shop";
		String registerPageExpTitle="Demo Web Shop. Register";
		
		//Step 1 : Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Navigating to Test URL
		driver.get(url);
		Thread.sleep(2000);
		
		//Step 3 : validate
		if(driver.getTitle().equals(homePageExpTitle))
		{
			System.out.println("Home page Displayed");
		}
		else
			System.out.println("Home page not Displayed");
		
		//Step 4 : Navigating to Register page
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		//Step 5: Validate
		if(driver.getTitle().equals(registerPageExpTitle))
		{
			System.out.println("Register Page Displayed");
		}
		else
			System.out.println("Register page not Displayed");
		
		//Step 6 : Close the browser
		driver.close();
		
		
		
		

	}

}
