package com.qa.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public  class CommanClass extends BaseClass
{
	public   LoginPage loginPage;
	public  HomePage homePage;
	

	public  void commanClass() 
	/*{
		
		loginPage=new LoginPage();
		homePage=new  HomePage();
		System.out.println("commmmmm");
		homePage=loginPage.loginCrediantial(prop.getProperty("emailId"), prop.getProperty("password"));	
		System.out.println("new    commmmmm");
	}*/
	{
		loginPage=new LoginPage();
		homePage=new  HomePage();
		try 
     	{ 
     	if(prop.getProperty("emailId").isEmpty() && prop.getProperty("password").isEmpty() )	
     	{
     		System.out.println("Please Enter email id && password");
     	}
     	else {
     		Thread.sleep(2000);
     	
     		homePage=loginPage.loginCrediantial(prop.getProperty("emailId"), prop.getProperty("password"));
     		Thread.sleep(2000);
     	
     	}
     	}
     	catch(Exception e) 
		{
     		System.out.println("Emaild not found: " + e.getMessage());
     	}
		
     	
	}
	
	public  void hoverMethod() 
	{
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,1000)");
		  
	}
	
	public  void hoverFiveHundredMethod() 
	{
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,500)");
		  
	}
	
	public static void sleepTwoSecMethod() throws Exception 
	{
		Thread.sleep(2000);
	}
	
	public static void sleepFiveSecMethod() throws Exception 
	{
		Thread.sleep(5000);
	}
}

     