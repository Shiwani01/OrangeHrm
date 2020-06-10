package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AddEmployee extends TestBase {
	
	@FindBy(xpath="//h1[contains(text(),'Add Employee')]")
	WebElement addEmpLabel;
	@FindBy(id = "firstName")
	WebElement firstname;

	@FindBy(id = "middleName")
	WebElement middlename;

	@FindBy(id = "lastName")
	WebElement lastname;

	@FindBy(id = "employeeId")
	WebElement empid;
	
	@FindBy(id="photofile")
	WebElement photofile;
	
	@FindBy(id="btnSave")
	WebElement btnsave;

	
	public AddEmployee() {
		PageFactory.initElements(driver, this);
	}
	
	 public boolean varifyAddEmpText() {
		   return addEmpLabel.isDisplayed();
	   }
	 
	 public void validateEnterDetails(String fname,String mname,String lname,String id) {
		 firstname.sendKeys(fname);
		 middlename.sendKeys(mname);
		 lastname.sendKeys(lname);
		 empid.clear();
		 empid.sendKeys(id);
		 
		 
		 
		 btnsave.click();
	 }
	    
   
}
