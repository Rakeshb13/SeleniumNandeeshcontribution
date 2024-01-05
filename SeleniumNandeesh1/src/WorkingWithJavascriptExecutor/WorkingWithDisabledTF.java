package WorkingWithJavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisabledTF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		
		WebElement disabledTF = driver.findElement(By.id("tb2"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", disabledTF);
		js.executeScript("scrollBy(0,100);");
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].value='Rakesh';", disabledTF);
		
		
		
		
		
	}

}
