package com.iNetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditCustomerPage   {

	WebDriver ldriver;
	
//	TC_AddCustomer_003 addcust=new TC_AddCustomer_003();
//	public void getCustomerId()
//	{
//		addcust.addNewCustomer();
//		addcust.custID();
//	}
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")
	WebElement editCustomerLink;
	
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement customerID;
	
	@FindBy(name="AccSubmit")
	WebElement accsubmit;
	
	@FindBy(name="name")
	WebElement custName;
	
	@FindBy(name="gender")
	WebElement custgender;
	
	@FindBy(name="dob")
	WebElement dateofbirth;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinnumber;
	
	@FindBy(name="telephoneno")
	WebElement mobileno;
	
	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	WebElement submitbutton;
	public void editcustomerLink()
	{
		editCustomerLink.click();
	}
	public void customerId(String cstID)
	{
		customerID.sendKeys(String.valueOf(cstID));
		
	}	
	public void accSubmit()
	{
		accsubmit.click();
	}
	public void custName(String name)
	{
		custName.sendKeys(name);
	}
	public void custGender(String gender)
	{
		custgender.sendKeys(gender);
	}
	public void custDob(String dob)
	{
		dateofbirth.sendKeys(dob);
	}
	public void custAddress(String adrs)
	{
		address.sendKeys(adrs);
	}
	public void custCity(String cty)
	{
		city.sendKeys(cty);
	}
	public void custState(String sta)
	{
		state.sendKeys(sta);
	}
	public void custPinNo(String pin)
	{
		pinnumber.sendKeys(pin);
	}
	public void custMobile(String mbl)
	{
		mobileno.sendKeys(mbl);
	}
	public void custEmail(String email)
	{
		emailid.sendKeys(email);
	}
	public void custSubBtn()
	{
		submitbutton.click();
	}
	
	
	
	
	
	
	
	
}

