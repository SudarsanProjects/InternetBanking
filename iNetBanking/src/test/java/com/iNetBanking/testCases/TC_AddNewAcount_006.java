package com.iNetBanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iNetBanking.pageObject.AddCustomerPage;
import com.iNetBanking.pageObject.LoginPage;
import com.iNetBanking.pageObject.NewAccountPage;

public class TC_AddNewAcount_006 extends BaseSetupClass{
	
	@Test
	public void addAcount() throws InterruptedException
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
		Thread.sleep(3000);
		NewAccountPage np=new NewAccountPage(driver);
		np.addAccLink();
		np.custId(cstID);
		np.selectAccount("Savings");
		np.dipositAmount("10000");
		np.subBtn();
		
	}

}
