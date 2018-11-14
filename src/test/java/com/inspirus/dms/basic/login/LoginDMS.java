package com.inspirus.dms.basic.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDMS {
	
	public void login_dms(WebDriver driver) throws Exception {
		
		final String dms_btn = "#DMSButton";
		
		new LoginConsole().login_console(driver);
		driver.findElement(By.cssSelector(dms_btn)).click();
		
	}

}
