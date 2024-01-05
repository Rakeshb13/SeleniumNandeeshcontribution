package LaunchingBrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class demo {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https:www.google.co.in");
		
		driver.get("https://demowebshop.tricentis.com/login");
		//email is present above password.
		driver.findElement(RelativeLocator.with(By.id("Email")).above(By.id("Password"))).sendKeys("Rakesh");
		//password is present below email
		driver.findElement(RelativeLocator.with(By.id("Password")).below(By.id("Email"))).sendKeys("asdfghj");
		
	}
}