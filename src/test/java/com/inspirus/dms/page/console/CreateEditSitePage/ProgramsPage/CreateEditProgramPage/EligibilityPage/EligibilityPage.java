package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.EligibilityPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EligibilityPage {
	
	//Constructor
	public EligibilityPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//include in program eligibility
	//Enterprise radio
	public WebElement enterprise;
	//advanced Eligibility radio
	public WebElement advanced;
	//User Eligibility Status Inactive drop-down box
	public WebElement inactiveDaysAccess;
	//User Eligibility Status Retired drop-down box
	public WebElement retirementDaysAccess;
	//User Eligibility Status Terminated drop-down box
	public WebElement terminatedDaysAccess;
	
	
	//Group Rules
	//Group Include button
	public WebElement groupInclude;
	//Group Exclude button
	public WebElement groupExclude;
	//Group Send button
	public WebElement eligGroupSend;
	//Group Receive button
	public WebElement eligGroupReceive;
	//Rule Applies To drop-down box
	public WebElement eligUserType;
	//region drop-down box
	public WebElement region;
	//level drop-down box
	public WebElement level;
	//division drop-down box
	public WebElement division;
	//location drop-down box
	public WebElement location;
	//vbu1 drop-down box
	public WebElement vbu1;
	//vbu2 drop-down box
	public WebElement vbu2;
	//glCode drop-down box
	public WebElement glCode;
	//businessUnit drop-down box
	public WebElement businessUnit;
	//department drop-down box
	public WebElement department;
	//vbu3 drop-down box
	public WebElement vbu3;
	//Add Group Rule button
	@FindBy(linkText="Add Group Rule")
	public WebElement AddGroupRule;
	//Clear Fields button
	@FindBy(linkText="Clear Fields")
	public WebElement ClearFields;
	//CurrentGroups
	public WebElement CurrentGroups;
	//InProgressGroups
	public WebElement InProgressGroups;
	//Save Group Rules button
	@FindBy(linkText="Save Group Rules")
	public WebElement SaveGroupRules;
	//Delete All Group Rules button
	@FindBy(linkText="Delete All Group Rules")
	public WebElement DeleteAllGroupRules;
	
	//User Rules
	//pipe Delimited File check box
	public WebElement pipeDelimited;
	//Clear Fields button
	@FindBy(linkText="Eligibility Template")
	public WebElement EligibilityTemplate;
	//Clear Fields button
	@FindBy(linkText="Current Eligibility")
	public WebElement CurrentEligibility;
	//Clear Fields button
	@FindBy(id="file-upload-input-")
	public WebElement Addfiles;
	//Clear Fields button
	@FindBy(linkText="Start Upload")
	public WebElement StartUpload;
	//Cancel upload button
	@FindBy(xpath="//button[@type='reset']")
	public WebElement CancelUpload;
	//user Include button
	public WebElement include;
	//user Exclude button
	public WebElement exclude;
	//user Send button
	public WebElement userSend;
	//user Receive button
	public WebElement userReceive;
	//user Search Param input box
	public WebElement userSearchParam;
	//AddUser button
	@FindBy(linkText="Add User")
	public WebElement AddUser;
	//refresh list button
	public WebElement refreshEligibility;

	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
