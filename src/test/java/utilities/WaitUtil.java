package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitUtil {
	
	WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement waitForElement(By locator)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public WebElement waitForElement(WebElement element)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
		
	}


}
