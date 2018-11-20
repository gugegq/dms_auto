package com.inspirus.dms.test.DMS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ComString;
import com.inspirus.dms.basic.ElementLocation;
import com.inspirus.dms.basic.Recip_Info_Input;
import com.inspirus.dms.basic.WaitElement;
import com.inspirus.dms.basic.login.LoginDMS;

public class TD_01_DMS_Create_New_Recip {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	
	@Test	
	public void create_new_recip()  throws Exception {
		
		ElementLocation element = new ElementLocation();
		WaitElement wt = new WaitElement();
		
		//Login DMS Page
		new LoginDMS().login_dms(driver);
		driver.findElement(By.cssSelector(element.customer)).click();
		driver.findElement(By.cssSelector(element.D01000)).click();
		wt.waitForElementToBePresent(driver, driver.findElement(By.cssSelector(element.choose_program_btn)));
		driver.findElement(By.cssSelector(element.choose_program_btn)).click();
		driver.findElement(By.cssSelector(element.program_choose)).click();
		driver.findElement(By.cssSelector(element.recipients)).click();
		driver.findElement(By.cssSelector(element.add_new_btn)).click();
		Thread.sleep(1000*2);
		new Recip_Info_Input().recip_info_page_input(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}	

}
