package com.inspirus.dms.basic;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	private static WebDriver my_driver;
	// QA3 DMS Page
	private static String SiteIP="https://qa3.inspirus.com/admin/login/index.cfm?";
	// Hotmail Login Page
	private static String Email_URL="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	public static WebDriver myDriver() {
		PropertyConfigurator.configure("config/log4j.properties");
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		my_driver = new FirefoxDriver();
        
		my_driver.manage().window().maximize();
		my_driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		my_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		my_driver.get(SiteIP);
		
		return my_driver;
	}
	
	public static WebDriver myDriver_Email() {
		PropertyConfigurator.configure("config/log4j.properties");
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		my_driver = new FirefoxDriver();
        
		my_driver.manage().window().maximize();
		my_driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		my_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		my_driver.get(Email_URL);
		
		return my_driver;
	}
}
