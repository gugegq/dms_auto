package com.inspirus.dms.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DMS_Func {
	
	// Initial my element
	pageElements element = new pageElements();
	WaitElement wt = new WaitElement();
	ComString cstr = new ComString();	
	
	//Recipients
	public void recipients_search(WebDriver driver, String recip_id) throws Exception {
		
		driver.findElement(By.cssSelector(element.recipients_btn)).click();
		// Input Recipient ID
		driver.findElement(By.cssSelector(element.recipients_input)).clear();
		driver.findElement(By.cssSelector(element.recipients_input)).sendKeys(recip_id);
		driver.findElement(By.cssSelector(element.recipients_input)).sendKeys(Keys.ENTER);
		
		//
		
	}
	
	//Customer
	public void customer_search(WebDriver driver, String customer_id) throws Exception {
		
		
		
	}
	
	public void products_search(WebDriver driver, String product_id) throws Exception {

		driver.findElement(By.cssSelector(element.products_btn)).click();
		// Input Products ID
		driver.findElement(By.cssSelector(element.products_input)).clear();
		driver.findElement(By.cssSelector(element.products_input)).sendKeys(product_id);
		driver.findElement(By.cssSelector(element.products_input)).sendKeys(Keys.ENTER);		
	}
	

}
