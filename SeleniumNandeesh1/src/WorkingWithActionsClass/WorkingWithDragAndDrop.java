package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.id("box3"));
		WebElement target = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(source, target).perform();
		act.clickAndHold(source).moveToElement(target).release().perform();
		act.clickAndHold(source).release(target).perform();
		

	}

}
