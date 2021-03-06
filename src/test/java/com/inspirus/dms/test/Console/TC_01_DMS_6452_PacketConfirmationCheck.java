package com.inspirus.dms.test.Console;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.CheckEmail;
import com.inspirus.dms.basic.ClearEmail;
import com.inspirus.dms.basic.pageElements;
import com.inspirus.dms.basic.login.LoginConsole;


//SA4_PacketCommunication Check
public class TC_01_DMS_6452_PacketConfirmationCheck {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}
	
	
	@Test
	public void Test_SA4_PacketCommunication() throws Exception {
		
		//Initial my element
		pageElements my_element = new pageElements();
		
		//Login into DMS_Console page.
		new LoginConsole().login_console(driver); 
	    //Customer Search->Programs->Communication
	    //Customer ID=D01000 Program Code=1801 Communication=Packet Confirmation
	    //1. Click Customer Search
		driver.findElement(By.xpath(my_element.cust_Search)).click();
	    //2. Input Customer ID=D01000， and click Search
		driver.findElement(By.xpath(my_element.cust_Id)).clear();
		driver.findElement(By.xpath(my_element.cust_Id)).sendKeys("D01000");
		driver.findElement(By.xpath(my_element.cust_Id_Search)).click();
	    //3. Click programs
	    driver.findElement(By.xpath(my_element.programs)).click();
	    //4. Choose program code = 1801
	    driver.findElement(By.xpath(my_element.programs_code)).click();
	    //5. Click communication
	    driver.findElement(By.xpath(my_element.communications)).click();
	    Thread.sleep(1000*8);
	    //6. Click Communication Events List -> add
	    driver.findElement(By.xpath(my_element.add_btn)).click();
	    Thread.sleep(1000*5);
	    //7. Input all required fields and click 'insert default message'
	    driver.findElement(By.xpath(my_element.packet_confirmation)).click();
	    driver.findElement(By.xpath(my_element.active)).click();
	    driver.findElement(By.xpath(my_element.timing)).sendKeys("1");
	    driver.findElement(By.xpath(my_element.before)).click();
	    driver.findElement(By.xpath(my_element.anniversary)).click();
	    driver.findElement(By.xpath(my_element.email)).click();
	    driver.findElement(By.xpath(my_element.recipient)).click();
	    driver.findElement(By.xpath(my_element.from_alias)).sendKeys("dms_test");
	    Thread.sleep(1000*2);
	    // Clear the message before click 'insert default message' button
	    // Switch to Frame page
	    //frame()查找和定位iframe框架的方法(switch_to)
	    //获取Frame内标签
	    driver.switchTo().frame(driver.findElement(By.cssSelector(my_element.frame_message)));
	    // Locate the message
	    driver.findElement(By.cssSelector(my_element.message)).clear();
	    //跳出Frame
	    driver.switchTo().defaultContent();
	    Thread.sleep(1000*3);
	    // Click 'insert default message button'
	    driver.findElement(By.xpath(my_element.insert_default_message_btn)).click();
	    //8. Click preview message
	    driver.findElement(By.xpath(my_element.preview_message)).click();	    
	    //9.在Send Preview选框中输入邮箱地址
	    driver.findElement(By.xpath(my_element.send_preview)).clear();
	    driver.findElement(By.xpath(my_element.send_preview)).sendKeys("dmstest117@gmail.com");	    
	    //10.点击Send按钮
	    driver.findElement(By.xpath(my_element.send_btn)).click();
	    Thread.sleep(1000*5);
	    //11.到邮箱中查收邮件
	    driver.get(Browsers.Email_URL);
	    //12.比对内容检查
	    new CheckEmail().LoginPageTest(driver);
	    //13.重置浏览器
	    driver.get(Browsers.Email_URL);
	    Thread.sleep(1000*5);
	}
	
	@After
	public void tearDown() throws Exception {
	    //13.清空邮箱		
	    new ClearEmail().ClearEmailTest(driver);
	    Thread.sleep(1000*5);
		driver.quit();
	}
}
