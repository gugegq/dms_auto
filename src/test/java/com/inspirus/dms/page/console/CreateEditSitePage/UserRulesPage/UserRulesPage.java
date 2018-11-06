package com.inspirus.dms.page.console.CreateEditSitePage.UserRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRulesPage {
	
	//Constructor
	public UserRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//All Users can enableEditPreferredName radio
	public WebElement enableEditPreferredName;
	//All Users can enableUserEmailChange radio
	public WebElement enableUserEmailChange;
	//All Users can enableTermsAndConditions radio
	public WebElement enableTermsAndConditions;
	//terms Conditions textarea
	public WebElement termsConditions;
	//All Users can enableImageUpload radio
	public WebElement enableImageUpload;
	//profile Image Terms Conditions textarea
	public WebElement profileImageTermsConditions;
	//User Level Billing Requirement enableBillToCodes radio
	public WebElement enableBillToCodes;
	//Allow access after a User's status has changed
	//Inactive drop-down box
	public WebElement inactiveDaysAccess;
	//Retired drop-down box
	public WebElement retirementDaysAccess;
	//Terminated drop-down box
	public WebElement terminatedDaysAccess;
	//Allow users to receive points (Uploads, Award codes) after status has changed 
	//Inactive radio
	public WebElement enableInactiveReceivePoints;
	//Retired radio
	public WebElement enableRetiredReceivePoints;
	//Terminated radio
	public WebElement enableTerminatedReceivePoints;
	//Allow users to share by
	//Facebook radio
	public WebElement allowShareByFacebook;
	//Twitter radio
	public WebElement allowShareByTwitter;
	//Linkedln radio
	public WebElement allowShareByLinkedln;
	//Google Plus radio
	public WebElement allowShareByGooglePlus;
	//Email radio
	public WebElement allowShareByEmail;
	//SSO Login Override 
	//Active radio
	public WebElement enableActiveSSOLoginOverride;
	//Inactive radio
	public WebElement enableInactiveSSOLoginOverride;
	//Retired radio
	public WebElement enableRetiredSSOLoginOverride;
	//Terminated radio
	public WebElement enableTerminatedSSOLoginOverride;
	//Role Based Rules Managers can
	//enableViewDirectReportRecognition radio
	public WebElement enableViewDirectReportRecognition;
	//enableNomiationAllLevels radio
	public WebElement enableNomiationAllLevels;
	//enableAutoApproveNomForDirectReport radio
	public WebElement enableAutoApproveNomForDirectReport;
	//enableAutoApprover radio
	public WebElement enableAutoApprover;
	//save cancle button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	public WebElement SaveSite;
}
