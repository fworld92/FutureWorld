package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class Home extends BaseClass{
	@FindBy(xpath="//div[text()='TASKS']/../..")
	WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USERS']/../..")
	WebElement userImg;
	
	public void navigateToTaskPage(){
		taskImg.click();
	}
	
	public void navigateToUserPage(){
		userImg.click();
	}
	

}
