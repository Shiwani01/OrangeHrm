package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AssignLeavePage;
import com.qa.pages.HomePage;
import com.qa.pages.LeavePage;
import com.qa.pages.LoginPage;

public class AssignLeaveTest extends TestBase {

	AssignLeavePage assignleave;
	LoginPage loginpage;
	HomePage homepage;
	LeavePage leavepage;

	public AssignLeaveTest() {
		super();
	}

	@BeforeMethod

	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		leavepage = homepage.validateassignPage();
		assignleave=leavepage.varifyAssignleave();

	}
    @Test(priority=1)
	public void  varifyEnterName() {
    	String name =assignleave.enterEmpName(prop.getProperty("emp"));
    }
    
    @Test
    public void varifyleaveType() {
     assignleave.enterLeaveType();
    }
}
