package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEmployee;
import com.qa.pages.EmployeeListPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PimPage;

public class EmployeeListTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	PimPage pimpage;
	AddEmployee addEmp;
	EmployeeListPage emplist;
	
	public EmployeeListTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		emplist = new EmployeeListPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		pimpage = homepage.varifyPimPage();
		emplist=pimpage.validateEmpList();
		
	}
	@Test
	public void varifyEmpSearch() throws InterruptedException  {
		emplist.validateEmpsearch("Ross jack Gellar");
	}

}
