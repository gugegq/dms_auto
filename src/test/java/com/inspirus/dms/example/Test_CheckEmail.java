package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.page.FrontLoginPage;

public class Test_CheckEmail {
	
	WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void LoginPageTest() throws Exception {
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Login into DMS_Console page.
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);
		Thread.sleep(1000*5);
		driver.switchTo().frame(driver.findElement(By.cssSelector(ElementLocation.frame_received_email)));
		driver.findElement(By.cssSelector(ElementLocation.received_email)).click();		
		driver.switchTo().defaultContent();
//		driver.findElement(By.cssSelector(ElementLocation.received_email)).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
