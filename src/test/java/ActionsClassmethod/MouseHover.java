package ActionsClassmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		Action movetoelement=act.moveToElement(element).build();
		movetoelement.perform();
		driver.quit();
	}

}
