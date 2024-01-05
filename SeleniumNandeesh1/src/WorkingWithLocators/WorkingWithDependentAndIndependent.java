package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDependentAndIndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		Thread.sleep(2000);
		String name=driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']")).getText();
		
		WebElement price=driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../..//span"));
		
		
		
		System.out.println(name +" - "+ price);
		Thread.sleep(2000);
		driver.close();
		
	}

}
