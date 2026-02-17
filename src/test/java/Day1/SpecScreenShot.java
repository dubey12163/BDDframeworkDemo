package Day1;
import Base.BaseClass;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class SpecScreenShot extends BaseClass {

	public static void main(String[] args) throws IOException {
		SpecScreenShot st=new SpecScreenShot();
		st.setUp();
		WebElement elemt = st.driver.findElement(By.xpath("//input[@name='q']"));
		File sorce =elemt.getScreenshotAs(OutputType.FILE);
		File target=new File("./target/screenshot1.png");
		FileUtils.copyFile(sorce, target);



	}

}
