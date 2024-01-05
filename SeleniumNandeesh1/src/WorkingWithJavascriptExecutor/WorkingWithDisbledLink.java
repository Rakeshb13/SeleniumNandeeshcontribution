package WorkingWithJavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisbledLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(3000);
	
		WebElement target = driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-8u391-linux-aarch64.rpm']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", target);
		
		target.click();
		Thread.sleep(3000);
		
		WebElement disabledLink = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-aarch64.rpm']"));
		
		js.executeScript("arguments[0].click();", disabledLink);
		
	}

}
