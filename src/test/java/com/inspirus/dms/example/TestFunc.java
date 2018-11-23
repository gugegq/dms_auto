package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ComString;
import com.inspirus.dms.basic.CommonLocateElement;
import com.inspirus.dms.basic.pageElements;
import com.inspirus.dms.basic.login.LoginDMS;

public class TestFunc {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	@Test
	public void test_func() throws Exception {
		
		CommonLocateElement common = new CommonLocateElement();
		pageElements element = new pageElements();
		ComString cstr = new ComString();
		
		new LoginDMS().login_dms(driver);
		common.findCss(driver, element.recipients_btn).click();
		common.findCss(driver, element.recipients_input).clear();
		common.findCss(driver, element.recipients_input).sendKeys(cstr.recip_input);
		common.findCss(driver, element.recipients_input).sendKeys(Keys.ENTER);		

	}
	
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

}
