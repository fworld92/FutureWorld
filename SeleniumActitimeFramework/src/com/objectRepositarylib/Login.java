package com.objectRepositarylib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.CommonUtils;

public class Login {
	
	
	@FindBy(id="username")
	WebElement usernameEdit;
	
	@FindBy(name="pwd")
	WebElement passwordEdit;
	
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	public void login(String userName, String password) throws Throwable{
		CommonUtils cLib = new CommonUtils();
		Properties pObj = cLib.getPropertiesObj();
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		BaseClass.driver.get(pObj.getProperty("url"));
		usernameEdit.sendKeys(userName);
		passwordEdit.sendKeys(password);
		loginBtn.click();
	}
}
