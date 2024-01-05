package DemoWebShopTestCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_Register {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataUtility data_Utility = new DataUtility();
		//UserName = Testengg111@gmial.com
		//password = Engg@123
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("URL"));
		
		driver.findElement(By.partialLinkText("Regis")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys(data_Utility.getDataFromExcel("Sheet1", 0, 0));
		driver.findElement(By.name("LastName")).sendKeys(data_Utility.getDataFromExcel("Sheet1", 1, 0));
		driver.findElement(By.name("Email")).sendKeys(data_Utility.getDataFromExcel("Sheet1", 2, 0));
		driver.findElement(By.name("Password")).sendKeys(data_Utility.getDataFromExcel("Sheet1", 3, 0));
		driver.findElement(By.name("ConfirmPassword")).sendKeys(data_Utility.getDataFromExcel("Sheet1", 3, 0));
		driver.findElement(By.name("register-button")).click();
		
		String expText=driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		if(expText.equals(data_Utility.getDataFromExcel("Sheet1", 4, 0)))
		{
			System.out.println("Register Test Case Pass");
		}
		else
			System.out.println("Register Test Case Fail");
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
	}
}