package com.craftsvilla.generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.craftsvilla.POM.Login;
public class WebdriverCommonLib {
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElemetPresent(WebElement wb){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void select(WebElement selwb, String data){
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}

	public void select(WebElement selwb, int index){
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	
	public void action( WebElement data){
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(data);
	
	}
	public void login_app() throws Exception
	{
		Login loginPage = PageFactory.initElements(BaseClass.driver, Login.class);
		 loginPage.login(Constants.userName, Constants.password);
	}
}
