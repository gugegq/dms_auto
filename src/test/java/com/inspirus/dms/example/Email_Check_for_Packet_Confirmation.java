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

public class Email_Check_for_Packet_Confirmation {
	
	WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void LoginPageTest() throws Exception {
		
		// Email_All
		// Email Button
		final String  received_email_xpath = "//*[@id=\":3j\"]/span";
		final String  received_email_css = ".xS .y6 .bog > span";

		// Email Content
		// Meredith Young - Service Recognition Award Packet
		final String  title_email = ".nH .no .nn .ar4 .AO .aeF .id .iY .Bu .if .byY .nH .ha .hP";
		// Service Award Packet Shipped for - Meredith Young
		final String  head_email = ".nH .bkL .bAt .if .hx .ie .gs .gt .a3s .m_4919471788479975915bodyContent > h2";
		/*
		 * 	Thank you for supporting the TEST, Service Award Program. 
		 *  Your role is critical to the success of the program. 
		 *  It is important to recognize and appreciate our employees for their continued service in helping make TEST a great company.
		 */
		final String  body1_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[1]";
		// You recently should have received a Service Award Packet for Meredith Young.
		final String  body2_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[2]";
		// It was sent to:
		final String  body3_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[3]";
		// ##%saddress1%##
		final String  body4_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[4]";
		// ##%saddress2%##
		final String  body5_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[5]";
		// ##%saddress3%##
		final String  body6_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[6]";
		// ##%saddress4%##
		final String  body7_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[7]";
		// ##%scity%##, ##%sstate%## ##%szip%##
		final String  body8_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[8]";
		// ##%scountry%##
		final String  body9_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[8]";		
		// If you have not received this delivery or it was damaged in transit, please contact us via e-mail or call 888.332.7110 to order a replacement.
		final String  body10_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[9]";
		/*
		 * Meredith Young will be receiving an e-mail directly from TEST with information on how to choose their service award. 
		 * Please take the time to personally acknowledge their contributions to the company. 
		 * This is a great opportunity to recognize your employee in a memorable way.
		 * */
		final String  body11_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[10]";
		// Thank you again for your participation and for helping TEST in creating a company that cares about its people.
		final String  body12_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[11]";	
		
		Wait wt = new Wait();
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Login into DMS_Console page.
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);
		Thread.sleep(1000*10);
//		String xpath = "//*[@id=\":7l\"]/span";
//		wt.waitForElementToBePresent(driver, driver.findElement(By.xpath(received_email_xpath)));
//		driver.findElement(By.xpath(received_email_xpath)).click();
//		wt.waitForElementToBePresent(driver, driver.findElement(By.cssSelector(received_email_css)));
		driver.findElement(By.cssSelector(received_email_css)).click();
		Thread.sleep(1000*20);
		//Check Email Title "Meredith Young - Service Recognition Award Packet"
		driver.findElement(By.cssSelector(title_email)).equals("Meredith Young - Service Recognition Award Packet");
		driver.findElement(By.cssSelector(head_email)).equals("Service Award Packet Shipped for - Meredith Young");
		driver.findElement(By.xpath(body1_email)).equals("\r\n" + 
				"									Thank you for supporting the TEST, Service Award Program. Your role is critical to the success of the program. It is important to recognize and appreciate our employees for their continued service in helping make TEST a great company.");
		driver.findElement(By.xpath(body2_email)).equals("\r\n" + 
				"									You recently should have received a Service Award Packet for Meredith Young.");
		driver.findElement(By.xpath(body3_email)).equals("\r\n" + 
				"									It was sent to:");
		driver.findElement(By.xpath(body4_email)).equals("\r\n" + 
				"									##%saddress1%##");
		driver.findElement(By.xpath(body5_email)).equals("\r\n" + 
				"									##%saddress2%##");
		driver.findElement(By.xpath(body6_email)).equals("\r\n" + 
				"									##%saddress3%##");
		driver.findElement(By.xpath(body7_email)).equals("\r\n" + 
				"									##%saddress4%##");
		driver.findElement(By.xpath(body8_email)).equals("\r\n" + 
				"									##%scity%##, ##%sstate%## ##%szip%##");
		driver.findElement(By.xpath(body9_email)).equals("\r\n" + 
				"									##%scountry%##");
		driver.findElement(By.xpath(body10_email)).equals("\r\n" + 
				"									If you have not received this delivery or it was damaged in transit, please contact us via e-mail or call 888.332.7110 to order a replacement.");


		driver.findElement(By.xpath(body11_email)).equals("\r\n" + 
				"									Meredith Young will be receiving an e-mail directly from TEST with information on how to choose their service award. Please take the time to personally acknowledge their contributions to the company. This is a great opportunity to recognize your employee in a memorable way.");
		driver.findElement(By.xpath(body12_email)).equals("\r\n" + 
				"									Thank you again for your participation and for helping TEST in creating a company that cares about its people.");
		driver.findElement(By.xpath(title_email)).equals(" - Service Recognition Award Packet");
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
