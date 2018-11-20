package com.inspirus.dms.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Recip_Info_Input {
	
	public void recip_info_page_input(WebDriver driver) throws Exception {
		
		ElementLocation my_element =  new ElementLocation();
		ComString cstr = new ComString();
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");//设置日期格式
		
		// Fill Recip Info Page
		driver.findElement(By.cssSelector(my_element.first_name)).clear();
		driver.findElement(By.cssSelector(my_element.first_name)).sendKeys(cstr.first_name);
		driver.findElement(By.cssSelector(my_element.last_name)).clear();
		driver.findElement(By.cssSelector(my_element.last_name)).sendKeys(cstr.last_name);
		new Select(driver.findElement(By.id(my_element.level_btn))).selectByVisibleText(cstr.level_year);
		driver.findElement(By.cssSelector(my_element.eid)).clear();
		driver.findElement(By.cssSelector(my_element.eid)).sendKeys(cstr.eid);
		new Select(driver.findElement(By.id(my_element.packetship_btn))).selectByVisibleText("Home");
		new Select(driver.findElement(By.id(my_element.giftship_btn))).selectByVisibleText("Home");
		new Select(driver.findElement(By.id(my_element.bill_location_btn))).selectByVisibleText("900001");
		driver.findElement(By.cssSelector(my_element.anniv_date)).clear();
		driver.findElement(By.cssSelector(my_element.anniv_date)).sendKeys(date.format(new Date()));
		driver.findElement(By.cssSelector(my_element.serv_date)).clear();
		driver.findElement(By.cssSelector(my_element.serv_date)).sendKeys(date.format(new Date()));
		driver.findElement(By.cssSelector(my_element.save_btn)).click();
		
	}

}
