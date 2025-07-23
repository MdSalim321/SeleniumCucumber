package stepDefinations;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	public void openBrowser()
	{
		super.openBrowser();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		driver.quit();
	}
	

		

}
