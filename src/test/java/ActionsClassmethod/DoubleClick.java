package ActionsClassmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//xpath"));
		Actions act=new Actions(driver);
		Action doubleclick=act.doubleClick(element).build();
		doubleclick.perform();
		driver.quit();
		
		

	}

}
