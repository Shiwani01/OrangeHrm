package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddCandidatePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.RecruitmentPage;

public class AddCandidateTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	RecruitmentPage recruitmentpage;
	AddCandidatePage addcandidate;

	public AddCandidateTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		addcandidate = new AddCandidatePage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		recruitmentpage = homepage.validateRecruitment();
		addcandidate = recruitmentpage.validateButtonAdd();
	}

	@Test(priority = 1)
	public void varifyCreditials() throws InterruptedException {
		addcandidate.validateCreditials("Rachel", "Karen", "Green", "rachel@gmail.com", "1234567890",
				"Java,Sql,Selenium", "Good Candidate");
	}
	/*
	 * @Test(priority=2) public void varifyJobVacancy() {
	 * addcandidate.validateJobVacancy(); }
	 */
}
