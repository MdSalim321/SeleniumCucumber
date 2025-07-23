package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtil;

public class LoginDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver	=new ChromeDriver();
		WaitUtil waitUntill = new WaitUtil(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		 By userNameLocator = By.xpath("//input[@name='username']");
	     By passwordLocator = By.xpath("//input[@name='password']");
	     By loginLocator = By.xpath("//button[@type='submit']");
		

		WebElement userNameField = waitUntill.waitForElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = waitUntill.waitForElement(passwordLocator);
        WebElement loginField = waitUntill.waitForElement(loginLocator);
		
        userNameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginField.click();
	}

}
