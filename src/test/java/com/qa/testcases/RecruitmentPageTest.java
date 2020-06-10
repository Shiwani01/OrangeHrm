package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddCandidatePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.RecruitmentPage;

public class RecruitmentPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	RecruitmentPage recruitmentpage;
	AddCandidatePage addcandidate;

	public RecruitmentPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		recruitmentpage = new RecruitmentPage();
		homepage = loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		recruitmentpage = homepage.validateRecruitment();
	}

	@Test(priority = 1)
	public void varifyjobTitle() {
		recruitmentpage.validatejobtitle();

	}

	@Test(priority = 2)
	public void varifyjobVacancy() {
		recruitmentpage.validatejobVacancy();
	}

	@Test(priority = 3)
	public void varifyHiringManager() {
		recruitmentpage.validatehiringManager();
	}

	@Test(priority = 4)
	public void varifyStatus() {
		recruitmentpage.validatestatus();
	}
    
	@Test(priority = 5)
	public void varifyCandidateCreaditials() {
		recruitmentpage.validatePageCreditials("Monica jack Gellar", "Java,SQL");
	}

	@Test(priority = 6)
	public void varifyAddCandidate() {
		addcandidate = recruitmentpage.validateButtonAdd();
	}
}
