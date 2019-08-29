package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//a[text()=' Login / Register']")
	WebElement registerLink;
	
	@FindBy(xpath="(//input[@name='email' and @class='inpField'])[1]")
	WebElement emailField;
	
	
	@FindBy(xpath="(//input[@name='password' and @class='inpField'])[1]")
	WebElement passwordField;
	
	@FindBy(xpath="(//button[text()='Login' and @class='subMit'])[1]")
	WebElement submitBTN;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	 
	public void clickOnRegisterLink() 
	   {
		   registerLink.click();
	   }
	
	public HomePage loginCrediantial(String emp, String pass) {
		emailField.clear();
		emailField.sendKeys(emp);
		
		passwordField.clear();
		passwordField.sendKeys(pass);
		
		submitBTN.click();
		return new HomePage();
	}
	   
}
