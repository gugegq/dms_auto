package com.inspirus.dms.page.console.CreateEditSitePage.GeneralInfoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInfoPage {
	
	//Constructor
	public GeneralInfoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Customer Name input box
	public WebElement name;
	//Site Alternate Name input box
	public WebElement alternateName;
	//customerNumber input box
	public WebElement customerNumber;
	//Dimensions Customer # input box
	public WebElement dmsCustomerNumber;
	//Account Type drop-down box
	public WebElement accountType;
	//status drop-down box
	public WebElement status;
	//goLiveDate input box
	public WebElement goLiveDate;
	//Point Value input box
	public WebElement conversionRate;
	//Assign "Points" Name input box
	public WebElement pointsName;
	//Site URL input box
	public WebElement siteURL;
	//URM URL input box
	public WebElement catalogURL;
	//Integrator Id input box
	public WebElement integratorId;
	//integratorPassword Id input box
	public WebElement integratorPassword;
	//Contact Name input box
	public WebElement contactName;
	//Email input box
	public WebElement contactEmail;
	// Email input error msg
	public WebElement contactEmailError;
	//Phone Number input box
	public WebElement contactPhone;
	//Contact Us Email input box
	public WebElement contactUsEmail;
	// Contact us Email input error msg
	public WebElement contactUsEmailError;
	//Contact Us Phone input box
	public WebElement contactUsPhone;
	//No Reply Email input box
	public WebElement noReplyEmail;
	// No reply Email input error msg
	public WebElement noReplyEmailError;
	//salesman drop-down box
	public WebElement salesman;
	// Account Manager Name drop-down box
	public WebElement accountManager;
	//save cancle button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	public WebElement SaveSite;	
}
