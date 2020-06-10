package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEmployee;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PimPage;

public class AddEmployeeTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	PimPage pimpage;
	AddEmployee addEmp;

	public AddEmployeeTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		addEmp = new AddEmployee();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		pimpage = homepage.varifyPimPage();
		addEmp = pimpage.validateAddEmp();

	}

	@Test(priority = 1)
	public void validateTitle() {
		Assert.assertTrue(addEmp.varifyAddEmpText(), "AddEmployee Display");

	}

	@Test(priority = 2)
	public void validateCreditionals() {
		addEmp.validateEnterDetails("Ross", "Jack", "Gellar", "0012");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
