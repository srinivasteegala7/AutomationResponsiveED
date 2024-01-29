package com.cucumber.stepdefination;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cucumber.PageObjects.UserLisrPageObj;
import com.cucumber.utility.BaseClass;

import io.cucumber.java.en.*;

public class UserListStepDef extends BaseClass{

	public WebDriver driver;
	public UserLisrPageObj up;
//	public loginPageObj lo;
	
	
	
	@Given("User open Chrome Browser")
	public void user_open_chrome_browser() {
		driver = new ChromeDriver();
		   up = new UserLisrPageObj(driver);
//		   lo = new loginPageObj(driver);
	}

	@When("User Enters URL {string}")
	public void user_enters_url(String url) {
		  driver.get(url);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().window().maximize(); 
		   
		    
	}

	@And("User types username as {string} and password as {string}")
	public void user_types_userNAME_as_and_passWORD_as(String Username, String Password) throws Exception {
//		 lo.setusername(Username);
//		  lo.setpasword(Password);
//		Thread.sleep(2000);;
//		lo.clickonloginbutton();
		
		up.setusername(Username);
		up.setpasword(Password);
		Thread.sleep(2000);
		up.clickonloginbutton1();
		Thread.sleep(4000);
		
	}
	@When("User click on the User Menu")
	public void user_click_on_the_user_menu() {
	  up.clickontheusermenu1();
	}

	@Then("User Click on the GOButton")
	public void user_click_on_the_gobutton() throws Exception {
	    up.clickontheGObutton1();
	    Thread.sleep(2000);
	}

	@And("close the browser")
	public void close_the_browser() throws Exception {
		Thread.sleep(4000);
		  driver.quit();
	}
	
}
