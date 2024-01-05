package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("sdfghj@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("asdfghj");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		String color=driver.findElement(By.xpath("//div[@class='message-error']")).getCssValue("color");
		
		String font=driver.findElement(By.xpath("//div[@class='message-error']")).getCssValue("font");
		
		System.out.println("color : "+color);
		
		System.out.println("font : "+font);
		
		driver.close();
		
		
	}

}
