package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium browser\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	
	@Test
	public void run()  {
		driver.get("https://www.softwaretestingmaterial.com/");
		
	}
	
	@AfterClass()
		public void afterclass() {
			
		driver.quit();
	}
}
