Feature: Testing the Login functionality
	

Scenario: Successful login with valid Credential

		Given User launch browser and open Url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		When User enter UserName as "Admin" and password as "admin123"
		And Click on the Login button
		Then Page title should be "OrangeHRM"
		And Close the browser
		
		
		
Scenario Outline: Data Driven testing

		Given User launch browser and open Url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		When User enter UserName as "<username>" and password as "<password>"
		And Click on the Login button
		Then Page title should be "OrangeHRM"
		And Close the browser
		
		Examples: 
					
							| username | password |
							| Admin | admin123 |
							
							


		
		