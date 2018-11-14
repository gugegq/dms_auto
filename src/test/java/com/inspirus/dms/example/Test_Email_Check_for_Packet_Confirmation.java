package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.CheckEmail;

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
