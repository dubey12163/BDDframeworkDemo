package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected WebDriver driver;
	public void setUp() {
	
	 driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	}
	public void teardown() {
		
		driver.quit();
	}
}