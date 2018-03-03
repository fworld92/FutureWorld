package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common{
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutLink;
	
	public void logout(){
		logoutLink.click();
	}
}

