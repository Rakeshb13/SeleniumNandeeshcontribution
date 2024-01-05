package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		System.out.println("Title : "+driver.getTitle());
		System.out.println("Url : "+driver.getCurrentUrl());
		
		//To close the browser
		driver.close();
		//driver.quit();
		
		

	}

}
