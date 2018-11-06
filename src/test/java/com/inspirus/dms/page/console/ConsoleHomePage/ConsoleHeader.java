package com.inspirus.dms.page.console.ConsoleHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsoleHeader {
	
	//CNG Admin Console link
	@FindBy(linkText="CNG Admin Console")
	public WebElement CNGAdminConsole;
	//Home link
	@FindBy(linkText="Home")
	public WebElement home;
	//Admins link
	@FindBy(linkText="Admins")
	public WebElement Admins;
	//Automation link
	@FindBy(xpath="//div/div/div/ul[1]/li[3]/a")
	public WebElement Automation;
	//Scheduler link
	@FindBy(linkText="Scheduler")
	public WebElement Scheduler;
	//Jobs link
	@FindBy(linkText="Jobs")
	public WebElement Jobs;
	//Messages link
	@FindBy(xpath="//div/div/div/ul[1]/li[4]/a")
	public WebElement Messages;
	//Maintenance link
	@FindBy(linkText="Maintenance")
	public WebElement Maintenance;
	//Messages count
	public WebElement newMessageCount;
	//Sign out
	@FindBy(linkText="Sign out")
	public WebElement signout;
	//Welcome User name
	@FindBy(xpath="//div/div/div/ul[2]/li[1]/a")
	public WebElement username;
	//Edit User Details after press Welcome
	@FindBy(linkText="Edit User Details")
	public WebElement EditUserDetails;
	//Subscriptions after press Welcome
	@FindBy(linkText="Subscriptions")
	public WebElement Subscriptions;
	//About after press Welcome
	@FindBy(linkText="About")
	public WebElement About;
	//close about
	public WebElement closeCodeInfo;
	@FindBy(xpath="//div[@id='codeInfo']/div[1]/button")
	public WebElement closeCodeInfoicon;
	
	//Log out the console
	public void logoutConsole(WebDriver driver) throws Exception {
//		PageFactory.initElements(driver, ConsoleHeader.class);
		signout.click();
	}
	
	//Constructor
	public ConsoleHeader(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
