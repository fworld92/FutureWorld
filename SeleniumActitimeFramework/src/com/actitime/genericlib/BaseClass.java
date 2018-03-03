package com.actitime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.objectRepositarylib.Common;
import com.objectRepositarylib.Login;

public class BaseClass {
	public static WebDriver driver;
	
	
	@BeforeClass
	public void configBC() throws Throwable{
		CommonUtils clib=new CommonUtils();
		Properties pObj=clib.getPropertiesObj();
		String baseBrowser=pObj.getProperty("browser");
		
		if(baseBrowser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(baseBrowser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./resource\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	
		
	}
	
	@BeforeMethod
	public void configBM() throws Throwable{
		CommonUtils clib=new CommonUtils();
		Properties pObj = clib.getPropertiesObj();
		
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.login(pObj.getProperty("userName"), pObj.getProperty("password"));
		
	}
	
	@AfterMethod
	public void configAM(){
		Common cm=PageFactory.initElements(driver, Common.class);
		cm.logout();
	}
	
	@AfterClass
	public void conficAC(){
		driver.close();
	}
	

}
