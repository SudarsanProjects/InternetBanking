package com.iNetBanking.testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseSetupClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("Url is open");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered password");
		lp.clickSubmit();
		logger.info("clicked on login");
		
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage11"))
	{
		Assert.assertTrue(true);
		logger.info("Login successfully");
	}
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Login Failed");
	}
	}

}
