package com.inspirus.dms.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	//Login into Gmail
	//Email Username
	@FindBy(id="identifierId")
	public WebElement email_username;
	//下一步按钮
	public static final String Btn_Next = "content>span";
	//Email Password
	public static final String email_password = ".I0VJ4d > div:nth-child(1) > input:nth-child(1)";
	//登陆按钮
	public static final String Btn_login = "#passwordNext > content:nth-child(3) > span:nth-child(1)";
	
	//Clear Gmail
	public static final String check_box = "span.T-Jo";
	//Recycle
	public static final String recycle = ".nX > div:nth-child(1)";
	
		
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
		Thread.sleep(1000*5);
		password.clear();
		password.sendKeys(login_password);
		loginBtn.click();
	}
	
	// Log into the DMS_Console
	public void login_Email(String login_name,
			String login_password, WebDriver driver) throws Exception {
		//Input username
		email_username.clear();
		email_username.sendKeys(login_name);
		driver.findElement(By.cssSelector(Btn_Next)).click();
		Thread.sleep(1000*5);
		//Input password
		driver.findElement(By.cssSelector(email_password)).clear();
		driver.findElement(By.cssSelector(email_password)).sendKeys(login_password);		
		driver.findElement(By.cssSelector(Btn_login)).click();
	}
	
	// Clear Gmail
	public void clear_Email(WebDriver driver) throws Exception {

		driver.findElement(By.cssSelector(check_box)).click();
		Thread.sleep(1000*5);
		driver.findElement(By.cssSelector(recycle)).click();
		Thread.sleep(1000*5);
	}	
	
	
}
