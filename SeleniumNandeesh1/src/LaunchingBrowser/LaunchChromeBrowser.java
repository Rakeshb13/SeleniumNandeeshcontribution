package LaunchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		//Key to launch the crome browser
		String key="webdriver.chrome.driver";
		//Path
		String path = "./Drivers/chromedriver.exe";
		System.setProperty(key, path);
		//To launch the Chrome browser
	//	ChromeDriver driver = new ChromeDriver ();
		WebDriver driver=new ChromeDriver();
		
		
		
		

	}

}
