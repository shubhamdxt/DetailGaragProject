package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.base.CommanClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	public LoginPage loginPage;
	public HomePage homePage;
	public  CommanClass comman;
	
	public LoginTest() {
		super();
	}

	
	@BeforeMethod()
	public void setUp()
	{
	   initialization();
	   loginPage=new LoginPage();
	   homePage=new HomePage();
	   comman=new CommanClass();
	}
	
	@Test(priority=1)
	public void verfiyLoginLink() throws Exception
	{
		loginPage.clickOnRegisterLink();
		comman.sleepTwoSecMethod();
	}
	@Test(priority=2)
	public void verifyLoginCrediantial() throws Exception 
	{
		loginPage.clickOnRegisterLink();
		comman.sleepTwoSecMethod();
         System.out.println("befor login");
         comman.commanClass();
          comman.sleepTwoSecMethod();
          System.out.println("after login");
          System.out.println("after login");
     	
     /*	try 
     	{ 
     	if(prop.getProperty("emailId").isEmpty() && prop.getProperty("password").isEmpty() )	{
     		System.out.println("Please Enter email id && password");
     	}
     	else {
     		Thread.sleep(2000);
     	
     		homePage=loginPage.loginCrediantial(prop.getProperty("emailId"), prop.getProperty("password"));
     		Thread.sleep(2000);
     	
     	}
     	}
     	catch(Exception e) {
     		System.out.println("Emaild not found: " + e.getMessage());
     	}*/
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
