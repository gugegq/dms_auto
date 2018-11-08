package com.inspirus.dms.basic;

import org.openqa.selenium.WebDriver;
import com.inspirus.dms.page.FrontLoginPage;

public class LoginEmail {	
	
	WebDriver driver;
	
	public void LoginPageTest() throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Login into DMS_Console page.
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);;
		
	}
	
}
