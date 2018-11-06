package com.inspirus.dms.basic;

import java.util.concurrent.TimeUnit;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.webWebDriverBackedSelenium;

public class Browsers {
	
	private static WebDriver my_driver;
	private static String SiteIP="https://qa3.inspirus.com/admin/login/index.cfm?";

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
}
