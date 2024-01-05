package DemoWebShopTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_EmptyCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Testengg111@gmial.com");
		driver.findElement(By.id("Password")).sendKeys("Engg@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

		List<WebElement> allRemoveCheckBox = driver
				.findElements(By.xpath("//tr[@class='cart-item-row']//input[@type='checkbox']"));

		for (WebElement removeCheckBox : allRemoveCheckBox) {
			removeCheckBox.click();
		}

		try {

			driver.findElement(By.name("updatecart")).click();

			if (allRemoveCheckBox.size() == 0) {
				System.out.println("Empty Cart Test Case Pass");
			} else
				System.out.println("Empty Cart Test Case Fail");
			
		} catch (NoSuchElementException e) {

			System.out.println("Empty Cart Test Case Pass");
		}

		driver.findElement(By.linkText("Log out")).click();
		
		//Step 8: To close the browser
		driver.close();
	}

}
