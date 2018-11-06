package com.inspirus.dms.page.console.CreateEditSitePage.AutomationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inspirus.dms.basic.Browsers;

public class AutomationPage {
	
	//Constructor
	public AutomationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	/**
	 * unfinished as seldom used and so many webElement
	 */
	//Default Schedule
	//Admin Aggregate Email - enable check box
	@FindBy (id="chainedJobs.adminAggregateEmail.enableJob1")
	public WebElement enableAdminAggregateEmail;
	//Admin Aggregate Email
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[11]/span")
	public WebElement AdminAggregateEmail;
	//Award Code Generation check box
	public WebElement AWARD_CODE_GENERATION;
	//Eligibility User Upload check box
	public WebElement ELIGIBILITY_UPLOAD;
	
	//Birthday event - check box
	@FindBy (id="chainedJobs.birthdayEvent.enableJob1")
	public WebElement enableBirthdayEvent;	
	//Birthday event 
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[6]/span")
	public WebElement BirthdayEvent;
	//Birthday event schedule run button
	@FindBy (xpath="//div[@id='birthdayEventJobDiv']//a[@href='javascript:;']//span[contains(text(),'Run')]")
	public WebElement bdayRunBtn;
	
	//Special event - check box
	@FindBy (id="chainedJobs.specialEvent.enableJob1")
	public WebElement enableSpecialEvent;
	//Special event 
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[9]/span")
	public WebElement SpecialEvent;
	//Special Event - schedule run button
	@FindBy (xpath="//div[@id='specialEventJobDiv']//a[@href='javascript:;']//span[contains(text(),'Run')]")
	public WebElement specialEventRunBtn;
	
	//Service Anniversary
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[7]/span")
	public WebElement ServiceAnniversary;
	//Service Anniversary  - check box
	@FindBy (id="chainedJobs.serviceAnniversary.enableJob1")
	public WebElement enableServiceAnniversary;
	//Service Anniversary - schedule run button
	@FindBy (xpath="//div[@id='serviceAnniversaryJobDiv']//a[@href='javascript:;']//span[contains(text(),'Run')]")
	public WebElement serviceAnniversaryRunBtn;
	
	
	//Retirement Event
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[8]/span")
	public WebElement RetirementEvent;
	//Retirement - check box
	@FindBy (id="chainedJobs.retirement.enableJob1")
	public WebElement enableRetirementEvent;
	//Retirement - schedule run button
	@FindBy (xpath="//div[@id='retirementJobDiv']//a[@href='javascript:;']//span[contains(text(),'Run')]")
	public WebElement retirementRunBtn;
	
	//Nomination Approver Upload check box
	public WebElement NOMINATION_APPROVER_UPLOAD;
	
	//Nomination Workflow update - enable check box
	@FindBy (id="chainedJobs.nominationWorkflowUpdate.enableJob1")
	public WebElement enableNominationWorkFlow;
	//Nomination Workflow update
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[2]/span")
	public WebElement NominationWorkFlow;
	
	//Scheduled delivery
	@FindBy (id="chainedJobs.scheduleDelivery.enableJob1")
	public WebElement enableScheduleDelivery;
	//Scheduled delivery
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[4]/span")
	public WebElement scheduleDelivery;
	
	//User event - enable check box
	@FindBy (id="chainedJobs.userEvent.enableJob1")
	public WebElement enableUserEvent;
	//User event
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[10]/span")
	public WebElement UserEvent;
	//User event reminder
	public WebElement USER_EVENT_REMINDER;
	//Points Upload check box
	public WebElement POINT_UPLOAD;
	//Spot Budget Upload check box
	public WebElement SPOT_BUDGET_UPLOAD;
	//Spot Distribution check box
	public WebElement SPOT_DISTRIBUTION;
	//Manual User Upload check box
	public WebElement USER_UPLOAD;
	//Automated User Data Upload - check box
	@FindBy (id="chainedJobs.userDataRefresh.enableJob1")
	public WebElement enableUserDataRefresh;
	//Automated User Data Upload
	@FindBy (xpath="//div[@id='automationInfo']/table[1]/tbody/tr/td[2]/dl/dd[1]/span")
	public WebElement UserDataRefresh;
	//Winner Circle check box
	public WebElement WINNER_CIRCLE;
	//run Daily Automation Job Status button
	public WebElement RunDailyAutomationJobStatus;
	//run Eligibility User Batch button
	@FindBy(xpath="//div[@id='DAILY_AUTOMATION_JOBS_STATUS']/a")
	public WebElement RunEligibilityUserBatch;
	//Eligibility User Batch
	@FindBy(xpath="//div[@id='ELIGIBILITY_BATCH']/a")
	public WebElement runEligibilityBatch;
	//Monthly Statements check box
	public WebElement enableMonthlyStatement;
	//excludeOfficersDirectors1
	public WebElement excludeOfficersDirectors1;
	
	//save and cancel button
	public WebElement SaveSite;
	@FindBy(xpath="//fieldset/div[2]/button[2]")
	public WebElement Cancel;
	
	//open calendar
	@FindBy (css="span.add-on i.icon-calendar")
	public WebElement openCalendar;
	//calendar next month
	@FindBy (css="span.ui-icon.ui-icon-circle-triangle-e")
	public WebElement nextMonth;
	//complete select time
	@FindBy (css="button.ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
	public WebElement done;
	//Click run tutton
	@FindBy (linkText="Run")
	public WebElement Run;
	
	public void setRunAtTime(String jobName,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, AutomationPage.class);
//		driver.findElement(By.xpath("//div[@id='"+jobName+"JobDiv']/span/i")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='"+jobName+"JobDiv']/span/i")));
		this.nextMonth.click();
//		driver.findElement(By.linkText("1")).click();
		this.done.click();
		Thread.sleep(2000);
	}
	

}
