package WorkingWithPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("register_Layer")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\raki9\\OneDrive\\Desktop\\What is Automation Testing.pdf");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
