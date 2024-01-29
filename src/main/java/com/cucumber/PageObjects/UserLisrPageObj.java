package com.cucumber.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLisrPageObj {

	@FindBy(xpath = "//input[@formcontrolname='uname']")
	private WebElement userNameText;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//span[text()=' Sign In ']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[text()='Users']/../../../..")
	private WebElement usermenu;
	
	@FindBy(xpath = "//span[text()='GO']")
	private WebElement GObutton;
	
	public UserLisrPageObj(WebDriver driver)
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
	
	public WebElement getUsermenu() {
		return usermenu;
	}


	public WebElement getGObutton() {
		return GObutton;
	}


	public void setusername(String USERNAME)
	{
		userNameText.sendKeys(USERNAME);
	}
	
	public void setpasword(String PASSWORD)
	{
		passwordText.sendKeys(PASSWORD);
	}
	
	public void clickonloginbutton1() {
		loginButton.click();
	}

	public void clickontheusermenu1()
	{
		usermenu.click();
	}
	
	public void clickontheGObutton1() 
	{
		GObutton.click();
	}
}
