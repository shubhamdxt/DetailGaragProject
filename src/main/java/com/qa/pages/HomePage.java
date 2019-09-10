package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//a[text()='CHEMICAL GUY']")
	WebElement chemicalProductLink;
	
	@FindBy(xpath="//div[@class='ui-slider-range ui-corner-all ui-widget-header']")
	WebElement sliderForPrice;
	
	@FindBy(xpath="//input[@name='s']")
	WebElement homeSearch;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement submitProduct;
	
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}

	public void clickOnProduct() throws Exception
	{
		
		productLink.click();
		
		
	}
	public void clickOnCart() 
	{
		clickProductCartBtn.click();
		
		
	}
	
	public void clickOnChemicalProduct()
	{
		chemicalProductLink.click();
	}
	
	public void clickOnSliderForProductPriceBy() {
		  Actions SliderAction = new Actions(driver);
		  SliderAction.clickAndHold(sliderForPrice).moveByOffset(5, -5).build().perform();
	//	sliderForPrice.click();
	}
	
	public void homeSearchProduct() {
		
		homeSearch.sendKeys("TetraClean High Foam Car Shampoo Car Washing Liquid");
	}
	
	public void submitProduct() {
		submitProduct.click();
	}
}
