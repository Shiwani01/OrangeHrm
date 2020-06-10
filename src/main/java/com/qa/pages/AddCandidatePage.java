package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AddCandidatePage extends TestBase {

	@FindBy(id = "addCandidate_firstName")
	WebElement firstName;

	@FindBy(id = "addCandidate_middleName")
	WebElement middleName;

	@FindBy(id = "addCandidate_lastName")
	WebElement lastName;

	@FindBy(id = "addCandidate_email")
	WebElement candidateEmail;

	@FindBy(id = "addCandidate_contactNo")
	WebElement contactNo;

	@FindBy(id = "addCandidate_vacancy")
	WebElement vacancy;

	@FindBy(id = "addCandidate_keyWords")
	WebElement keywords;

	@FindBy(id = "addCandidate_comment")
	WebElement Candidatecomment;

	@FindBy(id = "addCandidate_appliedDate")
	WebElement applieddate;

	@FindBy(id = "btnSave")
	WebElement btnsave;

	public AddCandidatePage() {
		PageFactory.initElements(driver, this);
	}

	public void validateCreditials(String fname, String mname, String lname, String email, String num, String keyword,
			String comment) throws InterruptedException {
		firstName.sendKeys(fname);
		middleName.sendKeys(mname);
		lastName.sendKeys(lname);
		candidateEmail.sendKeys(email);
		contactNo.sendKeys(num);
		keywords.sendKeys(keyword);
		Candidatecomment.sendKeys(comment);
		applieddate.clear();
		Thread.sleep(5000);
		applieddate.sendKeys("2020-06-10");
		btnsave.click();

	}
	/*
	 * public void validateJobVacancy() { vacancy.click(); Select s=new
	 * Select(vacancy); s.selectByValue("-- Select --"); btnsave.click(); }
	 */
}
