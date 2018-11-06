package com.inspirus.dms.basic;

import com.thoughtworks.selenium.*;

public class LogoutAction {

	// Log out the user wall
	public static void logoutWall(Selenium selenium) throws Exception {
		selenium.click("link=Log Out");
		selenium.waitForPageToLoad("30000");
	}
	
	// Log out the console
	public static void logoutConsole(Selenium selenium) throws Exception {
		selenium.click("link=Sign out");
		selenium.waitForPageToLoad("30000");
	}	

}
