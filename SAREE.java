package com.craftsvilla.sript;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.craftsvilla.generic.Constants;
import com.craftsvilla.generic.BaseClass;
import com.craftsvilla.generic.WebdriverCommonLib;
import com.craftsvilla.POM.Cart_check;
import com.craftsvilla.POM.Saree;

public class SAREE extends BaseClass {
	WebdriverCommonLib wb=new WebdriverCommonLib();
	
	@Test(priority=1)
	public void Filter_Saree() throws Throwable
	{
		
		//maximize the windows
		BaseClass.driver.manage().window().maximize();                                    
		
		//creating the reference variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);   
		
		//create the reference variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//implicit wait
		wb.waitForPageToLoad();  
		
		//click on saree module
		s.Saree_silk();
		
		//wait statement
		Thread.sleep(5000);
		
		//click on silk
		s.slk();
		
		Thread.sleep(5000);
		
		//maximize the windows size
		BaseClass.driver.manage().window().maximize();
		
		
		//wait statement
		Thread.sleep(5000);
		
		//click on filter
		s.filter();
		
		String expct="Filter By";
		
		//verify whether the filter options is present or not
		if(expct.equals(s.filter()))
		{
			System.out.print("Filter is present in silk saree");
		}
		else
		{
			System.out.print("Filter is not present in silk saree");
		}
		
	}
	
	
	@Test(priority=2)
	public void Price_Saree() throws Throwable
	{
		
		//creating the reference variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		//creating the reference variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//wait statement
		Thread.sleep(5000);
		
		//click on saree
		s.Saree_silk();
		
		//wait statement
		Thread.sleep(5000);
		
		//click on silk
		s.slk();
		
		
		s.filter();
		
		//wait statement
		Thread.sleep(5000);
		String expct="Filter By";
		
		//verify whether filter option is present or not
		if(expct.equals(s.filter()))
		{
			System.out.print("Filter is present optin");
		}
		else
		{
			System.out.print("Filter is not present opton");
		}
		
		//implicit wait
		wb.waitForPageToLoad();
		String xpct_range="Saree Color";
		
		//verify whether price filter is present or not
		if(xpct_range.equals(s.color()))
		{
			System.out.print("color is present option");

		}
		else
		{
			System.out.print("color is not present option");
		}
	}
	
	
	
	@Test
	public void Price_Saree_searching() throws Throwable
	{
		
		//create the reference variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		//create the reference variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//wait statement
		Thread.sleep(5000);
		
		
		
		//click on saree module
		s.Saree_silk();
		
		//wait statement
		Thread.sleep(5000);
		
		//click on silk
		s.slk();
		s.filter();
		
		//wait statement
		Thread.sleep(5000);
		String expct="Filter By";
		
		//verify whether filter option is present or not
//		if(expct.equals(s.filter()))
//		{
//			System.out.print("Filter is present");
//		}
//		else
//		{
//			System.out.print("Filter is not present");
//		}
		
		
		//implicit wait
		wb.waitForPageToLoad();
		String xpct_range="Price";
		
		Thread.sleep(5000);
		
		//verify whether price filter is present or not
		if(xpct_range.equals(s.price()))
		{
			System.out.print("price is present");

		}
		else
		{
			System.out.print("Price is not present");
		}
	}
	
	
	
	
}