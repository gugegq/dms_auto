package com.inspirus.dms.basic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Email_Login {
	
	public static WebDriver my_driver;
	
	//用户名
	@FindBy(name="loginfmt")
	public WebElement username;
	//下一步按钮
	public static final String Btn1 = "//input[@value='下一步']";
	//密码
	@FindBy(name="passwd")
	public WebElement password;
	//登陆按钮
	public static final String Btn2 = "//input[@value='登陆']";	

	public static String Hotmail_Login_Page="https://login.live.com/";
	public static String Hotmail_login_user="test_inspirus@hotmail.com";
	public static String Hotmail_login_password="K@ppy213";	


	public static WebDriver myDriver_Hotmail() {
		PropertyConfigurator.configure("config/log4j.properties");
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		my_driver = new FirefoxDriver();
        
		my_driver.manage().window().maximize();
		my_driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		my_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		my_driver.get(Hotmail_Login_Page);
		
		return my_driver;
	}
	
	// Log into the Hotmail
	public void hotmail_login(String login_name,
			String login_password, WebDriver driver) throws Exception {
		username.clear();
		username.sendKeys(login_name);
		driver.findElement(By.xpath(Btn1)).click();
		password.clear();
		password.sendKeys(login_password);
		driver.findElement(By.xpath(Btn2)).click();
	}
	
	public static void test() {
		
		
	}

}
