package com.cucumber.stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.PageObjects.CreateUserPageObj;

import io.cucumber.java.en.*;

public class CreateuserStepDef {

	public WebDriver driver;
	public CreateUserPageObj cup;
	
	@Given("User launch Chromebrowser")
	public void user_launch_chromebrowser() {
	    driver = new ChromeDriver();
	    cup = new CreateUserPageObj(driver);
	}

	@When("User Opens URL")
	public void user_opens_url() {
		 driver.get("https://lms-sis-demo.sapphirus.in/login");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().window().maximize();
	}

	@And("User Enter UserName  and PassWord")
	public void user_enter_user_name_and_pass_word() throws Exception {
	    cup.setusername("srinivas.test");
	    cup.setpasword("Welcome1!");
	    Thread.sleep(2000);
	}

	@Then("Click on signin")
	public void click_on_signin() throws Exception {
	  cup.clickonloginbutton();  
	  Thread.sleep(4000);
	  driver.quit();
	}
}
