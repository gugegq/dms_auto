package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupScoringPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetupScoringPage {
	
	//Constructor
	public SetupScoringPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//preview button
	public WebElement previewButton;
	//close button
	public WebElement close;
	//Add New Question button
	public WebElement addScoringQuestion;
	
	//instructions to the user or a question specific
	public WebElement scoringQuestion;
	//Review Level Assignment drop-down box
	public WebElement reviewLevel;
	//statusQuestion
	public WebElement statusQuestion;
	
	//Add Field button
	@FindBy(xpath="//div[@id='questionCriteria']/table/tbody/tr/td[3]/button")
	public WebElement AddField;
	//Criteria textarea 0
	public WebElement criterionInput0;
	//Delete button
	@FindBy(xpath="//div[@id='questionCriteria']/table/tbody/tr[2]/td[3]/button")
	public WebElement Delete;
	
	//includeComment check box
	public WebElement includeComment;
	//comment textarea
	public WebElement comment;
	//Spell Check
	@FindBy(linkText="Spell Check")
	public WebElement SpellCheck;
	
	//Add Scoring Question button
	public WebElement saveScoringQuestion;
	//close Scoring icon
	public WebElement closeScoring;

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
