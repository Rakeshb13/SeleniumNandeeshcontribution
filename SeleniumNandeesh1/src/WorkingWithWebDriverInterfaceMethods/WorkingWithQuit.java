package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium%20class%20files/Demo%20WebPage/Multiple%20Windows.html");
		
		driver.findElement(By.id("open-windows-button")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		

	}

}
