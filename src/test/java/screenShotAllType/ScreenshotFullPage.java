package screenShotAllType;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotFullPage {
	public static void main(String args[]) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	TakesScreenshot st= (TakesScreenshot)driver;
	File sourse=st.getScreenshotAs(OutputType.FILE);
	File targ=new File("target/Screenshotfullpages.png");
	FileUtils.copyFile(sourse, targ);
	driver.quit();

}
}
