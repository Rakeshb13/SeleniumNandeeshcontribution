package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToELement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions act = new Actions (driver);
		act.moveToElement(loginButton).perform();
		Thread.sleep(2000);
		
		WebElement wishList = driver.findElement(By.xpath("//li[text()='Wishlist']"));
		act.moveToElement(wishList).click().perform();
		Thread.sleep(2000);
		//act.click().perform();
		Thread.sleep(2000);
		act.click(wishList).perform();
		driver.close();

	}

}
