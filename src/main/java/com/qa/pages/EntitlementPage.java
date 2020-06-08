package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class EntitlementPage extends TestBase {
	
	@FindBy(id="menu_leave_addLeaveEntitlement")
	WebElement addentitlement;
	
	@FindBy(id="menu_leave_viewLeaveEntitlements")
	WebElement empentitlement;
	
	public EntitlementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddEntitlement varifyAddEntitlement() {
		addentitlement.click();
		return new AddEntitlement();
	}
    
	public EmpolyeeEntitlement varifyEmpEntitlement() {
		empentitlement.click();
		return new EmpolyeeEntitlement();
	}
}
