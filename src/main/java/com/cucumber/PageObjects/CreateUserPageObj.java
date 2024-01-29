package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;

public class CreateUserPageObj {

	WebDriver driver;
	
	By username = By.xpath("//input[@formcontrolname='uname']");
	By password = By.xpath("//input[@formcontrolname='password']");
	By loginbtn = By.xpath("//span[text()=' Sign In ']");
	
	public CreateUserPageObj(WebDriver driver)
	{
//		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void setusername(String USERNAME)
	{
		driver.findElement(username).sendKeys(USERNAME);
	}
	
	public void setpasword(String PASSWORD)
	{
		driver.findElement(password).sendKeys(PASSWORD);
	}
	
	public void clickonloginbutton() throws Exception {
		driver.findElement(loginbtn).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
