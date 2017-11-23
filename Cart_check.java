package com.craftsvilla.POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.craftsvilla.generic.BaseClass;
import com.craftsvilla.generic.WebdriverCommonLib;



public class Cart_check extends BaseClass{
	WebdriverCommonLib wb= new WebdriverCommonLib();
	//private WebDriver driver;
	
     @FindBy(xpath="//a[@href='/cvfeeds/craftsvilla-brands']")
     private WebElement craftband;
     
     
    @FindBy(xpath="//a[text()='Craftsvilla Silk Sarees']")
     private WebElement silk;
     
    @FindBy(xpath="//button[@id='addtocart']")
    private WebElement addcart;
    
    @FindBy(xpath="//b[text()='My Cart']")
    private WebElement cart_msg;
    
    @FindBy(xpath="//div[@id='listProducts']/div[1]/div/div[1]/a/img")
    private WebElement slct_one_prdct;
    
    @FindBy(xpath="//span[@class='hidden-xs']")
    private WebElement CArt;
    
    @FindBy(xpath="//span[@ id='open-remove-item-modal' and @data-product-id='5972760']")
    private WebElement bttnrmv;
    
    
    @FindBy(xpath="//button[@ id='remove-item-btn']")
    private WebElement rmv;
    
    @FindBy(xpath="//div[@id='cart-page-order-items']/div[1]/div[1]/a")
    private WebElement cart_prt;
    
    @FindBy(xpath="//button[@id='buynow']")
    private WebElement pro_buy;
    
    public void mouse_over_craftsvilla()
	{   
    	
    	Actions action=new Actions(driver);
		action.moveToElement(craftband).perform();

    	 
		
	}
    
    
    
    public String add()
    {
      String actual=addcart.getText();
	return actual;	
    }
    
    public void web()
    {
    	addcart.click();
    }

	public String add_cart() {
		addcart.click();
    	String actual_add=cart_msg.getText();
		return actual_add;
	}
	
	
	
	public void choose_prd()
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(slct_one_prdct));
		slct_one_prdct.click();
	}
	

	public String cart() {
		// TODO Auto-generated method stub
		CArt.click();
		String actual_msgg=cart_msg.getText();
		return actual_msgg;
	}
	
	public void remove()
	{
		bttnrmv.click();
		rmv.click();
	}
	public void clk_cart()
	{
		CArt.click();
	}
	public void add_cart_clk()
	{
		addcart.click();
	}
	public void buy_pcart()
	{
		cart_prt.click();
	}
	
	public void product_buy()
	{
		pro_buy.click();
	}
	public void wt()
	{
		WebElement t=addcart;
	}

	public void craft_silk() {
		silk.click();
		// TODO Auto-generated method stub
		
	}
}
