package com.inspirus.dms.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inspirus.dms.page.FrontLoginPage;

public class CheckEmail {
	
	public void LoginPageTest(WebDriver driver) throws Exception {
		
		// Email_All
		// Email Button
		final String  received_email_xpath = "//*[@id=\":3j\"]/span";
		final String  received_email_css = ".xS .y6 .bog > span";
		// Email Content
		// Meredith Young - Service Recognition Award Packet
		final String  title_email = ".nH .no .nn .ar4 .AO .aeF .id .iY .Bu .if .byY .nH .ha .hP";
		// Service Award Packet Shipped for - Meredith Young
		// .a3s tbody > tr > td > table > tbody > tr > td > h2
		final String  head_email = ".nH .bkL .bAt .if .hx .ie .gs .gt .a3s tbody > tr > td > table > tbody > tr > td > h2";
		// Body Content
		final String  body_email = ".gt .a3s td[class$='bodyContent']";
		// Email Content
		final String  email_content = "Service Award Packet Shipped for - Meredith YoungThank you for supporting the TEST, Service Award Program. Your role is critical to the success of the program. It is important to recognize and appreciate our employees for their continued service in helping make TEST a great company.You recently should have received a Service Award Packet for Meredith Young.It was sent to:##%saddress1%####%saddress2%####%saddress3%####%saddress4%####%scity%##, ##%sstate%## ##%szip%####%scountry%##If you have not received this delivery or it was damaged in transit, please contact us via e-mail or call 888.332.7110 to order a replacement.Meredith Young will be receiving an e-mail directly from TEST with information on how to choose their service award. Please take the time to personally acknowledge their contributions to the company. This is a great opportunity to recognize your employee in a memorable way.Thank you again for your participation and for helping TEST in creating a company that cares about its people.";
		
		FrontLoginPage frontLoginPage = new FrontLoginPage(driver);
//		Login into DMS_Console page.
		frontLoginPage.login_Email("dmstest117@gmail.com", "K@ppy213", driver);
		Thread.sleep(1000*10);
		driver.findElement(By.cssSelector(received_email_css)).click();
		Thread.sleep(1000*20);
		//Check Email Title "Meredith Young - Service Recognition Award Packet"
		driver.findElement(By.cssSelector(title_email)).equals("Meredith Young - Service Recognition Award Packet");
		driver.findElement(By.cssSelector(head_email)).equals("Service Award Packet Shipped for - Meredith Young");
		String content = driver.findElement(By.cssSelector(body_email)).getText();
		content = content.trim().replaceAll("\\n", "");
		System.out.print(content);
		//Check the content
		content.equals(email_content);
		
	}

}
