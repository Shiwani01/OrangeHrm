package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement submit;
	
	@FindBy(xpath="//img[@class='Submit']")
	WebElement logo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public void validateLogo() {
		logo.isDisplayed();
	}
	
	public HomePage login(String url,String ps) {
		username.sendKeys(url);
		password.sendKeys(ps);
		return new HomePage();
		
	}

	

}
