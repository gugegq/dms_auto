package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ActivityAlertPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NominationActivityAlertPage extends SpotActivityAlertPage {
	
	//Constructor
	public NominationActivityAlertPage(WebDriver driver){
		super(driver);
	}

	//activity Alerts enabled check box 3
	@FindBy(id="activityAlerts[3].enabled")
	public WebElement activityAlerts3enabled;

	//activity Alerts cashValue input box 3
	@FindBy(id="activityAlerts[3].cashValue")
	public WebElement activityAlerts3cashValue;

	//activity Alerts days input box 3
	@FindBy(id="activityAlerts[3].days")
	public WebElement activityAlerts3days;
}
