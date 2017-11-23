package com.craftsvilla.sript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.craftsvilla.POM.Cart_check;
import com.craftsvilla.POM.Saree;
import com.craftsvilla.generic.BaseClass;
import com.craftsvilla.generic.Constants;
import com.craftsvilla.generic.WebdriverCommonLib;

public class Cart_Lane extends BaseClass{
	WebdriverCommonLib wb=new WebdriverCommonLib();
	
	
	
	@Test
	public void caratlane()
	{
		driver.get(Constants.url);
		wb.waitForPageToLoad();
	
    //creating reference variable of cart_ page
    Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
    
    //click on silk inside the craftsbrands
	c.mouse_over_craftsvilla();
	
	//check whether it is click or not
	System.out.println("successfully clikable");
	}
	
	@Test
	public void buttn_add_cart() throws Throwable
	{
		//creating the reference variable for cart_page
		Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		
		//calling the mouse_over_craftsvilla method
		c.mouse_over_craftsvilla();
		
		//maximize the window
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@alt='Craftsvilla Navy Blue Festive Wear Silk Solid Saree With Unstitched Blouse']")).click();
		
		//calling the method for chose the product
		c.choose_prd();
		
		//wait statement
		Thread.sleep(5000);
		
		
		String exp= "ADD TO CART";
		
		//implicit wait
		wb.waitForPageToLoad();
		
		
		//verify whether add to cart is present or not
		if(exp.equals(c.add()))
		{
			System.out.println("add to cart present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	
 @Test
 public void product_chck_cart() throws Throwable
 {
	 
	 //creating the reference variable of cart_page
	 Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
	 
	 //click on silk inside the craftsvills
	 c.mouse_over_craftsvilla();
	 
	 //choose the product by using method
	 c.choose_prd();
	 
	 //wait statement
	 Thread.sleep(4000);
	 
	 //click on cart to cart button
	 c.add_cart_clk();
	 
	 //wait statement
	 Thread.sleep(4000);
	 
	 String exp="My Cart";
	 
	 //verify whether the product is added to cart or not
	 if(exp.equals(c.add_cart()))
		{
			System.out.println("product successfully added to cart");
		}
		else
		{
			System.out.println("product not added to cart");
		}
 }
	 @Test
	 public void cart_msg()
	 {
		 
		 //creting the refernce variable of cart_check
		 Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		 String exp_res="My Cart";
		 
		 //implicit wait
		 wb.waitForPageToLoad();
		 
		 //verify whether cart is displayed or not
		 if(exp_res.equals(c.cart()))
		 {
			 System.out.println("cart is displayed"); 
		 }
		 else
			{
				System.out.println("cart is not displayed");
			}
	 }
 
@Test
public void remove_cart_item() throws Throwable
{
	
	//creating the refernce varibale of cart check
	Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
	
	
	 //click on silk inside the craftsvills
	 c.mouse_over_craftsvilla();
	 
	 //choose the product by using method
	 c.choose_prd();
	 
	 //wait statement
	 Thread.sleep(4000);
	 
	 //click on add to cart button
	 c.add_cart_clk();
	 
	 
	//remove the product
	c.remove();
}

@Test
public void cart_buy() throws Throwable
{	 
	
	//creating the reference variable of cart_check page
		 Cart_check c=PageFactory.initElements(BaseClass.driver, Cart_check.class);
		 
		 //click on silk inside the craftsvilla brand
		 c.mouse_over_craftsvilla();
		 
		 //select the product
		 c.choose_prd();
		 
		 //explicit wait
		 WebDriverWait wait=new WebDriverWait(BaseClass.driver, 20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='addtocart")));
		 
		 //click on add to cart
		 c.add_cart_clk();
		 
		 //implicit wait
		 wb.waitForPageToLoad();
		 
		 //click on cart
		 c.clk_cart();
		 
		 //click on buy now 
		 c.buy_pcart();
		 
		 //click on buy on
		 c.product_buy();
		 

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
	
	System.out.print("hi");
	
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
	if(expct.equals(s.filter()))
	{
		System.out.print("Filter is present");
	}
	else
	{
		System.out.print("Filter is not present");
	}
	
	
	//implicit wait
	wb.waitForPageToLoad();
	String xpct_range="Price";
	
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