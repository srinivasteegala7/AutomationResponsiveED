package com.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObj {

	@FindBy(xpath = "//input[@formcontrolname='uname']")
	private WebElement userNameText;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//span[text()=' Sign In ']")
	private WebElement loginButton;
	
	public loginPageObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void setusername(String USERNAME)
	{
		userNameText.sendKeys(USERNAME);
	}
	
	public void setpasword(String PASSWORD)
	{
		passwordText.sendKeys(PASSWORD);
	}
	
	public void clickonloginbutton() {
		loginButton.click();
	}

}
