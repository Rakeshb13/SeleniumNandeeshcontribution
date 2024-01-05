package WorkingWithWebDriverInterfaceMethods;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateTo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.selenium.dev/");
		
		//driver.navigate().to("https://www.selenium.dev/");
		
		URL url = new URL("https://www.selenium.dev/");
		driver.navigate().to(url);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}