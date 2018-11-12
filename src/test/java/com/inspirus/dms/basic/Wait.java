package com.inspirus.dms.basic;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static WebElement waitForElementToBePresent(WebDriver driver, WebElement element, long waitTime) {
		try {
			return new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOf(element));
		} catch (StaleElementReferenceException e) {
			return new WebDriverWait(driver, waitTime * 5).until(ExpectedConditions.visibilityOf(element));
		}
	}

	public static void waitForElementToBePresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForTextToBePresent(WebDriver driver, WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));

	}

}
