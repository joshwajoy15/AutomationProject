package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(), 'Joshwa') and @class='_yb_1a0lb _yb_icqy6 _yb_mxsp9']")
	WebElement UserNameLabel;
	//span[contains(text(), 'Joshwa') and @class='_yb_nebep _yb_uh5of _yb_hc6d9']
	
	@FindBy(xpath="//a[@class='_yb_r4ruv  rapid-noclick-resp' and @id='root_1']")
	WebElement MailLink;
	
//	@FindBy(id="root_4")
//	WebElement SportsLink;
	
	@FindBy(id="root_5")
	WebElement EntertainmentLink;
	
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return UserNameLabel.isDisplayed();
	}
	
	public MailPage clickOnMailLink() {
		MailLink.click();
		return new MailPage();
	}
	
	public EntertainmentPage clickOnEntertainmentLink() {
		EntertainmentLink.click();
		return new EntertainmentPage();
	}
	
	
	
	
	

}
