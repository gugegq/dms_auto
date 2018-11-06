package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NominationWithBudgetSetupRulesPage {
	
	//Constructor
	public NominationWithBudgetSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//E-Card Level Name input box
	@FindBy(id="nominationNoneWithReviewLabel")
	public WebElement ECardLevelName;
	
	//Nomination Points Type RANGE radio
	@FindBy(id="nominationLevels0.nomPointsType1")
	public WebElement RANGE_nominationPointsType;
	//Nomination Points Type DEFINED radio
	@FindBy(id="nominationLevels0.nomPointsType2")
	public WebElement DEFINED_nominationPointsType;
	//Nomination Level Name input box
	@FindBy(id="nominationLevels0.levelName")
	public WebElement nomLevelName;
	//Minimum value input box
	@FindBy(id="nominationLevels0.rangeStartDollarValue")
	public WebElement rangeStartDollarValue;
	//Maximum value input box
	@FindBy(id="nominationLevels0.rangeEndDollarValue")
	public WebElement rangeEndDollarValue;
	// Increments Of input box
	@FindBy(id="nominationLevels0.denomination")
	public WebElement rangeIncrement;
	
	//save cancel button
	@FindBy(id="saveExit")
	public WebElement saveExit;
	@FindBy(id="saveContinue")
	public WebElement saveContinue;
	
}
