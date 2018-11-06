package com.inspirus.dms.page.console.CreateEditSitePage.ManageUsersPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUsersPage {
	
	//Constructor
	public ManageUsersPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Upload Users
	@FindBy(linkText="Upload Users")
	public WebElement UploadUsers;
	//pipe Delimited file checkbox
	public WebElement pipeDelimited;
	//User Template Download button
	@FindBy(linkText="User Template Download")
	public WebElement UserTemplateDownload;
	//Add File button
	@FindBy(id="file-upload-input-")
	public WebElement AddFile;
	//Start Upload button
	@FindBy(linkText="Start Upload")
	public WebElement StartUpload;
	//Cancel button
	@FindBy(xpath="//fieldset/div/div[1]/div/div[2]/div/div/div[1]/div/button")
	public WebElement Cancel;
	//Cancel button after choosing a file
	@FindBy(xpath="//fieldset/div/div[1]/div/div[2]/div/div/div[3]/table/tbody/tr/td[5]/button")
	public WebElement Cancel2;
	
	//Search User link
	@FindBy(linkText="Search Users")
	public WebElement searchUserslink;
	//Filter By (Optional)
	@FindBy(linkText="Filter By (Optional)")
	public WebElement FilterByOptional;
	//User Attribute Filter 1 drop-down box
	public WebElement userAttributeFilter1;
	//userAttributeParams1 drop-down box
	public WebElement userAttributeParams1;
	//User Attribute Filter 2 drop-down box
	public WebElement userAttributeFilter2;
	//userAttributeParams2 drop-down box
	public WebElement userAttributeParams2;
	
	//User Type Filter
	//Officer/Director checkbox
	public WebElement officerDirector1;
	//Contractor checkbox
	public WebElement contractor1;
	//Part Time checkbox
	public WebElement partTime1;
	//International checkbox
	public WebElement international1;
	//Have opted out of recognition
	//birthdayOptOut1 checkbox
	public WebElement birthdayOptOut1;
	//User Role Filter
	//Administrator checkbox
	public WebElement admin1;
	//News Editor checkbox
	public WebElement contentAdmin1;
	//Program Coordinator checkbox
	public WebElement programAdmin1;
	//Manager checkbox
	public WebElement manager1;
	//Participant checkbox
	public WebElement participant;
	//Super Approver checkbox
	public WebElement superApprover1;
	//Committee Member checkbox
	public WebElement committeeMember1;
	
	//searchParam input box
	public WebElement searchParam;
	//Search button
	public WebElement searchUser;
	
}
