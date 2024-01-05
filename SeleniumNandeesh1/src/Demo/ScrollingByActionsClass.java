package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		//To scroll down
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, 500).perform();
		//To scroll up
		act.scrollByAmount(0, -500).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, -500).perform();
		//TO scroll till particular web element
		WebElement target = driver.findElement(By.xpath("//h2[text()='News']"));
		try {
			act.scrollToElement(target).perform();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		

	}

}
