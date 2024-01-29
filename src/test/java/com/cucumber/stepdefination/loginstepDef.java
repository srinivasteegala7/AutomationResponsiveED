package com.cucumber.stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.PageObjects.loginPageObj;

import io.cucumber.java.en.*;

public class loginstepDef {

	public WebDriver driver;
	public loginPageObj lo;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chrome.exe");
		driver = new ChromeDriver();
	   lo = new loginPageObj(driver);
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	}

	@And("User Enter UserName as {string} and PassWord as {string}")
	public void user_enter_user_name_as_and_pass_word_as(String username, String password) {
	  lo.setusername(username);
	  lo.setpasword(password);
	}

	@Then("Click on login")
	public void click_on_login() throws Exception {
	    lo.clickonloginbutton();
	    Thread.sleep(4000);
		  driver.quit();
	}
}
