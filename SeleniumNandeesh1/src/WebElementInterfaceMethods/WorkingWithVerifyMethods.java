package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithVerifyMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		System.out.println("Selected : "+checkBox.isSelected());
		
		checkBox.click();
		
		System.out.println("Selected : "+checkBox.isSelected());
		
		System.out.println("Displayed : "+checkBox.isDisplayed());
		
		System.out.println("Enabled : "+checkBox.isEnabled());
		
		driver.close();
	}

}
