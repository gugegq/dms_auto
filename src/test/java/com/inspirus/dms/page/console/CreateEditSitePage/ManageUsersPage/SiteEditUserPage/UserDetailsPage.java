package com.inspirus.dms.page.console.CreateEditSitePage.ManageUsersPage.SiteEditUserPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
	
	//Constructor
	public UserDetailsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//left menu bar
	//User Details
	@FindBy(linkText="User Details")
	public WebElement UserDetails;
	//Admin Adjustment
	@FindBy(linkText="Admin Adjustment")
	public WebElement AdminAdjustment;
	
	//Edit User Details
	@FindBy(linkText="Edit User Details")
	public WebElement EditUserDetails;
	//username input box
	public WebElement username;
	//newPassword input box
	public WebElement newPassword;
	//passwordConfirm input box
	public WebElement passwordConfirm;
	//passwordChangeReq check box
	public WebElement passwordChangeReq;
	//firstName input box
	public WebElement firstName;
	//lastName input box
	public WebElement lastName;
	//preferredFirstName input box
	public WebElement preferredFirstName;
	//email input box
	public WebElement email;
	//manageName input box
	public WebElement manageName;
	//jobTitle input box
	public WebElement jobTitle;
	//billToCode input box
	public WebElement billToCode;
	//birthDate input box
	public WebElement birthDate;
	
	//employeeId input box
	public WebElement employeeId;
	@FindBy(xpath="//fieldset/div/div[2]/div[2]/div/input")
	public WebElement HireDate;
	//retirementDate input box
	public WebElement retirementDate;
	//statusChangeDate input box
	public WebElement statusChangeDate;
	//userStatusType drop-down box
	public WebElement userStatusType;
	//registered check box
	public WebElement registered;
	//partTime check box
	public WebElement partTime;
	//contractor check box
	public WebElement contractor;
	//officerDirector check box
	public WebElement officerDirector;
	//international check box
	public WebElement international;
	//exemptFromSpotBudgetRestrictions check box
	public WebElement exemptFromSpotBudgetRestrictions;
	//Birthday Opt Out check box
	public WebElement birthdayOptOut;
	
	//Assigned Delegates 
	@FindBy(linkText="Assigned Delegates")
	public WebElement AssignedDelegates;
	//delegate User Search Input
	public WebElement delegateUserSearchInput;
	public WebElement delegateApproveNomination0;
	public WebElement delegateNomination0;
	public WebElement enableDelegateAccessReport0;
	@FindBy(xpath="//div[@class='userList']/table/tbody/tr/td/div/a")
	public WebElement delegateUserremove;
	
	//Program Coordinator for
	@FindBy(linkText="Program Coordinator for")
	public WebElement ProgramCoordinatorfor;
	//Committee Member
	@FindBy(linkText="Committee Member")
	public WebElement CommitteeMember;
	//Eligible Programs
	@FindBy(linkText="Eligible Programs")
	public WebElement EligiblePrograms;
	//User Attributes
	@FindBy(linkText="User Attributes")
	public WebElement UserAttributes;
	
	//Administrator checkbox
	public WebElement admin;
	//Program Coordinator checkbox
	@FindBy(xpath="//fieldset/div/div[2]/div/div/label[2]/input")
	public WebElement Programcoordinator;
	//News Editor checkbox
	public WebElement contentAdmin;
	//Manager checkbox
	public WebElement managerStatus1;
	//Participant checkbox
	@FindBy(xpath="//fieldset/div/div[2]/div/div/label[5]/input")
	public WebElement participant;
	//Super Approver checkbox
	@FindBy(xpath="//fieldset/div/div[2]/div/div/label[6]/input")
	public WebElement superApprover;
	//Committee Member checkbox
	@FindBy(xpath="//fieldset/div/div[2]/div/div/label[7]/input")
	public WebElement committeeMember;
	
	//User Attributes section
	//User Attributes labels
	@FindBy(xpath="//div[@id='ATTRIBUTE']/div/div/fieldset/div/div/table/tbody/tr/td[1]")
	public List<WebElement> userAttributesLabels;
	
	//Save Cancel button
	@FindBy(linkText="Save")
	public WebElement Save;
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
}
