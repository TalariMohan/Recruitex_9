package Page_Elements_Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Data {
	public static WebDriver driver;
	
	@BeforeMethod
	public void Basic_Info() {
		WebDriverManager .chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://recruitex.co.in/Recruitex_Sales/#/login");	
	}
	//@AfterTest
	public void Close1() {
		driver.close();
	}
		
}
