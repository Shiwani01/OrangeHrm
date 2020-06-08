package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class AssignLeavePage extends TestBase {

	@FindBy(id = "assignleave_txtEmployee_empName")
	WebElement empname;

	@FindBy(id = "assignleave_txtLeaveType")
	WebElement leavetype;

	@FindBy(id = "assignleave_txtFromDate")
	WebElement fromdate;

	@FindBy(id = "assignleave_txtToDate")
	WebElement todate;

	public AssignLeavePage() {
		PageFactory.initElements(driver, this);
	}

	public String enterEmpName(String name) {
		empname.sendKeys(prop.getProperty("emp"));
		return name;

	}
	
	public void enterLeaveType() {
		Select s=new Select(leavetype.findElement(By.id("assignleave_txtLeaveType")));
		s.selectByVisibleText("Vacation US");
	}

}
