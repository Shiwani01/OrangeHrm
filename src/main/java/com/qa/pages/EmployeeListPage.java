package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class EmployeeListPage extends TestBase{
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement empname;
	
	@FindBy(id="searchBtn")
	WebElement searchbtn;
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}

	public void validateEmpsearch(String name) throws InterruptedException {
		empname.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		empname.clear();
		empname.sendKeys(name);
		Thread.sleep(5000);
		searchbtn.click();
		
	}
}
