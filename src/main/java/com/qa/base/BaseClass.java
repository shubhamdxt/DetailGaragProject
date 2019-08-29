package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.TestUtil;
import com.qa.util.WebEventListener;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public BaseClass() {
		try 
		{
		 prop=new Properties();
		 FileInputStream fileInputStrem = new FileInputStream("G:\\New folder\\DetailGarageProject\\src\\main\\java\\com\\qa\\config\\config.property");
		 prop.load(fileInputStrem);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "G:\\New folder\\DetailGarageProject\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			e_driver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
			
			driver.get(prop.getProperty("url"));
			
		}
	}

}
