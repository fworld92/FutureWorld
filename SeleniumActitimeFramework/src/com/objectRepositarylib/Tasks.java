package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class Tasks extends BaseClass{
	@FindBy(xpath="//div[text()='Add New']")
	WebElement newTaskBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	WebElement newCustomerLink;
	
	public void navigateToCreateCustomer(){
		newTaskBtn.click();
		Actions act=new Actions(driver);
		act.moveToElement(newCustomerLink).click().perform();
	}

}
