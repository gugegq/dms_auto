package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ActivityAlertPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotActivityAlertPage {
	
	//Constructor
	public SpotActivityAlertPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//activity Alerts enabled check box 0
	@FindBy(id="activityAlerts[0].enabled")
	public WebElement activityAlerts0enabled;
	//activity Alerts enabled check box 1
	@FindBy(id="activityAlerts[1].enabled")
	public WebElement activityAlerts1enabled;
	//activity Alerts enabled check box 2
	@FindBy(id="activityAlerts[2].enabled")
	public WebElement activityAlerts2enabled;
	
	//activity Alerts activity Quantity input box 0
	@FindBy(id="activityAlerts[0].activityQuantity")
	public WebElement activityAlerts0activityQuantity;
	//activity Alerts activity Quantity input box 1
	@FindBy(id="activityAlerts[1].activityQuantity")
	public WebElement activityAlerts1activityQuantity;
	//activity Alerts cashValue input box 2
	@FindBy(id="activityAlerts[2].cashValue")
	public WebElement activityAlerts2cashValue;
	
	//activity Alerts days input box 0
	@FindBy(id="activityAlerts[0].days")
	public WebElement activityAlerts0days;
	//activity Alerts days input box 1
	@FindBy(id="activityAlerts[1].days")
	public WebElement activityAlerts1days;
	//activity Alerts days input box 2
	@FindBy(id="activityAlerts[2].days")
	public WebElement activityAlerts2days;
	

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
