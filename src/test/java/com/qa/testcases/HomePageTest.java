package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AdminPage;
import com.qa.pages.HomePage;
import com.qa.pages.LeavePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	LeavePage leavepage;
	AdminPage adminpage;

	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void SetUp() {
		intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
	}

	@Test
	public void varifyHomePageTitleTest() {
		String homepagetitle = homepage.ValidatePageTitle();
		Assert.assertEquals(homepagetitle, "OrangeHRM", "HomePage Title is not matched");

	}

	@Test
	public void verifyLeavePage() {
		leavepage = homepage.validateassignPage();

	}

	@Test
	public void varifyAdmin() {
		adminpage = homepage.varifyAdminPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
