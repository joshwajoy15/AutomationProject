package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

////input[@name='password']

public class LoginPage extends TestBase{
	
//	@FindBy(xpath="//a[@class= 'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
//	WebElement FirstLoginIn;
	
	//Page Factory - OR:
	@FindBy(id="login-username")
	WebElement username;
	
	@FindBy(id="login-passwd")
	WebElement password;
	
	@FindBy(id="login-signin")
	WebElement nextButton;
	
	
//	@FindBy(xpath="//img[contains(@class, 'c4icons') and @alt='iTunes']")
//	WebElement iTunesLogo;
	
	//Initializing the Page Objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	
	public HomePage login(String un, String pd) {
		username.sendKeys(un);
		nextButton.click();
		password.sendKeys(pd);
		nextButton.click();
		
		
		return new HomePage();
	}
	

}
