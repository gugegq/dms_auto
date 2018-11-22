/**
 * @author: create by Jason
 * @description: com.inspirus.dms.basic
 * @date:2018年11月22日
 */

package com.inspirus.dms.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLocateElement {
	

	//定位单个元素封装
	public WebElement findID(WebDriver driver, String id) throws Exception {
		
	    WebElement f=driver.findElement(By.id(id));
	    return f;
	}
	
	public WebElement findName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.name(name));
	    return f;
	}
	
	public WebElement findClassName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.className(name));
	    return f;
	}
	
	public WebElement findTagName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.id(name));
	    return f;
	}
	
	public WebElement findLinkText(WebDriver driver, String text) throws Exception {
		
	    WebElement f=driver.findElement(By.linkText(text));
	    return f;
	}
	
	public WebElement findPLinkText(WebDriver driver, String text) throws Exception {
		
	    WebElement f=driver.findElement(By.partialLinkText(text));
	    return f;
	}
	
	public WebElement findXpath(WebDriver driver, String xpath) throws Exception {
		
	    WebElement f=driver.findElement(By.xpath(xpath));
	    return f;
	}
	
	public WebElement findCss(WebDriver driver, String css) throws Exception {
		
	    WebElement f=driver.findElement(By.cssSelector(css));
	    return f;
	}


	//定位一组元素封装
	public WebElement findsID(WebDriver driver, String id) throws Exception {
		
	    WebElement f=driver.findElement(By.id(id));
	    return f;
	}
	
	public WebElement findsName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.name(name));
	    return f;
	}
	
	public WebElement findsClassName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.className(name));
	    return f;
	}
	
	public WebElement findsTagName(WebDriver driver, String name) throws Exception {
		
	    WebElement f=driver.findElement(By.id(name));
	    return f;
	}
	
	public WebElement findsLinkText(WebDriver driver, String text) throws Exception {
		
	    WebElement f=driver.findElement(By.linkText(text));
	    return f;
	}
	
	public WebElement findsPLinkText(WebDriver driver, String text) throws Exception {
		
	    WebElement f=driver.findElement(By.partialLinkText(text));
	    return f;
	}
	
	public WebElement findsXpath(WebDriver driver, String xpath) throws Exception {
		
	    WebElement f=driver.findElement(By.xpath(xpath));
	    return f;
	}
	
	public WebElement findsCss(WebDriver driver, String css) throws Exception {
		
	    WebElement f=driver.findElement(By.cssSelector(css));
	    return f;
	}

}