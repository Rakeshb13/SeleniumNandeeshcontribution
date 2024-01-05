package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		String message=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		System.out.println(message);
		Thread.sleep(2000);
		
		driver.close();
	}

}
