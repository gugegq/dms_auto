package com.inspirus.dms.page.console.CreateEditSitePage.ManageUsersPage.SiteEditUserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAdjustmentPage {
	
	//Constructor
	public AdminAdjustmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//left menu bar
	//User Details
	@FindBy(linkText="User Details")
	public WebElement UserDetails;
	//Admin Adjustment
	@FindBy(xpath="//div[3]/div[2]/div/div/ul/li[3]/a")
	public WebElement AdminAdjustment1;
	
	//Account input box
	public WebElement preferredFirstName;
	//Current Point Balance input box
	@FindBy(xpath="(//input[@id='balance'])[1]")
	public WebElement balance;
	//Current Tax Election check box
	public WebElement deductPoints;
	//Current Point Balance input box
	@FindBy(xpath="(//input[@id='balance'])[2]")
	public WebElement TaxElectionDate;
	
	//Make a Point Adjustment drop-down link
	@FindBy(linkText="Make a Point Adjustment")
	public WebElement MakePointAdjustment;
	//Transaction Type drop-down box
	public WebElement transactionType;
	//Mark as Refund Check Box
	public WebElement refundCheckBox;
	//Order id drop-dwon box
	public WebElement order;
	//points input box
	public WebElement points;
	//program drop-down box
	public WebElement program;
	//Tax drop-down box
	public WebElement adminTaxElectionType;
	//description textarea
	public WebElement description;
	//Submit button
	@FindBy(linkText="Submit")
	public WebElement Submit;
	
	//Transactions drop-down link
	@FindBy(linkText="Transactions")
	public WebElement Transactions;
	//Export button
	@FindBy(linkText="Export")
	public WebElement Export;
	//Return to Edit User button
	@FindBy(linkText="Return to Edit User")
	public WebElement ReturnEditUser;
}
