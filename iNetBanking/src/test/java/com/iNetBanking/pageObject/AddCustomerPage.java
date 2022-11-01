package com.iNetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement addNewCustomerLink;
	
	@FindBy(how= How.NAME, using ="name")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement custmenrGender;
	
	@FindBy(how=How.ID_OR_NAME, using="dob")
	@CacheLookup
	WebElement custmenrDOB;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement custmenrAddress;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement custmenrCity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement custmenrState;
	
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement custmenrPinNo;
	
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement custmenrMobNo;
	
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement custmenrEmailId;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement custmenrPassword;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement clickedSubmit;
	
	public void addCustmerLink()
	{
		addNewCustomerLink.click();
	}
	
	public void customerName(String name)
	{
		customerName.sendKeys(name);
	}
	
	public void customerGender(String gender)
	{
		custmenrGender.click();
	}
	public void customerDateOfBirth(String mm,String dd,String yyyy)
	{
		custmenrDOB.sendKeys(mm);
		custmenrDOB.sendKeys(dd);
		custmenrDOB.sendKeys(yyyy);
	}
	public void customerAddress(String address)
	{
		custmenrAddress.sendKeys(address);
	}

	public void customerCity(String city)
	{
		custmenrCity.sendKeys(city);
	}
	public void customerState(String state)
	{
		custmenrState.sendKeys(state);
	}
	public void customerPin(String pin)
	{
		custmenrPinNo.sendKeys(String.valueOf(pin));
	}
	public void customerMobileno(String mobno)
	{
		custmenrMobNo.sendKeys(mobno);
	}
	public void customerEmailId(String email)
	{
		custmenrEmailId.sendKeys(email);
	}
	public void customerPassword(String pwd)
	{
		custmenrPassword.sendKeys(pwd);
	}
	public void submitButton()
	{
		clickedSubmit.click(); 
	}
	
	
	
	
	
	
}
