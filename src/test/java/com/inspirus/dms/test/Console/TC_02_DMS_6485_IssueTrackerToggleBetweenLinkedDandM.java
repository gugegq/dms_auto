package com.inspirus.dms.test.Console;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ClearEmail;
import com.inspirus.dms.basic.ElementLocation;

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
		
	
	}
	
	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

}
