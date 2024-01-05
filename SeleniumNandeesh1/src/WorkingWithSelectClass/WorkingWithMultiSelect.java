package WorkingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/raki9/OneDrive/Desktop/WSS06/Notification%20and%20DropDowns.html");

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		
		Select select = new Select(dropDown);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByValue("Toyo");
		Thread.sleep(2000);
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		
		for(WebElement selectedOption : allSelectedOptions)
		{
			System.out.println(selectedOption.getText());
		}
		System.out.println("--------------------");
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		
		System.out.println(select.isMultiple());
		
		driver.close();
		
	}

}
