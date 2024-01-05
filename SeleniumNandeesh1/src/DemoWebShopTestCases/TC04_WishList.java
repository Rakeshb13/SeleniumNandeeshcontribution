package DemoWebShopTestCases;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_WishList {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Testengg111@gmial.com");
		driver.findElement(By.id("Password")).sendKeys("Engg@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement product = driver.findElement(By.linkText("Fiction EX"));
		
		product.click();
		
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		WebElement wishListProduct=driver.findElement(By.xpath("//a[text()='Fiction EX']"));
		
		if(wishListProduct.isDisplayed())
		{
			System.out.println("Wish List Test Case Pass..");
		}
		else
			System.out.println("Wish List Test Case Fail..");
		
		
		List<WebElement> allRemoveCheckBox = driver.findElements(By.xpath("//td[@class='remove-from-cart']/input"));
		
		for (WebElement checkBox : allRemoveCheckBox) {
			checkBox.click();
		}
		
		driver.findElement(By.xpath("//input[@value='Update wishlist']")).click();
	
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
	}
}
