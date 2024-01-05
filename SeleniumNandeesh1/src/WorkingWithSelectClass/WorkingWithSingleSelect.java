package WorkingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		WebElement dropDown = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropDown);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("abc");
		Thread.sleep(3000);
		select.selectByVisibleText("doc 4");
		Thread.sleep(3000);
		
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}
		
		driver.close();

	}

}
