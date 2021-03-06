package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.login.LoginEmail;
import com.inspirus.dms.page.FrontLoginPage;

public class Test_LoginEmail {	
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void LoginPageTest() throws Exception {

		new LoginEmail().LoginEmailTest(driver);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
