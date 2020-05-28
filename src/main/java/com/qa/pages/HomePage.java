package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="menu_dashboard_index")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contain(text(),'Assign Leave')]")
	
	WebElement assignleave;
	
	@FindBy(xpath="//span[contain(text(),'Leave List')]")
	WebElement leavelist;
	
	

}
