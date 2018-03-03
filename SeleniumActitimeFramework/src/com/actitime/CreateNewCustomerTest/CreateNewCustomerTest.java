package com.actitime.CreateNewCustomerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.CommonUtils;
import com.objectRepositarylib.Home;
import com.objectRepositarylib.NewCustomer;
import com.objectRepositarylib.Tasks;

@Listeners(com.actitime.genericlib.SampleListener.class)

public class CreateNewCustomerTest extends BaseClass{
	
	

	@Test
	public void createCustomerWithDespTest() throws Throwable{
		CommonUtils cip=new CommonUtils();
		String customerName=cip.getExcelData("Sheet1", 2, 2);
		String customerDesp=cip.getExcelData("Sheet1", 2, 3);
		
		Home hm=PageFactory.initElements(driver, Home.class);
		hm.navigateToTaskPage();
		
		Tasks tk=PageFactory.initElements(driver, Tasks.class);
		tk.navigateToCreateCustomer();
		
		NewCustomer nc=PageFactory.initElements(driver, NewCustomer.class);
		nc.createCustomer(customerName, customerDesp);
	}
	
	@Test
	public void createCustomerTest() throws Throwable{
		CommonUtils cip=new CommonUtils();
		String customerName=cip.getExcelData("Sheet1", 2, 2);
		Home hm=PageFactory.initElements(driver, Home.class);
		hm.navigateToTaskPage();
		
		Tasks tk=PageFactory.initElements(driver, Tasks.class);
		tk.navigateToCreateCustomer();
		
		NewCustomer nc=PageFactory.initElements(driver, NewCustomer.class);
		nc.createCustomer(customerName);
	}
	

}
