package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.CheckEmail;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.basic.Wait;
import com.inspirus.dms.page.FrontLoginPage;

public class Test_Email_Check_for_Packet_Confirmation {
	
	WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void LoginPageTest() throws Exception {
		new CheckEmail().LoginPageTest(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
