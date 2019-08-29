package com.qa.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.base.CommanClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.CartDetailPage;

public class HomeTest extends BaseClass{
	
	public LoginPage loginPage;
	public HomePage  homePage;
	public CartDetailPage cartDetailPage;
	public CommanClass comman;
	public HomeTest() {
		super();
		
	}
      @BeforeMethod
      public void setUP() 
      {
    	  initialization();
    	 loginPage=new LoginPage();
    	 homePage=new HomePage();
    	 cartDetailPage=new CartDetailPage();
    	 comman=new CommanClass();
      }
      
      @Test(priority=1)
      public void verifyProductClick() throws Exception
      {
    	  
    	  loginPage.clickOnRegisterLink();
    	  comman.sleepTwoSecMethod();
    	  comman.commanClass();
    	  comman.sleepTwoSecMethod();
    	  
    	  comman.hoverMethod();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnProduct();
    	  comman.sleepTwoSecMethod();
      }
      
      @Test(priority=2)
      public void verifyCartDetail() throws Exception
      {
    	  
    	  loginPage.clickOnRegisterLink();
    	  comman.sleepTwoSecMethod();
    	  comman.commanClass();
    	  comman.sleepTwoSecMethod();
    	  
    	  comman.hoverMethod();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnProduct();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnCart();
      }
      
      
}
