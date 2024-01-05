package WorkingWithWebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToURl {

	public static void main(String[] args) {
		
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		//To navigate to URL
		driver.get("https://www.google.co.in/webhp");
		//To fetch the title of Web Page
		String title=driver.getTitle();
		System.out.println(title);
		//To fetcht the URL of Web Page
		System.out.println(driver.getCurrentUrl());

	}

}
