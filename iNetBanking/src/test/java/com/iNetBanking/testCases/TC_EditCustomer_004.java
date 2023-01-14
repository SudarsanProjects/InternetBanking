package com.iNetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iNetBanking.pageObject.AddCustomerPage;
import com.iNetBanking.pageObject.EditCustomerPage;
import com.iNetBanking.pageObject.LoginPage;

public class TC_EditCustomer_004 extends BaseSetupClass {
	
    @Test
	public void editCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("user entered username");
		lp.setPassword(password);
		logger.info("user provide password");
		lp.clickSubmit();
		logger.info("user clicked on submit");
		
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
		WebElement custometId= driver.findElement(By.xpath("//table[@id='customer']//tr[4]//td[2]"));
		String cstID=custometId.getText();
		
		EditCustomerPage ed=new EditCustomerPage(driver);
		
		ed.editcustomerLink();
		System.out.println(cstID);
		ed.customerId(cstID);
		ed.accSubmit();
		Thread.sleep(3000);
		ed.custAddress("Myurvihar phase-1");
		ed.custCity("Delhi");
		ed.custMobile("7656787678");
		ed.custSubBtn();
		
	}
}
