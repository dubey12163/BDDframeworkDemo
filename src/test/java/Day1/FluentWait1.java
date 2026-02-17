package Day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Wait<WebDriver> mywait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement element=
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//")));
				

	}

}
