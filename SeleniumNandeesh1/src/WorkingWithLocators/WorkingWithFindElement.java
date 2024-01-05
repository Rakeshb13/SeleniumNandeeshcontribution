package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement maleRadioButton=driver.findElement(By.id("gender-male"));
		maleRadioButton.click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Rakesh");
		
		
		
	}

}
