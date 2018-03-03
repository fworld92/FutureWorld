package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {
	@FindBy(id="userDataLightBox_firstNameField")
	WebElement firstNameEdit;
	
	@FindBy(id="userDataLightBox_lastNameField")
	WebElement lastNameEdit;
	
	@FindBy(id="userDataLightBox_emailField")
	WebElement emailEdit;
	
	@FindBy(xpath="//span[text()='Save & Send Invitation']")
	WebElement saveAndSendBtn;
	
	@FindBy(xpath="//span[contains(text(),'Invite one more user')]/../../div[5]/span")
	WebElement closeBtn;
	
	public void createUse(String firstName,String lastName, String emailId){
		firstNameEdit.sendKeys(firstName);
		lastNameEdit.sendKeys(lastName);
		emailEdit.sendKeys(emailId);
		saveAndSendBtn.click();
		
	}
	
	public void closeBtn() throws Throwable{
		closeBtn.click();
		Thread.sleep(3000);
	}
	
	

}
