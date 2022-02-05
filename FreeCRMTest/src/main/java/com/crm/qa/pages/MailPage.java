package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class MailPage extends TestBase{
	


	@FindBy(xpath="//img[@class='_yb_106zd _yb_poc0q _yb_1t0ix']")
	WebElement MailLogo;
	
	@FindBy(xpath="//button[@class='c27KHO0_n b_0 M_0 i_0 I_T y_Z2hYGcu A_6EqO r_P C_q cvhIH6_T P_0 C4_Z2aVTcY']")
	WebElement searchCheckBox;
	
	@FindBy(xpath="//a[@aria-label='Compose']")
	WebElement composeMail;
	
	@FindBy(xpath="//input[@class='select-input react-typeahead-input input-to Z_N ir_0 j_n y_Z2hYGcu q_52qC k_w W_6D6F H_6NIX M_0 b_0 P_SMJKi A_6EqO D_X p_a L_0 B_0']")
	WebElement ToLink;
	
	@FindBy(xpath="//input[@data-test-id='compose-subject']")
	WebElement SubjectLink;
	
	@FindBy(xpath="//div[@class='rte em_N ir_0 iy_A iz_h N_6Fd5']")
	WebElement BodyLink;
	
	@FindBy(xpath="//button[@class='q_Z2aVTcY e_dRA k_w r_P H_6VdP s_3mS2U en_0 M_1gLo4F V_M cZ1RN91d_n y_Z2hYGcu A_6EqO u_e69 b_0 C_52qC I4_Z29WjXl it3_dRA']")
	WebElement SendButtonLink;
	
	
	
	
	public MailPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyMailLabel() {
		return MailLogo.isDisplayed();
	}
	
	public void searchCheckBoxWay() {
		searchCheckBox.click();
	}
	
	public void selectMail() throws InterruptedException {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//button[@title='Checkbox, not checked']"));
		checkboxes.get(2).click();
		checkboxes.get(3).click();
		Thread.sleep(5000);
	}
	
	public void composeMail() throws InterruptedException {
		composeMail.click();
		ToLink.sendKeys("joshwajoy15@gmail.com");
		SubjectLink.sendKeys("This is a test");
		BodyLink.sendKeys("Testing Yahoo by Selenium Automation Tool");
		SendButtonLink.click();
		Thread.sleep(5000);
	}
	
	

}
