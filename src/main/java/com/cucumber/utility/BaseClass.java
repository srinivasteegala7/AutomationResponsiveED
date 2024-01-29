package com.cucumber.utility;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.cucumber.managers.ConfigFileReader;

public class BaseClass{

	public WebDriver driver;
	public ConfigFileReader reader;
	
	public static String randomstring()
	{
		String GenRanString = RandomStringUtils.randomAlphabetic(4);
		return (GenRanString);
	}
	
}
