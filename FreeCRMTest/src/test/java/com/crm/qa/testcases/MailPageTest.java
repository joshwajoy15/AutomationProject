package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MailPage;

public class MailPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MailPage mailPage;
	
	public MailPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialalization();
		mailPage = new MailPage();
		loginPage = new LoginPage();
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    mailPage = homePage.clickOnMailLink();
	}
	
	@Test(priority=1)
	public void verifyMailLabelTest() {
		Assert.assertTrue(mailPage.verifyMailLabel(), "Mail label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectMailPageTest() throws InterruptedException {
		mailPage.selectMail();
	}
	
	@Test(priority=3)
	public void verifyComposeMailTest() throws InterruptedException {
		mailPage.composeMail();
	}
	
//	@Test(priority=2)
//	public void selectSearchCheckBoxTest() {
//		mailPage.searchCheckBoxWay();
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}	
	
