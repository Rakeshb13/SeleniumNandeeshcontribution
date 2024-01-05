package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPatialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("Shopping")).click();

		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			System.out.println("test case pass..");
		}
		else
			System.out.println("test case fail..");
		
		driver.close();
	}

}
