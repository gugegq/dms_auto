package com.inspirus.dms.DMS_Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ElementLocation;

import com.inspirus.dms.page.front.LoginPage.FrontLoginPage;

//SA4_PacketCommunication Check
public class Console_Communication {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	
	@Test
	public void Test_SA4_PacketCommunication() throws Exception {
		
		//Initial my element
		ElementLocation my_element = new ElementLocation();
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
		//Login into DMS_Console page.
		frontLoginPage.login("mlongoria", "123456", driver);
//	    Thread.sleep(1000*10);
	    //Customer Search->Programs->Communication
	    //Customer ID=D01000 Program Code=1801 Communication=Packet Confirmation
	    //1. Click Customer Search
		my_element.cust_Search.click();
//		Thread.sleep(1000*5);
	    //2. Input Customer ID=D01000， and click Search
		my_element.cust_Id.clear();
		my_element.cust_Id.sendKeys("D01000");
//		Thread.sleep(1000*5);
		my_element.cust_Id_Search.click();
	    //3. Click programs
	    my_element.programs.click();
	    //4. Choose program code = 1801
	    my_element.programs_code.click();
	    //5. Click communication
	    my_element.communications.click();
	    //6. Click Communication Events List -> add
	    my_element.add_btn.click();	    
	    //7. Input all required fields and click 'insert default message'
	    my_element.packet_confirmation.click();
	    my_element.active.click();
	    my_element.timing.sendKeys("1");
	    my_element.before.click();
	    my_element.anniversary.click();
	    my_element.email.click();
	    my_element.recipient.click();
	    
	    my_element.insert_default_message_btn.click();
	    //8. Click preview message
	    my_element.
	    
	    //9.在Send Preview选框中输入邮箱地址
	    
	    //10.点击Send按钮
	    
	    //11.到邮箱中查收邮件
	    
	    //12.比对内容检查	    
	    
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
