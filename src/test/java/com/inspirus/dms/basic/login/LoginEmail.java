package com.inspirus.dms.basic.login;

import org.openqa.selenium.WebDriver;
import com.inspirus.dms.page.FrontLoginPage;

public class LoginEmail {
	
	public void LoginEmailTest(WebDriver driver) throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Login into Gmail.
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);		
	}
	
}
