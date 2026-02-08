package seleniumWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
	        .withTimeout(Duration.ofSeconds(30))   // maximum wait time
	        .pollingEvery(Duration.ofSeconds(10))  // check interval
	        .ignoring(NoSuchElementException.class); // ignore exception

WebElement elem=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='wPSZBe']")));
	elem.click();
	}

}
