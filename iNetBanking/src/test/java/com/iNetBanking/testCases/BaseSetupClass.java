package com.iNetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.iNetBanking.utilities.ReadConfig;


public class BaseSetupClass {
	
	public static ReadConfig readconfig =new ReadConfig();
	public static String baseURL=readconfig.getApplicationUrl();
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
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	 
	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("Screenshorts/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public  String randomString()
	{
		String randomString=RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}
	public  String randomNumber()
	{
		String randomNumber=RandomStringUtils.randomNumeric(5);
		return randomNumber;
	}
}
