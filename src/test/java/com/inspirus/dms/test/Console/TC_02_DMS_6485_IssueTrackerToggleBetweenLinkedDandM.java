package com.inspirus.dms.test.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.inspirus.dms.basic.Browsers;
import com.inspirus.dms.basic.ComString;
import com.inspirus.dms.basic.DMS_Func;
import com.inspirus.dms.basic.pageElements;
import com.inspirus.dms.basic.WaitElement;
import com.inspirus.dms.basic.login.LoginDMS;

//DMS Issue Tracker Toggle between D# and M#
public class TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = Browsers.myDriver();
	}

	@Test
	public void Test_IssueTrackerBetweenDandM() throws Exception {

		// Initial my element
		pageElements element = new pageElements();
		WaitElement wt = new WaitElement();
		ComString cstr = new ComString();

		// Login into DMS Page
		new LoginDMS().login_dms(driver);
		Thread.sleep(1000 * 3);
		new DMS_Func().recipients_search(driver, cstr.recip_input);
		wt.waitForElementToBePresent(driver, driver.findElement(By.cssSelector(element.issue_tracker_btn)));
		// Click IssueTracker Button
		driver.findElement(By.cssSelector(element.issue_tracker_btn)).click();
		Thread.sleep(1000 * 10);

		// Operate in new Page
		// Switch to new page
		Set<String> winHandels = driver.getWindowHandles(); // 得到当前窗口的set集合
		System.out.print(winHandels.size());

		List it = new ArrayList(winHandels); // 将set集合存入list对象
		System.out.println(it.size());
		driver.switchTo().window((String) it.get(1)); // 切换到弹出的新窗口

		// Recip Information Page
		driver.findElement(By.id(element.recipientSelect)).click();
		Select actual = new Select(driver.findElement(By.id(element.recipientSelect)));

		List<WebElement> options = actual.getOptions();

		Set<String> optionSets = new HashSet<>();
		for (WebElement ele : options) {
			optionSets.add(ele.getText().trim());
		}
		
		System.out.println(optionSets);
		
		//Check the content in DropDown Menu
		Assert.assertTrue(optionSets.size() >= 2 && optionSets.contains(cstr.excepted_result_dms)
				&& optionSets.contains(cstr.excepted_result_cng), "Success");

		Thread.sleep(1000);
		driver.switchTo().window((String) it.get(0)); // 返回至原页面
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

}
