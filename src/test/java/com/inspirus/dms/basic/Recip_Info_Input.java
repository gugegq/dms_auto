package com.inspirus.dms.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Recip_Info_Input {
	
	public void recip_info_page_input(WebDriver driver) throws Exception {
		
		ElementLocation my_element =  new ElementLocation();
		
		// Fill Recip Info Page
		driver.findElement(By.cssSelector(my_element.first_name)).clear();
		driver.findElement(By.cssSelector(my_element.first_name)).sendKeys("Dms_Recip_F");
		driver.findElement(By.cssSelector(my_element.last_name)).clear();
		driver.findElement(By.cssSelector(my_element.last_name)).sendKeys("Dms_Recip_L");
		new Select(driver.findElement(By.id(my_element.level_btn))).selectByVisibleText("05");
		driver.findElement(By.cssSelector(my_element.eid)).clear();
		driver.findElement(By.cssSelector(my_element.eid)).sendKeys("111111");
		new Select(driver.findElement(By.id(my_element.packetship_btn))).selectByVisibleText("HOME");
		new Select(driver.findElement(By.id(my_element.giftship_btn))).selectByVisibleText("HOME");
		new Select(driver.findElement(By.id(my_element.bill_location_btn))).selectByVisibleText("900001");
		driver.findElement(By.cssSelector(my_element.anniv_date)).clear();
		driver.findElement(By.cssSelector(my_element.anniv_date)).sendKeys("11/08/2018");
		driver.findElement(By.cssSelector(my_element.serv_date)).clear();
		driver.findElement(By.cssSelector(my_element.serv_date)).sendKeys("11/08/2018");
		driver.findElement(By.cssSelector(my_element.save_btn)).click();
		
	}

}
