package com.inspirus.dms.basic.login;

import org.openqa.selenium.WebDriver;

import com.inspirus.dms.page.FrontLoginPage;

public class LoginConsole {	
	
	public void login_console(WebDriver driver) throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
		
		//Login into DMS_Console page.
		frontLoginPage.login_Console("mlongoria", "123456", driver);		
	}

}
