package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEmployee;
import com.qa.pages.EmployeeListPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PimPage;

public class PIMPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	PimPage pimpage;
	AddEmployee addEmp;
	EmployeeListPage emplist;

	public PIMPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		pimpage = new PimPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		pimpage = homepage.varifyPimPage();
	}

	@Test
	public void validateAddEmp() {
		addEmp = pimpage.validateAddEmp();
	}
	
	@Test
	public void validateEmpList() {
		emplist=pimpage.validateEmpList();
	}
}
