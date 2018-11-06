package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.basic.Email_Login;
import com.inspirus.dms.page.front.LoginPage.FrontLoginPage;

public class LoginPage {
	
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
//		driver = Browsers.myDriver();
		driver = Email_Login.myDriver_Hotmail();
	}
	
	@Test
	public void LoginPageTest() throws Exception {
		
//		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Thread.sleep(1000*10);
		//Login into DMS_Console page.
//		frontLoginPage.login("mlongoria", "123456", driver);
//		Thread.sleep(1000*30);
		
		Email_Login elogin = new Email_Login();
		elogin.hotmail_login(elogin.Hotmail_login_user, elogin.Hotmail_login_password, driver);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
