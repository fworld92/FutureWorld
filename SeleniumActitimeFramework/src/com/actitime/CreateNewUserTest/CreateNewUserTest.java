package com.actitime.CreateNewUserTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.CommonUtils;
import com.objectRepositarylib.AddUser;
import com.objectRepositarylib.Home;
import com.objectRepositarylib.UserList;

@Listeners(com.actitime.genericlib.SampleListener.class)
public class CreateNewUserTest extends BaseClass{
	CommonUtils cu=new CommonUtils();
	
	@Test
	public void createNewUserTest() throws Throwable{
		String firstName=cu.getExcelData("Sheet1", 3, 2);
		String lastName=cu.getExcelData("Sheet1", 3, 3);
		String emailId=cu.getExcelData("Sheet1", 3, 4);
		Home hm=PageFactory.initElements(driver, Home.class);
		hm.navigateToUserPage();
		
		UserList ul=PageFactory.initElements(driver, UserList.class);
		ul.navigateToCofigureNewUserProfile();
		
		AddUser au=PageFactory.initElements(driver, AddUser.class);
		au.createUse(firstName, lastName, emailId);
		
		au.closeBtn();
		
	}
			

}
