package com.inspirus.dms.test.Console;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ClearEmail;
import com.inspirus.dms.basic.ComString;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.basic.WaitElement;
import com.inspirus.dms.basic.login.LoginDMS;

//DMS Issue Tracker Toggle between D# and M#
public class TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	@Test
	public void Test_IssueTrackerBetweenDandM() throws Exception {
		
		//Initial my element
		ElementLocation element = new ElementLocation();
		WaitElement wt = new WaitElement();
		ComString cstr = new ComString();	
		
		//Login into DMS Page
		new LoginDMS().login_dms(driver);
		Thread.sleep(1000*3);
		//Click Recipients
		driver.findElement(By.cssSelector(element.recipients_btn)).click();
		//Input Recipient ID
		driver.findElement(By.cssSelector(element.recipients_input)).clear();
		driver.findElement(By.cssSelector(element.recipients_input)).sendKeys(cstr.recip_input);
		driver.findElement(By.cssSelector(element.recipients_input)).sendKeys(Keys.ENTER);
		wt.waitForElementToBePresent(driver, driver.findElement(By.cssSelector(element.issue_tracker_btn)));
		//Click IssueTracker Button
		driver.findElement(By.cssSelector(element.issue_tracker_btn)).click();
		
		//Navigate to Console Page
		//Recip Information Page
		driver.findElement(By.cssSelector(element.recipientSelect)).click();
		assertEquals(driver.findElement(By.cssSelector(element.recipientSelect)).getText(), "4734248last, 4734248first D01000 DMS 1801");

		
	}
	
	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

}
