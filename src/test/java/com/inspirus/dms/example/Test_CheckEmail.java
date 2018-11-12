package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.basic.Wait;
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
		Thread.sleep(1000*2);
		driver.switchTo().frame(driver.findElement(By.className(ElementLocation.frame_received_email)));
		Thread.sleep(1000*10);
		String xpth=".Tm .aE3 .yO .yW .yP";
		driver.findElement(By.className(xpth)).wait();
		driver.findElement(By.className(xpth)).click();		
		driver.switchTo().defaultContent();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
