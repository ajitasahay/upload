package com.craftsvilla.sript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.craftsvilla.POM.Cart_check;
import com.craftsvilla.POM.Saree;
import com.craftsvilla.POM.Shipping;
import com.craftsvilla.generic.BaseClass;
import com.craftsvilla.generic.WebdriverCommonLib;

public class Shipping_Product extends BaseClass {
	
	WebdriverCommonLib wb=new WebdriverCommonLib();
	
	@Test
	public void shipping_pro_details() throws Throwable
	{
	//create refernce variable of cart_check page
	Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
	
	
	//create refernce variable of saree page
	Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
	
	//creating refernce variable of shipping page
	Shipping p=PageFactory.initElements(BaseClass.driver, Shipping.class);
	Thread.sleep(5000);
	
	//move cursor to craftbrand and click on silk sarees
	s.Saree_silk();
	Thread.sleep(5000);
	s.slk();
	BaseClass.driver.manage().window().maximize();
	
	//choose one product
     Thread.sleep(5000);	
	c.choose_prd();
	
	//click on buy now
	Thread.sleep(5000);
	p.buy_now();
	
	//check shipping page is displayed or not
	String expct="Shipping Details ";
	if(expct.equals(p.shipping_detls()))
	{
		System.out.println("Shipping details page is displayed");
	}
	else
	{
		System.out.println("Shipping details page is not displayed");
	}
	
}
	@Test
	public void shipping_details() throws Throwable
	{
		//create refernce variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		
		//create refernce variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//creating refernce variable of shipping page
		Shipping p=PageFactory.initElements(BaseClass.driver, Shipping.class);
		Thread.sleep(5000);
		//move cursor to craftbrand and click on silk sarees
		s.Saree_silk();
		
		Thread.sleep(5000);
		s.slk();
		BaseClass.driver.manage().window().maximize();
		System.out.println("c");
		//choose one product
	     Thread.sleep(5000);	
		c.choose_prd();
		
		//click on buy now
		Thread.sleep(5000);
		p.buy_now();
		
		//fill details
		p.details();
		
		//click to deliver to this address
		p.deliver();
		
	 //payment
		if(p.bill()==0)
		{
			System.out.println("payment is enabled");
		}
		else
		{
			System.out.println("payment is not enabled");
		}
		
		
		
		
	}
	
	@Test
	public void payment_details() throws Throwable
	{
		//create refernce variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		
		//create refernce variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//creating refernce variable of shipping page
		Shipping p=PageFactory.initElements(BaseClass.driver, Shipping.class);
		Thread.sleep(5000);
		//move cursor to craftbrand and click on silk sarees
		s.Saree_silk();
		
		Thread.sleep(5000);
		s.slk();
		BaseClass.driver.manage().window().maximize();
		System.out.println("c");
		//choose one product
	     Thread.sleep(5000);	
		c.choose_prd();
		
		//click on buy now
		Thread.sleep(5000);
		p.buy_now();
		
		//fill details
		p.details();
		
		//click to deliver to this address
		p.deliver();
		
	 //payment
		p.pay();
		
		
	}
	
	
	
	
	
	@Test
	public void Cod_meaasge() throws Throwable
	{
		//create refernce variable of cart_check page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		
		//create refernce variable of saree page
		Saree s=PageFactory.initElements(BaseClass.driver, Saree.class);
		
		//creating refernce variable of shipping page
		Shipping p=PageFactory.initElements(BaseClass.driver, Shipping.class);
		Thread.sleep(5000);
		//move cursor to craftbrand and click on silk sarees
		s.Saree_silk();
		
		Thread.sleep(5000);
		s.slk();
		BaseClass.driver.manage().window().maximize();
		System.out.println("c");
		//choose one product
	     Thread.sleep(5000);	
		c.choose_prd();
		
		//click on buy now
		Thread.sleep(5000);
		p.buy_now();
		
		//fill details
		p.details();
		
		//click to deliver to this address
		p.deliver();
		
	 //payment
		p.pay();
		
		if(p.cash_on_del()==true)
		{
			System.out.println("COD ");
		}
		else
		{
			System.out.println("cod is not chosssen");
		}
		
		
	}
	
}
