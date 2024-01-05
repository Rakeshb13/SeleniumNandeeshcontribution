package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		//To perfrom back 
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//To perfrom farword
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		//To perform refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
