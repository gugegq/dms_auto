package com.inspirus.dms.basic;

import org.openqa.selenium.WebDriver;
import com.inspirus.dms.page.FrontLoginPage;

public class ClearEmail {
		
	public void ClearEmailTest(WebDriver driver) throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
	
		//Clear Gmail
		frontLoginPage.clear_Email(driver);
	}	
}
