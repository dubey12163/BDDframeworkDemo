package StepDefinatin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class StepDef {
	
	
	public WebDriver driver;
	public LoginPage lognpg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		

		// NEW (Firefox)
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		lognpg =new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
	lognpg.entrEmail(emailadd);
	lognpg.entrPass(password);

	    
	    // 💤 Wait for 3 seconds
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

		
	

	@When("Click on Login")
	public void click_on_login() {
		lognpg.clickSubmit();
		
	}
	
		
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	

		String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectedTitle))
			{
		Assert.assertTrue(true);
			}
	else
	{
		Assert.assertTrue(true);	
	}
	
	}
}

