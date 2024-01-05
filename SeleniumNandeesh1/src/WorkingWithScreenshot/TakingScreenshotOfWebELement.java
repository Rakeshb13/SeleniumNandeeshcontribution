package WorkingWithScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotOfWebELement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		
		File src =cart.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshots/cart.png");
		FileHandler.copy(src, trg);
		
		driver.close();
		
		
	}

}
