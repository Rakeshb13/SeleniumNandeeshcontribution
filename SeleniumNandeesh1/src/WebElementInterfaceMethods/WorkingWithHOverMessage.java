package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHOverMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		
		WebElement searchTextFeild=driver.findElement(By.id("APjFqb"));
		searchTextFeild.sendKeys("Rakesh");
		System.out.println(searchTextFeild.getAttribute("value"));
		System.out.println("----------------------");
		System.out.println(searchTextFeild.getAttribute("title"));
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
