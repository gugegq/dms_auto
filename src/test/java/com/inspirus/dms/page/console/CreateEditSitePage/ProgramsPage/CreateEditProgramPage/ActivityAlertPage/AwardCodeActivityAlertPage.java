package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ActivityAlertPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardCodeActivityAlertPage {
	
	//Constructor
	public AwardCodeActivityAlertPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//activity Alerts enabled check box 0
	@FindBy(id="activityAlerts[0].enabled")
	public WebElement activityAlerts0enabled;
	//activity Alerts cashValue input box 0
	@FindBy(id="activityAlerts[0].cashValue")
	public WebElement activityAlerts0cashValue;
	//activity Alerts days input box 0
	@FindBy(id="activityAlerts[0].days")
	public WebElement activityAlerts0days;
	

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
