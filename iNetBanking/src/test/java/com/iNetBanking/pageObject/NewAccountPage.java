package com.iNetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	
	WebDriver ldriver;
	

	public NewAccountPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	WebElement addAccLink;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	WebElement custId;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement accType;
	
	@FindBy(name="inideposit")
	WebElement initialDipoAmt;
	
	@FindBy(name="button2")
	WebElement subBtn;
	
	public void addAccLink()
	{
		addAccLink.click();
	}
	public void custId(String id)
	{
		custId.sendKeys(String.valueOf(id));
	}
	public void selectAccount(String value)
	{
		Select se=new Select(accType);
		se.selectByVisibleText(value);
		
	}
	public void dipositAmount(String amt)
	{
		initialDipoAmt.sendKeys(String.valueOf(amt));
	}
	public void subBtn()
	{
		subBtn.click();
	}
	
	
	
	
}
