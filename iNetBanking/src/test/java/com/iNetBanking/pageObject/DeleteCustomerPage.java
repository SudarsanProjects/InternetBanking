package com.iNetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	WebDriver ldriver;
	
	public DeleteCustomerPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Delete Customer")
	WebElement delCustLink;
	
	@FindBy(name="cusid")
	WebElement cusId;

	@FindBy(name="AccSubmit")
	WebElement delSub;
	
	public void deCustLink()
	{
		delCustLink.click();
	}
	public void custId(String cstid)
	{
		cusId.sendKeys(String.valueOf(cstid));
	}
	public void delSub()
	{
		delSub.click();
	}
	
}
