package Day1;
import Base.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenShot extends BaseClass {

	public static void main(String[] args) throws IOException {


FullPageScreenShot fst=new FullPageScreenShot();
fst.setUp();
TakesScreenshot st=(TakesScreenshot)fst.driver;
File source=st.getScreenshotAs(OutputType.FILE);
File target=new File("./target/screnShot6.png");
FileUtils.copyFile(source, target);
fst.driver.quit();

	}



}
