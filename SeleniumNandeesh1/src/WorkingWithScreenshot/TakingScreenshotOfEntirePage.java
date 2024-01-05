package WorkingWithScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotOfEntirePage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
	
		//Type casting
		TakesScreenshot ts = (TakesScreenshot)driver;		
		//To take screen shot
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Target folder
		File trg = new File("./Screenshots/amazon.png");
		//To copy from source to target
		FileHandler.copy(src, trg);
		
		driver.close();
		
		
		
		
		

	}

}
