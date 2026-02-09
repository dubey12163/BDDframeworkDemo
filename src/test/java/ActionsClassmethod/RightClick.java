package ActionsClassmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//xpath"));
		Action rightclick=act.contextClick(element).build();
		rightclick.perform();
		driver.quit();
		

	}

}
