package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.AdministrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardCodeAdministrationPage {
	//Constructor
	public AwardCodeAdministrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Award Code Lookup/Edit , Award Code Number input box
	public WebElement awardCodeNumber;//Spell check button
	//Search button
	@FindBy(xpath="//form[@id='awardCodeSearchForm']/div[2]/button")
	public WebElement search;
	//Award Code Status change button
	@FindBy(xpath="//div[@id='searchResults']/table/tbody/tr/td[6]/button")
	public WebElement AwardCodestatuschange;
	// Add Award Code Level button
	@FindBy(xpath="//div[2]/div[2]/button")
	public WebElement  AddAwardCodeLevel;
	

	//Bulk radio
	@FindBy(xpath="//form/div[1]/div[2]/div/label[1]/input[@value='BULK']")
	public WebElement  Bulk;
	//ByManager radio
	@FindBy(xpath="//form/div[1]/div[2]/div/label[2]/input[@value='MANAGER']")
	public WebElement  ByManager;
	//By Direct Reports radio
	@FindBy(xpath="//form/div[1]/div[2]/div/label[3]/input[@value='DIRECT_REPORT']")
	public WebElement  ByDirectReports;
	//Level Name input box
	public WebElement awardCodeLevelName;
	//Description textarea
	public WebElement awardCodeDescription;
	//Dollar Value per Code input box
	public WebElement dollarsPerCode;
	//stage 1Deposit Notification input box
	public WebElement stage1DepositNotification;
	//stage 2Deposit Notification input box
	public WebElement stage2DepositNotification;
	//stage 3Deposit Notification input box
	public WebElement stage3DepositNotification;
	//Add Level button
	public WebElement saveLevel;
	//close Add Award Code Level
	@FindBy(xpath="//div[@id='addAwardCodeLevelModal']/div/button")
	public WebElement close;
	//Generate Codes button
	public WebElement btn_gen_ac;
	
	//Delete one
	@FindBy(xpath="//div[@id='awardCodeLevels']/table[1]/tbody[1]/tr[1]/td[7]/button[1]")
	public WebElement Delete;
	//New Batch one
	@FindBy(xpath="//div[@id='awardCodeLevels']/table[1]/tbody[1]/tr[1]/td[7]/button[2]")
	public WebElement NewBatch;
	//Yes to Delete
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']/button[@type='button']")
	public WebElement Yestodelete;
	
	//Number of Award Codes input box
	public WebElement numberOfAwardCodes;
	//submit button
	@FindBy(xpath="//form[@id='addAwardCodeForm']/div[3]/button")
	public WebElement submit;
	//close icon
	@FindBy(xpath="//div[@id='addAwardCodeModal']/div[1]/button")
	public WebElement CloseNewBatch;
	
	//On/off confirmation box
	//Confirmation msg
	@FindBy(xpath="//div[@id='updateAwardStatusModal']/div[2]")
	public WebElement onOffMsg;
	//Yes button
	@FindBy(xpath="//div[@id='updateAwardStatusModal']/div[3]/a[1]")
	public WebElement onYesbtn;
	
	
	/**
	 * TC7641
	 */
	//level 1
	@FindBy(linkText="Level 1")
	public WebElement level1;
	//level 3
	@FindBy(linkText="Level 3")
	public WebElement level3;
}
