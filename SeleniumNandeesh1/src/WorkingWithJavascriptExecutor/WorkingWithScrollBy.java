package WorkingWithJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollBy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//To perform scrolling towards down
		js.executeScript("scrollBy(0,500);");
		Thread.sleep(3000);
		js.executeScript("scrollBy(0,500);");
		Thread.sleep(3000);
		//To perform scrolling towards up
		js.executeScript("scrollBy(0,-500);");
		Thread.sleep(3000);
		js.executeScript("scrollBy(0,-500);");
		Thread.sleep(3000);
		
	}

}
