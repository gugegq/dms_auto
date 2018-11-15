package com.inspirus.dms.test.DMS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.login.LoginDMS;

public class TD_01_DMS_Create_New_Recip {
	
	WebDriver driver;
	
	String Customer_ID;
	String Program_Code;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	
	@Test
	
	public void create_new_recip()  throws Exception {
		
		//Login DMS Page
		new LoginDMS().login_dms(driver);
		
		
		
		
				
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}	

}
