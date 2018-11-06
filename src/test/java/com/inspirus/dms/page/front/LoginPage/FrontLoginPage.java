package com.inspirus.dms.page.front.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.Selenium;

public class FrontLoginPage {
	
	WebDriver driver;
	
	//login account input box
	@FindBy(name="username")
	public WebElement username;
//	public WebElement username = driver.findElement(By.name("username"));
	//password input box
	@FindBy(name="password")
	public WebElement password;
//	public WebElement password = driver.findElement(By.name("password"));;
	//login button
	@FindBy(id="loginformsubmit")
	public WebElement loginBtn;
//	public WebElement loginBtn = driver.findElement(By.id("loginformsubmit"));;
	//forgot Password link
	@FindBy (linkText="Forgot Password?")
	public WebElement forgotPassword;
	
	// DMS_Console -> Customer Search
	//xpath=//a[contains(text(),'Customer Search')]
	@FindBy(xpath="//a[contains(text(),'Customer Search')]")
	public WebElement customer_Search;
	
	public FrontLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}	
		
	// Log into the DMS_Console
	public void login(String login_name,
			String login_password, WebDriver driver) throws Exception {
		username.clear();
		username.sendKeys(login_name);
		password.clear();
		password.sendKeys(login_password);
		loginBtn.click();
	}
}
