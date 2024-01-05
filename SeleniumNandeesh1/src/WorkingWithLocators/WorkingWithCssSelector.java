package WorkingWithLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class WorkingWithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ico-register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("Rakesh");

	}

}
