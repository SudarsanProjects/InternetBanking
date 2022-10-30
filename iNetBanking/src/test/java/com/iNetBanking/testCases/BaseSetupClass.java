package com.iNetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseSetupClass {
	
	public String baseURL="https://demo.guru99.com/v4/";
	public String userName="mngr451140";
	public String password="azepYdy";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 logger= Logger.getLogger("iNetBanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	 
	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}

}
