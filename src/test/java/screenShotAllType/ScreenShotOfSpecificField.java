package screenShotAllType;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfSpecificField {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//div[@class='faikzn']"));
		File sourse=element.getScreenshotAs(OutputType.FILE);
		File target=new File("target.SpecificScreenshot.png");
		FileUtils.copyFile(sourse, target);
		driver.quit();

	}

}
