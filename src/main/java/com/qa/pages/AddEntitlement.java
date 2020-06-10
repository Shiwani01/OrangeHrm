package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class AddEntitlement extends TestBase {

	@FindBy(id = "entitlements_employee_empName")
	WebElement emp;

	@FindBy(id = "entitlements_leave_type")
	WebElement leavetype;

	@FindBy(id = "period")
	WebElement period;

	@FindBy(id = "entitlements_entitlement")
	WebElement entitlement;

	@FindBy(id = "btnSave")
	WebElement btnsave;
	
	@FindBy(xpath="//input[@class='ac_input inputFormatHint']")
	WebElement clearbox;

	public AddEntitlement() {
		PageFactory.initElements(driver, this);
	}

	public void addLeaveEnt(String name, String title) {
       
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("entitlements_employee_empName")));
        clearbox.click();
     
        emp.sendKeys(name);
		entitlement.sendKeys(title);
		btnsave.click();
	}

	public void leaveType() {
		Select s = new Select(driver.findElement(By.id("entitlements_leave_type")));
		s.selectByVisibleText("Vacation US");
	}

	public void period() {
		Select s1 = new Select(driver.findElement(By.id("period")));
		s1.selectByVisibleText("2015-01-01 - 2015-12-31");
	}
}
