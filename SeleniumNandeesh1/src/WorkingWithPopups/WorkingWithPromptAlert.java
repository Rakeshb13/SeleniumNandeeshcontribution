package WorkingWithPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		driver.switchTo().alert().sendKeys("Selenium");
		
		driver.switchTo().alert().accept();
		
		String message=driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		driver.close();
	}

}
