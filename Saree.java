package com.craftsvilla.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.craftsvilla.generic.BaseClass;
import com.craftsvilla.generic.WebdriverCommonLib;

public class Saree extends BaseClass {
	//private WebDriver driver;
	
	WebdriverCommonLib wb= new WebdriverCommonLib();
	
	@FindBy(xpath="//a[@ href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	WebElement cursr_saree;
	
	@FindBy(xpath="//a[.='	Silk']")
	WebElement silk;
	
	@FindBy(xpath="//h4[@class='f-heading']")
	private WebElement fltr;
	
	@FindBy(xpath="//span[text()='Price ']")
	private WebElement prce;
	
	@FindBy(xpath="//span[text()='Saree Color']")
	private WebElement sare_col;
	
	
	public void Saree_silk()
	{
		//wb.action(cursr_saree);
		//WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(cursr_saree));
		Actions action=new Actions(driver);
		action.moveToElement(cursr_saree).perform();
   	 
	}
	
	public void slk()
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(silk));
		silk.click();
		
	}

	public String filter()
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(fltr));
		return fltr.getText();
	}
	
	public String price()
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(prce));
		return prce.getText();
		
	}
	
	public String color()
	{
		return sare_col.getText();
	}
}