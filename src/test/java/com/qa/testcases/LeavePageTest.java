package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AssignLeavePage;
import com.qa.pages.EntitlementPage;
import com.qa.pages.HomePage;
import com.qa.pages.LeaveList;
import com.qa.pages.LeavePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ReportPage;

public class LeavePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	LeavePage leavepage;
	AssignLeavePage assignpage;
	EntitlementPage entitlement;
	LeaveList leavelist;
	ReportPage report;

	public LeavePageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		leavepage = homepage.validateassignPage();
	}
	
	@Test(priority=1)
	public void varifyAssignPage() {
		assignpage=leavepage.varifyAssignleave();
	}

	@Test(priority=2)
	public void varifyEntitlementPage() {
		entitlement=leavepage.varifyEntitlement();
	}
	
	@Test(priority=3)
	public void varifyLeaveList() {
		leavelist=leavepage.varifyLeaveList();
	}
	
	@Test(priority=4)
	public void varifyReports() {
		report=leavepage.varifyReport();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
