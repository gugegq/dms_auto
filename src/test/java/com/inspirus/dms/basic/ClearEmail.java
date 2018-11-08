package com.inspirus.dms.basic;

import org.openqa.selenium.WebDriver;
import com.inspirus.dms.page.FrontLoginPage;

public class ClearEmail {
	
	WebDriver driver;
	
	public void ClearEmailTest() throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
		//Login Gmail
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);
		//Clear Gmail
		frontLoginPage.clear_Email(driver);
		
	}
	
}
