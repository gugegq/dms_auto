package com.inspirus.dms.basic;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

import com.thoughtworks.selenium.Selenium;


public class WaitAction {
	
	private static int TimeoutSecond = 60;
	private Selenium selenium;
	
	public WaitAction(Selenium selenium2){
		selenium = selenium2;
	}
	
	/*
	 * waitForElementPresent(locator)
	 * Generated from isElementPresent(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the element is present, false otherwise
	 * Verifies that the specified element is somewhere on the page.
	 */
	public void waitForElementPresent(String locator) throws InterruptedException{
		
		for(int second = 0;; second++) {
			if (second >= TimeoutSecond) Assert.fail("Timeout - waitForElementPresent");
			try { if (selenium.isElementPresent(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}

	
	/*
	 * waitForElementNotPresent(locator)
	 * Generated from isElementPresent(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the element is present, false otherwise
	 * Verifies that the specified element is somewhere on the page.
	 */
	public void waitForElementNotPresent(String locator) throws InterruptedException{
		
		for(int second = 0;; second++) {
			if (second >= TimeoutSecond) Assert.fail("Timeout - waitForElementNotPresent");
			try { if (!selenium.isElementPresent(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	
	/*
	 * waitForVisible(locator)
	 * Generated from isVisible(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the element is present, false otherwise
	 * Determines if the specified element is visible. An element can be rendered invisible by 
	 * setting the CSS "visibility" property to "hidden", or the "display" property to "none", 
	 * either for the element itself or one if its ancestors. This method will fail if the element is not present.
	 */
	public void waitForVisible(String locator) throws InterruptedException{
		
		for (int second = 0;; second++) {
			if (second >= 60) Assert.fail("Timeout - waitForVisible");
			try { if (selenium.isVisible(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	
	/*
	 * waitForNotVisible(locator)
	 * Generated from isVisible(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the element is present, false otherwise
	 * Determines if the specified element is visible. An element can be rendered invisible by 
	 * setting the CSS "visibility" property to "hidden", or the "display" property to "none", 
	 * either for the element itself or one if its ancestors. This method will fail if the element is not present.
	 */
	public void waitForNotVisible(String locator) throws InterruptedException{
		
		for (int second = 0;; second++) {
			if (second >= 60) Assert.fail("Timeout - waitForNotVisible");
			try { if (!selenium.isVisible(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	
	/*
	 * waitForEditable(locator)
	 * Generated from isEditable(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the input element is editable, false otherwise
	 * Determines whether the specified input element is editable, it hasn't been disabled. 
	 * This method will fail if the specified element isn't an input element.
	 */
	public void waitForEditable(String locator) throws InterruptedException{
		
		for (int second = 0;; second++) {
			if (second >= 60) Assert.fail("Timeout - waitForEditable");
			try { if (selenium.isEditable(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	
	/*
	 * waitForNotEditable(locator)
	 * Generated from isEditable(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the input element is editable, false otherwise
	 * Determines whether the specified input element is editable, it hasn't been disabled. 
	 * This method will fail if the specified element isn't an input element.
	 */
	public void waitForNotEditable(String locator) throws InterruptedException{
		
		for (int second = 0;; second++) {
			if (second >= 60) Assert.fail("Timeout - waitForNotEditable");
			try { if (!selenium.isEditable(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	/*
	 * waitForTextPresent(locator)
	 * Generated from isTextPresent(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the text is present, false otherwise
	 * Verifies that the specified text is somewhere on the page.
	 */
	public void waitForTextPresent(String locator) throws InterruptedException{
		
		for(int second = 0;; second++) {
			if (second >= TimeoutSecond) Assert.fail("Timeout - waitForTextPresent");
			try { if (selenium.isTextPresent(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	/*
	 * waitForTextPresent(locator)
	 * Generated from isTextPresent(locator)
	 * Arguments: * locator - an element locator
	 * Returns: true if the text is not present, false otherwise
	 * Verifies that the specified text is somewhere on the page.
	 */
	public void waitForTextNotPresent(String locator) throws InterruptedException{
		
		for(int second = 0;; second++) {
			if (second >= TimeoutSecond) Assert.fail("Timeout - waitForTextPresent");
			try { if (!selenium.isTextPresent(locator)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	
	/*
	 * waitForVisible(WebElement)
	 * Generated from isVisible(WebElement)
	 * Arguments: * locator - an element locator
	 * Returns: true if the element is present, false otherwise
	 * Determines if the specified element is visible. An element can be rendered invisible by 
	 * setting the CSS "visibility" property to "hidden", or the "display" property to "none", 
	 * either for the element itself or one if its ancestors. This method will fail if the element is not present.
	 */
	public static void waitForVisible(WebElement element) throws InterruptedException{
		
		for (int second = 0;; second++) {
			if (second >= TimeoutSecond) Assert.fail("Timeout - waitForVisible");
			try { if (element.isDisplayed()) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
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
	
	
}
