package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEntitlement;
import com.qa.pages.AssignLeavePage;
import com.qa.pages.EmpolyeeEntitlement;
import com.qa.pages.EntitlementPage;
import com.qa.pages.HomePage;
import com.qa.pages.LeaveList;
import com.qa.pages.LeavePage;
import com.qa.pages.LoginPage;

public class EntitlementPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	LeavePage leavepage;
	AssignLeavePage assignpage;
	EntitlementPage entitlement;
	LeaveList leavelist;
	AddEntitlement addemp;
	EmpolyeeEntitlement empEnt;

	public EntitlementPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		intialization();
		loginpage = new LoginPage();
		entitlement = new EntitlementPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		entitlement = leavepage.varifyEntitlement();

	}

	@Test
	public void varifyAddEnt() {
		addemp = entitlement.varifyAddEntitlement();
	}

	@Test
	public void varifyEmpEnt() {
		empEnt = entitlement.varifyEmpEntitlement();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
