package com.qa.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
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
      
/*      @Test(priority=1)
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
      }*/
      
/*      @Test(priority=3)
      public void verifyChemicalproduct() throws Exception
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
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnChemicalProduct();
    	  comman.sleepTwoSecMethod();
    	  
    	 
      }
      */
     
/*      @Test(priority=4)
      public void verifySliderForProductPriceBy() throws Exception
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
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnChemicalProduct();
    	  comman.sleepTwoSecMethod();
    	  comman.hoverFiveHundredMethod();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnSliderForProductPriceBy();
    	  comman.sleepTwoSecMethod();
      }
      */
  /*    @Test(priority=5)
      public void verifyHomeSearchProduct() throws Exception
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
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnChemicalProduct();
    	  comman.sleepTwoSecMethod();
    	  comman.hoverFiveHundredMethod();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnSliderForProductPriceBy();
    	  comman.sleepTwoSecMethod();
    	  homePage.homeSearchProduct();
      }*/
      
      @Test(priority=6)
      public void verifyHomeSubmitProduct() throws Exception
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
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnChemicalProduct();
    	  comman.sleepTwoSecMethod();
    	  comman.hoverFiveHundredMethod();
    	  comman.sleepTwoSecMethod();
    	  homePage.clickOnSliderForProductPriceBy();
    	  comman.sleepTwoSecMethod();
    	  homePage.homeSearchProduct();
    	  comman.sleepTwoSecMethod();
    	  System.out.println("before search the product");
    	  homePage.submitProduct();
    	  System.out.println("after search the product");
    	  comman.sleepTwoSecMethod();
      }
      
}
