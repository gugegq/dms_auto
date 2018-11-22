package com.inspirus.dms.basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

/**
* @author: Jason
* @version: Nov 21, 2018 10:18:31 AM
* Description: 
*/
public class SwitchWindow {
	
	public static void switchToWindow(String windowTitle, WebDriver driver) { 
		Set<String> windowHandles = driver.getWindowHandles(); //得到窗口句柄 
		for (String handler : windowHandles) { 
			driver.switchTo().window(handler); 
			String title = driver.getTitle(); 
			System.out.println(title);
			if (windowTitle.equals(title)) { 
				break; 
				} 
			} 
		}
}
