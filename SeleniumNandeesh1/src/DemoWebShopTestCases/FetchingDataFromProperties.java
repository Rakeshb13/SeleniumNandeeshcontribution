package DemoWebShopTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumNandeesh\\test.properties");
		Properties pob = new Properties();
		pob.load(fis);
		System.out.println(pob.getProperty("URL"));
		System.out.println(pob.getProperty("email"));
		System.out.println(pob.getProperty("pwd"));
		
		
	}

}
