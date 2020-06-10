package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class PimPage extends TestBase {

	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmp;

	@FindBy(id = "menu_pim_viewEmployeeList")
	WebElement emplist;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

	public AddEmployee validateAddEmp() {
		addEmp.click();
		return new AddEmployee();
	}
	
	public EmployeeListPage validateEmpList() {
		emplist.click();
		return new EmployeeListPage();
	}

}
