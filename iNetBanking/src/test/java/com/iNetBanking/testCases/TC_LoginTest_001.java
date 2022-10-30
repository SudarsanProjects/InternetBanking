package com.iNetBanking.testCases;

import org.junit.Assert;
import org.junit.Test;

import com.iNetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseSetupClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		logger.info("Url is open");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered password");
		lp.clickSubmit();
		logger.info("clicked on login");
		
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Login successfully");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("Login Failed");
	}
	}

}
