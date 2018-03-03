package com.objectRepositarylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class UserList extends BaseClass {
	@FindBy(xpath="//div[@class='inviteUsersButton beigeButton useNativeActive']")
	WebElement addUsersBtn;
	
	@FindBy(xpath="//div[contains(text(),'Configure new user profile')]")
	WebElement configureNewUserProfileLink;
	
	public void navigateToCofigureNewUserProfile(){
		addUsersBtn.click();
		Actions act=new Actions(driver);
		act.moveToElement(configureNewUserProfileLink).click().perform();
	}
}
