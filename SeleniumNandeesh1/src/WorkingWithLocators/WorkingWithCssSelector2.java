package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#gender-male")).click();
		
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
		

	}

}
