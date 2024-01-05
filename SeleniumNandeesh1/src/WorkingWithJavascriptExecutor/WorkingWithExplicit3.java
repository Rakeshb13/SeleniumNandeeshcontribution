package WorkingWithJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("button00")).click();
		
		driver.findElement(By.id("button01")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button02")));
		driver.findElement(By.id("button02")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button03")));
		driver.findElement(By.id("button03")).click();
	}

}
