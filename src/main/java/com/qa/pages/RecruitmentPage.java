package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class RecruitmentPage extends TestBase {
	@FindBy(id = "btnAdd")
	WebElement btnadd;

	@FindBy(id = "candidateSearch_jobTitle")
	WebElement jobTitle;

	@FindBy(id = "candidateSearch_jobVacancy")
	WebElement jobVacancy;

	@FindBy(id = "candidateSearch_hiringManager")
	WebElement hiringManager;

	@FindBy(id = "candidateSearch_status")
	WebElement status;

	@FindBy(id = "candidateSearch_candidateName")
	WebElement candidateName;

	@FindBy(id = "candidateSearch_keywords")
	WebElement keywords;

	@FindBy(id = "candidateSearch[dateApplication][from]")
	WebElement fromdate;

	@FindBy(id = "candidateSearch[dateApplication][to]")
	WebElement todate;

	@FindBy(id = "candidateSearch_modeOfApplication")
	WebElement modeOfApplication;

	@FindBy(id = "btnSrch")
	WebElement btnSearch;

	@FindBy(id = "btnRst")
	WebElement btnReSearch;

	public RecruitmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validatejobtitle() {
		jobTitle.click();
		Select s=new Select(jobTitle);
		s.selectByVisibleText("IT Manager");
	}
	
	public void validatejobVacancy() {
		jobVacancy.click();
		Select s=new Select(jobVacancy);
		s.selectByVisibleText("All");
	
	}
	
	public void validatehiringManager() {
		hiringManager.click();
		Select s=new Select(hiringManager);
		s.selectByVisibleText("All");
	
	}
	public void validatestatus() {
		status.click();
		Select s=new Select(status);
		s.selectByVisibleText("Shortlisted");
	
	}
	public void validatePageCreditials(String candidatename,String keyword) {
		
		candidateName.sendKeys(candidatename);
		keywords.sendKeys(keyword);
	}
	
	public AddCandidatePage validateButtonAdd() {
		btnadd.click();
		return new AddCandidatePage();
	}
	
}
