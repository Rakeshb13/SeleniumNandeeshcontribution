package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actEmail="rakesh123@gmail.com";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTextFeild=driver.findElement(By.id("Email"));
		emailTextFeild.sendKeys(actEmail);
		
		String expEmail=emailTextFeild.getAttribute("value");
		
		if(actEmail.equals(expEmail))
		{
			System.out.println("email text feild is accepting data");
		}
		else
			System.out.println("email text feild is not accepting data");
		
		
		driver.close();
		
		
		
		
	}

}
