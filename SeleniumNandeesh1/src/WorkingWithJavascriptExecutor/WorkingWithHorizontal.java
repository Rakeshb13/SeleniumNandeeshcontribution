package WorkingWithJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHorizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//To perform scrolling towards right
		js.executeScript("scrollBy(500,0);");
		Thread.sleep(2000);
		js.executeScript("scrollBy(500,0);");
		Thread.sleep(2000);
		//To perform scrolling towards left
		js.executeScript("scrollBy(-600,0);");
		Thread.sleep(2000);
		js.executeScript("scrollBy(-400,0);");
		Thread.sleep(2000);
		driver.close();
	}

}
