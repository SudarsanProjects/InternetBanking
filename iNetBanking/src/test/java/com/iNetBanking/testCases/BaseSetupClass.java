package com.iNetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.iNetBanking.utilities.ReadConfig;


public class BaseSetupClass {
	
	public static ReadConfig readconfig =new ReadConfig();
	public String baseURL=readconfig.getApplicationUrl();
	public String userName=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromeDriverPath());
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
