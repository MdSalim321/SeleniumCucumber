package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public WebDriver rdriver;
	
	public LoginPage(WebDriver driver)
	{
		this.rdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@name='username']")
	@CacheLookup
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	private WebElement LoginButton;
	
	// Method for Each acation
	
	public void enterUserName(String uname)
	{
		UserName.sendKeys(uname);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		LoginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
