package com.craftsvilla.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signin;
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement id;
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement cont;
	
	@FindBy(id="userPassword")
	private WebElement pwd1;
	
	@FindBy(xpath="//span[@class='icon']")
	private WebElement ok;
	
	@FindBy(xpath="//p[text()='Use another account']")
	private WebElement acc;
	
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement usd;
	
	@FindBy(xpath="//span[@class='RveJvd snByac']")
    private WebElement nxt;	
	
	@FindBy(xpath="//input[@id='userPassword']")
	private  WebElement pwd;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nxtbtn; 
	
	@FindBy(id="loginCheck")
	private WebElement login;
	
	public void login(String username, String password) throws Exception
 {
		Thread.sleep(5000);
	 signin.click();
	 Thread.sleep(5000);
	 id.sendKeys(username);
	 cont.click();
	 Thread.sleep(5000);
	 pwd.sendKeys(password);
	 login.click();
	 Thread.sleep(5000);
	 
 }
	

}
