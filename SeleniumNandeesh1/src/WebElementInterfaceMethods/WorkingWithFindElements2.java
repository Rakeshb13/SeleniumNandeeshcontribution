package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
//		Thread.sleep(2000);
//		if(driver.getTitle().equals("Demo Web Shop. Apparel & Shoes"))
//		{
//			System.out.println("Apparel page displayed..");
//		}
//		else
//			System.err.println("Apparel page not displayed..");
//
//		
//		List<WebElement> allProductsName = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
//		
//		for(WebElement productName : allProductsName)
//		{
//			System.out.println(productName.getText());
//		}
		
		 List<WebElement> allRadioButtons = driver.findElements(By.xpath("//rakesh"));
		System.out.println(allRadioButtons.size());
		for(WebElement radioButton : allRadioButtons)
		{
			radioButton.click();
			Thread.sleep(2000);
		}
		
		
		driver.close();
	}

}
