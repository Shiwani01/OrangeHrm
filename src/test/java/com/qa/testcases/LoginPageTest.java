package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		intialization();
		loginpage = new LoginPage();

	}

	@Test
	public void ValidatetitleTest() {
		String pagetitle = loginpage.validateTitle();
		Assert.assertEquals(pagetitle, "OrangeHRM");
		System.out.println(pagetitle);

	}

	/*
	 * @Test public void ValidatelogoTest() { boolean logo=loginpage.validateLogo();
	 * Assert.assertTrue(logo); }
	 */
	@Test
	public void validateLogin() {
		loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
