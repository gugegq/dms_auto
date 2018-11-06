package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardCodeSetupRulesPage {
	
	//Constructor
	public AwardCodeSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Award code
	//maxAward Codes input box
	public WebElement maxAwardCodes;
	//day Limit For AwardCodes input box
	public WebElement dayLimitForAwardCodes;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
