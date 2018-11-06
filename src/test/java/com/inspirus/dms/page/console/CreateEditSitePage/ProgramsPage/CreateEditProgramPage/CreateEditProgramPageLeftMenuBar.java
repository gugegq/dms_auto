package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditProgramPageLeftMenuBar {
	
	//Constructor
	public CreateEditProgramPageLeftMenuBar(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Basic Info
	@FindBy(linkText="Basic Info")
	public WebElement BasicInfo;
	//Criteria
	@FindBy(linkText="Criteria")
	public WebElement Criteria;
	//Eligibility
	@FindBy(linkText="Eligibility")
	public WebElement Eligibility;
	//Budget
	@FindBy(linkText="Budget")
	public WebElement Budget;
	//Setup Rules
	@FindBy(linkText="Setup Rules")
	public WebElement SetupRules;
	//Activity Alert
	@FindBy(linkText="Activity Alert")
	public WebElement ActivityAlert;
	//Summary
	@FindBy(linkText="Summary")
	public WebElement Summary;
	//Administration
	@FindBy(linkText="Administration")
	public WebElement Administration;
	//Reminder Email Setup
	@FindBy(linkText="Reminder Email Setup")
	public WebElement ReminderEmailSetup;
	//Images
	@FindBy(linkText="Images")
	public WebElement Images;
	//Review Level Setup
	@FindBy(linkText="Review Level Setup")
	public WebElement ReviewLevelSetup;
	//Award Level Setup Setup
	@FindBy(linkText="Award Level Setup")
	public WebElement AwardLevelSetup;
	//Setup Scoring Setup
	@FindBy(linkText="Setup Scoring")
	public WebElement SetupScoring;
	//Event Eligibility
	@FindBy(linkText="Event Eligibility")
	public WebElement EventEligibility;
	//Select Approver
	@FindBy(linkText="Select Approver")
	public WebElement SelectApprover;
	//Form Setup link
	@FindBy(linkText="Form Setup")
	public WebElement FormSetupLink;	
	//Setup Rules link
	@FindBy(linkText="Setup Rules")
	public WebElement SetupRulesLink;	
	
}
