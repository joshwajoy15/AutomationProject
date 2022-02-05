package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
//import com.crm.qa.pages.EntertainmentPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MailPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MailPage mailPage;
	
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test cases -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialalization();
		//entertainmentPage = new EntertainmentPage();
		mailPage = new MailPage();
		loginPage = new LoginPage();
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePagetitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePagetitle, "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyCorrectUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyMailLinkTest() {
		mailPage = homePage.clickOnMailLink();
	}
	
//	@Test(priority=4)
//	public void verifyEntertainmentLinktest() {
//		EntertainmentPage EntertainmentPage = homePage.clickOnEntertainmentLink();
//	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
