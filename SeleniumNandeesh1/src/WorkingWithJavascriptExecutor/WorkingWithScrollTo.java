package WorkingWithJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//To perform scrolling till that point
		js.executeScript("scrollTo(1000,1500);");
		Thread.sleep(3000);
		
		driver.close();
	}

}
