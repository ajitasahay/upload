package com.craftsvilla.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.craftsvilla.generic.WebdriverCommonLib;

public class Shipping {

	//create reference variable
	WebdriverCommonLib wb= new WebdriverCommonLib();
	
	//product buy now
	@FindBy(xpath="//button[@id='buynow']")
	private WebElement btn_buynow;
	
	
	//shiping details
	@FindBy(xpath="//h3[@class='pure-u-12-24 address-form-title']")
	private WebElement shpng_detls;
	
	
	//email_shipping
	@FindBy(xpath="//input[@id='address-email']")
	WebElement mail;
	
	//firstname
	@FindBy(xpath="//input[@id='address-first-name']")
	private WebElement fn;
	
	//lastname
	@FindBy(xpath="//input[@id='address-last-name']")
	private WebElement lname;
	
	//pin code
	@FindBy(xpath="//input[@id='address-pincode']")
	private WebElement code;
	
	//address
	@FindBy(xpath="//input[@id='address-textbox']")
	private WebElement addrss;
	
	//mobile
	@FindBy(xpath="//input[@id='address-mobileno']")
	private WebElement mob;
	
	//click deliver
	@FindBy(xpath="//input[@id='address-form-submit']")
	private WebElement delvr;
	
	//paymt 
	@FindBy(xpath="//button[@class='pure-button payment-submit-button js-payment-submit-btn']")
	private WebElement payment;
	
	//cod meaasge 
	@FindBy(xpath="//p[contains(text(),'Please pay a total amount of')]")
	private WebElement cod_msg;
	
	//method for click buy now
	public void buy_now()
	{
		btn_buynow.click();
	}
	
	
	
	
	//method for chech shippping details page is displayed
	public String shipping_detls()
	{
		return shpng_detls.getText();
		
	}
	//click on shipping
	public void shipping()
	{
		shpng_detls.click();
	}
	
	//fill the shipping detials
	public void details() throws Throwable
	{
		mail.sendKeys("ajitasahay@gmail.com");
		fn.sendKeys("AJITA");
		lname.sendKeys("SAHAY");
		code.sendKeys("560037");
		Thread.sleep(10000);
		addrss.sendKeys("bangalore,marathahalli bridge,near kalamandir");
		mob.sendKeys("9608137448");
		
	}
	
	//click on deliver to this address
	public void deliver()
	{
		delvr.click();
	}
	
	//payment
	

	public int bill() {
		// TODO Auto-generated method stub
		payment.isEnabled();
		return 0;
		
	}
	
	public void pay()
	{
		payment.click();
	}
	
	public boolean cash_on_del()
	{
		return cod_msg.isDisplayed();
	}
}
