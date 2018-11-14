package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ClearEmail;
import com.inspirus.dms.basic.login.LoginEmail;
import com.inspirus.dms.page.FrontLoginPage;

public class Test_ClearEmail {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void LoginPageTest() throws Exception {
		
		new LoginEmail().LoginEmailTest(driver);
		new ClearEmail().ClearEmailTest(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
