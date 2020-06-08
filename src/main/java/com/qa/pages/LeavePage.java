package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LeavePage extends TestBase {

	@FindBy(id = "menu_leave_assignLeave")
	WebElement assignleave;

	@FindBy(id = "menu_leave_Entitlements")
	WebElement entitlement;

	@FindBy(id = "menu_leave_viewLeaveList")
	WebElement leavelist;

	@FindBy(xpath = "menu_leave_Reports")
	WebElement report;
	
	
	public LeavePage() {
		PageFactory.initElements(driver, this);
	}
	
	public AssignLeavePage varifyAssignleave() {
		assignleave.click();
		return new AssignLeavePage();
	}
    
	public EntitlementPage varifyEntitlement() {
		entitlement.click();
		return new EntitlementPage();
	}
	
	public LeaveList varifyLeaveList() {
		leavelist.click();
		return new LeaveList();
	}
	
    public ReportPage varifyReport() {
    	report.click();
		return new ReportPage();
	}
}
