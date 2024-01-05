package DemoWebShopTestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC02_AddToCart {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		DataUtility data_Utility = new DataUtility();
		
		//Step 1 : To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("URL"));
		
		//Step 2 : To perform login
		driver.findElement(By.linkText("Log in")).click();
		
		if(driver.getTitle().equals(data_Utility.getDataFromExcel("Titles", 0, 1)))
		{
			System.out.println("Login Page Displayed");
		}
		else {
			System.out.println("Login Page not Displayed");
		}
		
		driver.findElement(By.id("Email")).sendKeys(data_Utility.getDataFromProperties("email"));
		driver.findElement(By.id("Password")).sendKeys(data_Utility.getDataFromProperties("pwd"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//Step 3 : To navigate to Digital downloads
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		
		if(driver.getTitle().equals(data_Utility.getDataFromExcel("Titles", 1, 1)))
		{
			System.out.println("Digital downloads page is displayed");
		}
		else
			System.out.println("Digital downloads page is not displayed");
		
		//Step 4: Located all AddToCart buttons
		List<WebElement> allProducts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Step 5: To Add all the products to the cart
		for(WebElement product : allProducts )
		{
			product.click();	
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[text()='shopping cart']"))));
			Thread.sleep(1000);
		}
		
		//Step 6: To navigate to shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		if(driver.getTitle().equals(data_Utility.getDataFromExcel("Titles", 2, 1)))
		{
			System.out.println("Shopping Cart page displayed");
		}
		else
			System.out.println("Shopping cart page not displayed");
		
		List<WebElement> cartProducts=driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
		
		//Step 7: Validate the number of products in shopping cart
		if(allProducts.size()==cartProducts.size())
		{
			System.out.println("AddToCart Test Case Pass");
		}
		else
			System.out.println("AddToCart Test Case Fail");
		
		driver.findElement(By.linkText("Log out")).click();
		
		//Step 8: To close the browser
		driver.close();
	}
}
