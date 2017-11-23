package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.craftsvilla.POM.Login;

//import com.craftsvilla.ObjectRepository.Common;
//import com.craftsvilla.ObjectRepository.Login;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void configBc(){
		 //launch Browser
		if(Constants.browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
			driver=new ChromeDriver();
			}
		else if(Constants.browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "./resource/IEDriverServer");
		driver = new InternetExplorerDriver();
		}
			else{
			driver = new FirefoxDriver();
		}
		
		driver.get(Constants.url);
	  
	}

	
//@BeforeMethod
//public void configBm() throws Exception{
//WebdriverCommonLib wb=new WebdriverCommonLib();
//wb.login_app();
//}
}
  
	
//	@AfterClass
//	public void configAc(){
//		driver.close();
//	}
//}
