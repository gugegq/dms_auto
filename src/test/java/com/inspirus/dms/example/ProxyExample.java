package com.inspirus.dms.example;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.inspirus.dms.basic.*;
import com.inspirus.dms.basic.controllers.*;



public class ProxyExample {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();

	}

	@Test
	public void testSendP2P() throws Exception {
	driver.navigate().to("http://www.baidu.com");
//	assertTrue(ExpectedConditions.presenceOfElementLocated(By.id("login")));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
