package ActionsClassmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//xpathsourse"));
		WebElement target= driver.findElement(By.xpath("//xpathtarget"));
		Actions act= new Actions(driver);
		Action draganddrop=act.dragAndDrop(source, target).build();
		draganddrop.perform();
		driver.quit();

	}

}
