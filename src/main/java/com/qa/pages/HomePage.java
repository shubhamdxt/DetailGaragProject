package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass{
	
	//@FindBy(linkText="(//img[@class='img-fluid'])[8]")
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement productLink;
	
	//@FindBy(By.id("cartcount"))
	@FindBy(id="cartcount")
	WebElement clickProductCartBtn;
	
	
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}

	public void clickOnProduct() throws Exception
	{
		
		productLink.click();
		
		
	}
	public CartDetailPage clickOnCart() 
	{
		clickProductCartBtn.click();
		
		return new CartDetailPage();
	}
	
	
}
