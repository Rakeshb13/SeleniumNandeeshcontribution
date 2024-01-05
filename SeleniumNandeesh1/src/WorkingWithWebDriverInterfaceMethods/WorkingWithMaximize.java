package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMaximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//To maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//To minimize
		driver.manage().window().minimize();
		//To full screen
		driver.manage().window().fullscreen();
		driver.get("https://www.skillrary.com/");
		
		
		

	}

}
