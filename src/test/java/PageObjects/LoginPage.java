package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lDriver;
	public LoginPage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}
	@FindBy(id="Username")
	WebElement email;
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void entrEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	public void entrPass(String passadd)
	{
		pass.clear();
		pass.sendKeys(passadd);
	}
	public void clickSubmit()
	{
		submit.click();
	}
	

}
