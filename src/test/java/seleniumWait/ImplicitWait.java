package seleniumWait;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.quit();

	}

}
