package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithSeleniumManager {

	public static void main(String[] args) {
		//No need to use System.setProperty(key,path).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		//Syntax of implicit and explicit wait.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		//To open a tab or new window
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.co.in");
		
		
		
		
		

	}

}
