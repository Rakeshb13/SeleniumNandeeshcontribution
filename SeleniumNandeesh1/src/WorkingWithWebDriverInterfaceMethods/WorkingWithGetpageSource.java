package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetpageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
	}

}
