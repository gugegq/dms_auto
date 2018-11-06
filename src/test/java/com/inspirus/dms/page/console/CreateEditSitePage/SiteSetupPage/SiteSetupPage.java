package com.inspirus.dms.page.console.CreateEditSitePage.SiteSetupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteSetupPage {
	
	//Constructor
	public SiteSetupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Time zone drop-down box
	public WebElement timezone;
	//Time out Interval drop-down box
	public WebElement timeoutInterval;
	//2 Step Activation radio
	public WebElement stepTwoActivation;
	//Change Frequency drop-down box
	public WebElement passwordChangeFrequency;
	//Max Security Attempts  drop-down box
	public WebElement passwordSecurityAttempts;
	//Minimum Length drop-down box
	public WebElement passwordMinimumLength;
	//Maximum Length drop-down box
	public WebElement passwordMaximumLength;
	//Upper Case Letter radio
	public WebElement passwordUppercaseRequired;
	//Lower Case Letter radio
	public WebElement passwordLowercaseRequired;
	//Number radio
	public WebElement passwordNumberRequired;
	//Special Character radio
	public WebElement passwordSpecialCharRequired;
	//Special Instructions textarea
	public WebElement passwordSpecialInstructions;
	//Auto Login Identification Key input box
	public WebElement autoLoginKey;
	//Enable radio
	public WebElement enableEmailSignature;
	
	//Enable SSO radio
	public WebElement enableSSO;
	//SSO Login URL input box
	public WebElement ssoLoginURL;
	//Customer SSO Login URL input box
	public WebElement customerSSOLoginURL;
	//Customer SSO Logout URL input box
	public WebElement customerSSOLogoutURL;
	//SSO Identity Provider input box
	public WebElement ssoIDP_URL;
	//SSO Service Provider input box
	public WebElement ssoSP_URL;
	//SSO Type drop-down box
	public WebElement ssoTypeSelect;
	
	//Enable Tax Deductions radio
	public WebElement enableTaxDeductions;
	//Add button for tax
	@FindBy(linkText="Add")
	public WebElement Add;
	//Country drop-down box
	public WebElement countryType;
	//Election drop-down box
	public WebElement taxElectionType;
	//Tax Withholding input box
	public WebElement taxGrossUpPercentage;
	//Message of tax Description textarea
	public WebElement taxDescription;
	//Spell Check button
	@FindBy(linkText="Spell Check")
	public WebElement SpellCheck;
	//save Tax Election button
	public WebElement saveTaxElection;
	//cancel Tax Election button
	public WebElement cancelTaxElection;
	
	// Who is allowed delegates drop-down box
	public WebElement delegateType;
	//Approve Recognition radio
	public WebElement enableDelegateApproveNomination;
	//Initiate Recognition on behalf of radio
	public WebElement enableDelegateNomination;
	//Can Access Reports  radio
	public WebElement enableDelegateAccessReport;
	//save cancle button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	public WebElement SaveSite;

}
