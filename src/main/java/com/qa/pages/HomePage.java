package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "welcome")
	WebElement welcomAdmin;

	@FindBy(id = "menu_dashboard_index")
	WebElement dashboard;

	@FindBy(xpath = "//*[@id=\"menu_leave_viewLeaveModule\"]/a/span[2]")
	WebElement assignleave;
	
	@FindBy(xpath="//span[contains(text(),'Admin')]")
	WebElement adminpage;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String ValidatePageTitle() {
		return driver.getTitle();

	}

	public LeavePage validateassignPage() {
		assignleave.click();
		return new LeavePage();
	}
    
	public AdminPage varifyAdminPage() {
		adminpage.click();
		return new AdminPage();
	}
}
