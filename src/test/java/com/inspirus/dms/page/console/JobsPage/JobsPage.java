package com.inspirus.dms.page.console.JobsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {
	
	//Constructor
	public JobsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//View Job History
	public static WebElement jobHistory;
	//View Job Queue
	public static WebElement jobQueue;
	//Daily Job Schedule
	public static WebElement dailyQueue;
	
	//View Job History filter
	public static WebElement siteId;
	public static WebElement jobType;
	public static WebElement jobStatusType;
	public static WebElement startDate;
	public static WebElement endDate;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public static WebElement Submit;
	@FindBy(xpath="//button[@class='btn btn-info']")
	public static WebElement Reset;
}
