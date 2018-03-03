package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.CommonUtils;

public class NewCustomer{
	@FindBy(id="customerLightBox_nameField")
	WebElement customerNameEdit;
	
	@FindBy(id="customerLightBox_descriptionField")
	WebElement customerDespEdit;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	WebElement createCustomerBtn;
	
	public void createCustomer (String customerName) throws Throwable{
		customerNameEdit.sendKeys(customerName);
		createCustomerBtn.click();
	
	}
	
	public void createCustomer(String customerName, String customerDesp) throws Throwable{
		customerNameEdit.sendKeys(customerName);
		customerDespEdit.sendKeys(customerDesp);
		createCustomerBtn.click();
		
	}
}
