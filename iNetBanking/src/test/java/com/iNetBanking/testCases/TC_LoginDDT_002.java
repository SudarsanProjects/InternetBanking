package com.iNetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iNetBanking.pageObject.LoginPage;
import com.iNetBanking.utilities.XLUtils;


public class TC_LoginDDT_002 extends BaseSetupClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("username provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		logger.info("user clicked on login");
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("wrong username or password entered");
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("Login successful");
		}
		
	}
	
	public boolean isAlertPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		}
		catch (NoAlertPresentException e){
			return false;
			
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
	
		String sheetdir=System.getProperty("user.dir")+ "/src/test/java/com/iNetBanking/testData/LoginData.xlsx";
		int rowcount=XLUtils.getRowCount(sheetdir, "Sheet1");
		int colcount=XLUtils.getCellCount(sheetdir, "Sheet1", 1);
		String logindata[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for (int j = 0; j < colcount; j++) {
				logindata[i-1][j]=XLUtils.getCellData(sheetdir, "Steet1", i, j);
				
			}
		}
		return logindata;
	}
	
}

