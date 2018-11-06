package com.inspirus.dms.basic.controllers;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDriverHelper {

	/*
	 * Validate the Element is present or not. Example for use:
	 * assertFalse(ActionDriverHelper
	 * .isElementPresent(ServiceAnniversarySetupRulesPage.catalogCode));
	 */
	public static boolean isElementPresent(WebElement w) {
		try {
			w.getLocation();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/*
	 * Validate the text is present or not. Example for use:
	 * assertTrue(ActionDriverHelper.isTextPresent("User Registration",
	 * driver));
	 */
	// public static boolean isTextPresent(String pattern, WebDriver driver){
	// String Xpath= "//*[contains(text(),\'"+pattern+"\')]" ;
	// System.out.println(Xpath);
	// try {
	// driver.findElement(By.xpath(Xpath));
	// return true;
	// } catch (NoSuchElementException e) {
	// return false;
	// }
	// }
	public static boolean isTextShown(WebDriver driver, String content) {
		boolean status = false;
		try {
			if (driver.findElement(By.tagName("body")).getText().contains(content)){
				System.out.println(content + " is shown in the screen!");
				status = true;
			} 
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println("'" + content + "' doesn't exist!");
		}
		return status;
	}
	
	
	public static boolean isTextPresent(WebDriver driver, String content) {
		boolean status = false;
		try {
			if (driver.findElement(By.xpath("//*[contains(.,'" + content + "')]")).isDisplayed()){
				System.out.println(content + " is appeard!");
				status = true;
			} 
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println("'" + content + "' doesn't exist!");
		}
		return status;
	}
	
	// scroll to view
	public static void scrollToView(WebElement element,WebDriver driver) {
		try{
		    JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView()", element);
		}catch(NoSuchElementException e){
			fail ("The element does not exist, scroll into view failed!");
		}
	}
	
	// select drop list option
	public static void selectOption(WebDriver driver, int count) throws Exception {
		Actions action = new Actions(driver);
		for (int n = 0; n < count; n++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	
	// select drop list option with sleep time variable
	public static void selectOption(WebDriver driver, int count, int arrow_time, int enter_time) throws Exception {
		Actions action = new Actions(driver);
		for (int n = 0; n < count; n++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(arrow_time);
		}
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(enter_time);
	}
	
	// click element by JS
	public static void clickByJS(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
}
