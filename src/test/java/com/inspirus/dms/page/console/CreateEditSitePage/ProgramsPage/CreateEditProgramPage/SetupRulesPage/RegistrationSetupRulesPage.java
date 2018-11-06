package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSetupRulesPage {
	
	//Constructor
	public RegistrationSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	// Award Type drop-down box
	public WebElement milestoneAwardType;
	//Add an Award Level button
	public WebElement addLevel;
	public WebElement submit;
	public WebElement cancel;
	//registration Start Date
	public WebElement registrationStartDate;
	//registration End Date
	public WebElement registrationEndDate;
	//Level Description input box
	public WebElement levelName;
	//Award In Dollars input box
	public WebElement dollarValue;

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
