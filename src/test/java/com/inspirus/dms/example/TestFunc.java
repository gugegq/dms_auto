package com.inspirus.dms.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.DMS_Func;
import com.inspirus.dms.basic.login.LoginDMS;

public class TestFunc {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	@Test
	public void test_func() throws Exception {
		
		new LoginDMS().login_dms(driver);
		new DMS_Func().products_search(driver, "BD706");
		Thread.sleep(1000*10);

	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
