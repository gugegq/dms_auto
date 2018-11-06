package com.inspirus.dms.page.console.MessagesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage {
	
	//Constructor
	public MessagesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Mark All As Read button
	@FindBy(linkText="Mark All As Read")
	public WebElement markAllAsRead;
	//Delete All button
	@FindBy(linkText="Delete All")
	public WebElement deleteAll;
	//order by status
	@FindBy(xpath="//table/thead/tr/th[2]")
	public WebElement status;
	//order by from
	@FindBy(xpath="//table/thead/tr/th[3]")
	public WebElement from;
	//order by subject
	@FindBy(xpath="//table/thead/tr/th[4]")
	public WebElement subject;
	//order by received
	@FindBy(xpath="//table/thead/tr/th[5]")
	public WebElement received;
}
