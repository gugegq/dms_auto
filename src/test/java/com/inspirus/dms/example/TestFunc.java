package com.inspirus.dms.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestFunc {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
//		driver = Browsers.myDriver_Email();
	}
	
	@Test
	public void test_func() throws Exception {
		
		Date date = new Date();
		System.out.println(date.getDay()+"//"+date.getMonth()+"//"+date.getYear()+"\n");
		System.out.println(date.getDay()+"\n");
		System.out.println(date.getMonth()+"\n");
		System.out.println(date.getYear()+"\n");
		
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");//设置日期格式

        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println(df2.format(new Date()));// new Date()为获取当前系统时间

	}
	
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

}
