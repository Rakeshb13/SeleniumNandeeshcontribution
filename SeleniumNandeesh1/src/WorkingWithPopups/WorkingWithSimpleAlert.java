package WorkingWithPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String alertMessage=alt.getText();
		
		Thread.sleep(2000);
		
		alt.accept();
		
		String message=driver.findElement(By.id("result")).getText();
		System.out.println(message);
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.close();
	}

}
