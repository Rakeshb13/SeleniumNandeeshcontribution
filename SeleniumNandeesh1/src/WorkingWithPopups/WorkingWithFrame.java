package WorkingWithPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("mce_0_ifr");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
		String message=driver.findElement(By.tagName("p")).getText();
		System.out.println(message);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
