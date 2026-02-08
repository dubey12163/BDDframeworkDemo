package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='wPSZBe']")));
	element.click();
	driver.quit();
	
	
	

	}

}
