package stepDefinations;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	
	
	@Given("User launch browser and open Url {string}")
	public void user_launch_browser_and_open_url(String url) {
	   
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	  
	}

	@When("User enter UserName as {string} and password as {string}")
	public void user_enter_user_name_as_and_password_as(String email, String pass) throws InterruptedException {
		
	    lp.enterUserName(email);
	    Thread.sleep(2000);
	    lp.enterPassword(pass);
	    
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	   lp.clickLogin();
	   
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    System.out.println(expectedTitle);
	    String actualTile = driver.getTitle();
	    System.out.println(actualTile);
	    Assert.assertEquals(actualTile, expectedTitle, "Title does not match");
//	    if (actualTile == expectedTitle) {
//			System.out.println("Test case Pass");
//		}
//	    else {
//			System.out.println("Test case failed");
//		}
	    
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	   
	}
	

}
