package com.iNetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iNetBanking.pageObject.AddCustomerPage;
import com.iNetBanking.pageObject.LoginPage;

public class TC_AddCustomer_003 extends BaseSetupClass {
	
	LoginPage lp=new LoginPage(driver);
	private String custID;
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addCustomer=new AddCustomerPage(driver);
		logger.info("Login Successful!!");
		logger.info("Providing new Cutromer Details....");
		addCustomer.addCustmerLink();
		addCustomer.customerName("Sudarsan Puhan");
		addCustomer.customerGender("male");
		addCustomer.customerDateOfBirth("10", "10", "1997");
		addCustomer.customerAddress("MayurVihar Phase");
		addCustomer.customerCity("Delhi");
		addCustomer.customerState("Delhi");
		addCustomer.customerPin("110093");
		addCustomer.customerMobileno("7681066464");		
		addCustomer.customerEmailId("abc"+randomString()+"@gmail.com");
		addCustomer.customerPassword("ABC" +randomNumber());
		addCustomer.submitButton();
		
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		logger.info("Validation Started");
		boolean res=driver.getPageSource().contains("Customer Registred Successfully!!!");		
		
		Thread.sleep(3000);
		if(res=true)
		{
			logger.info("New Customer Added Successfully!!");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Please Verify Provided Customer Details");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		WebElement custometId= driver.findElement(By.xpath("//table[@id='customer']//tr[4]//td[2]"));
		String cstID=custometId.getText();
		
		System.out.println(cstID);
	}
	
	
//	public String custID()
//	{		
//		return cstID;
//	}
	
	
	

}
