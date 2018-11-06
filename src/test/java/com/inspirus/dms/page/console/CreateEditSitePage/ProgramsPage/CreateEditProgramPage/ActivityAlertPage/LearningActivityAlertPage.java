package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ActivityAlertPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LearningActivityAlertPage {
	
	//Constructor
	public LearningActivityAlertPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="activityAlerts[0].enabled")
	public WebElement activityAlerts0enabled;
	@FindBy(id="activityAlerts[0].cashValue")
	public WebElement activityAlerts0cashValue;
	//activity Alerts days input box 0
	@FindBy(id="activityAlerts[0].days")
	public WebElement activityAlerts0days;
	
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
