package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	//Object Repository
	@FindBy(id = "welcome")
	WebElement welcomAdmin;

	@FindBy(id = "menu_dashboard_index")
	WebElement dashboard;

	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement assignleave;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminpage;

	@FindBy(id = "menu_leave_Entitlements")
	WebElement entitlement;

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement pimmodule;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String ValidatePageTitle() {
		return driver.getTitle();

	}

	public LeavePage validateassignPage() {
		assignleave.click();
		return new LeavePage();
	}

	public AdminPage varifyAdminPage() {
		adminpage.click();
		return new AdminPage();
	}

	public PimPage varifyPimPage() {
		pimmodule.click();
		return new PimPage();
	}
	
	public RecruitmentPage validateRecruitment() {
		recruitment.click();
		return new RecruitmentPage();
	}

}
