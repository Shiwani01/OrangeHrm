package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEntitlement;
import com.qa.pages.EntitlementPage;
import com.qa.pages.HomePage;
import com.qa.pages.LeavePage;
import com.qa.pages.LoginPage;

public class AddEntitlementTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	LeavePage leavepage;
	EntitlementPage entitlement;
	AddEntitlement addemp;

	public AddEntitlementTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		//addemp = new AddEntitlement();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		leavepage=homepage.validateassignPage();
		entitlement = leavepage.varifyEntitlement();
		addemp = entitlement.varifyAddEntitlement();
	}
	
	@Test
	public void addEmpEntitlement() {
		
		addemp.addLeaveEnt("Ross Jack Gellar", "123");
		
		addemp.leaveType();
		addemp.period();
	}
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}

}
