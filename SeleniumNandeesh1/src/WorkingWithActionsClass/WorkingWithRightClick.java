package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		//act.contextClick(rightClickButton).perform();
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(doubleClickButton).doubleClick().perform();
		
	}

}
