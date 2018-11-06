package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NominationSetupRulesPage {
	
	//Constructor
	public NominationSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Send E-Card Upon Nomination check box
	public WebElement sendEcardUponNomination;
	//E-Card Level Name input box
	@FindBy(id="nominationNoneWithReviewLabel")
	public WebElement ECardLevelName;
	//Add Nomination Level button
	@FindBy(linkText="Add Nomination Level")
	public WebElement AddNominationLevel;
	
	//Add Nomination Level
	//Nomination Points Type RANGE radio
	public WebElement RANGE_nominationPointsType;
	//Nomination Points Type DEFINED radio
	public WebElement DEFINED_nominationPointsType;
	//Level Name input box
	public WebElement nomLevelName;
	//Approval Type drop-down box
	public WebElement approvalLevelType;
	//Manager Can Approve "Initiated" Nominations for drop-down box
	public WebElement managerApprovalType;
	//Can Initiate drop-down box
	public WebElement initiateLevelType;
	
	//Minimum value input box
	public WebElement rangeStartDollarValue;
	//Maximum value input box
	public WebElement rangeEndDollarValue;
	// Increments Of input box
	public WebElement denomination;

	//Value 1 input box
	public WebElement levelOneDollarValue;
	//Value 1 Name input box
	public WebElement levelOneValueName;
	//Value 2 input box
	public WebElement levelTwoDollarValue;
	//Value 2 Name input box
	public WebElement levelTwoValueName;
	//Value 3 input box
	public WebElement levelThreeDollarValue;
	//Value 3 Name input box
	public WebElement levelThreeValueName;
	//Value 4 input box
	public WebElement levelFourDollarValue;
	//Value 4 Name input box
	public WebElement levelFourValueName;
	//Value 5 input box
	public WebElement levelFiveDollarValue;
	//Value 5 Name input box
	public WebElement levelFiveValueName;
	//control Unit  drop-down box
	public WebElement controlUnit;
	//control Unit  is equal to  drop-down box
	public WebElement controlUnitValue;

	//Add Nomination Level submit button
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']/button[@classname='btn btn-primary']")
	public WebElement submit;
	//Add Nomination Level cancel button
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']/button[@classname='btn']")
	public WebElement cancel;
	//Add Nomination Level window close icon
	@FindBy(xpath="//div/a/span[@class='ui-icon ui-icon-closethick']")
	public WebElement closeicon;

	
	/**
	 * after Adding Nomination
	 * nomination Levels 0  --》 start
	 */

	//Delete button
	@FindBy(xpath="//fieldset/div/section/div/div[1]/div[2]/a/i")
	public WebElement Delete0;
	
	//Nomination Points Type RANGE radio
	@FindBy(id="nominationLevels0.nomPointsType1")
	public WebElement RANGE0;
	//Nomination Points Type DEFINED radio
	@FindBy(id="nominationLevels0.nomPointsType2")
	public WebElement DEFINED0;
	//Level Name input box
	@FindBy(id="nominationLevels0.levelName")
	public WebElement LevelName0;
	//Approval Type drop-down box
	@FindBy(id="nominationLevels0.approvalLevelType")
	public WebElement ApprovalType0;
	//Manager Can Approve "Initiated" Nominations for drop-down box
	@FindBy(id="nominationLevels0.managerApprovalType")
	public WebElement managerApprovalType0;
	//Can Initiate drop-down box
	@FindBy(id="nominationLevels0.initiateLevelType")
	public WebElement CanInitiate0;
	
	//Minimum value input box
	@FindBy(id="nominationLevels0.rangeStartDollarValue")
	public WebElement Minimumvalue0;
	//Maximum value input box
	@FindBy(id="nominationLevels0.rangeEndDollarValue")
	public WebElement Maximumvalue0;
	// Increments Of input box
	@FindBy(id="nominationLevels0.denomination")
	public WebElement IncrementsOf0;
	
	//Value 1 input box
	@FindBy(id="nominationLevels0.levelOneDollarValue")
	public WebElement levelOneDollarValue0;
	//Value 1 Name input box
	@FindBy(id="nominationLevels0.levelOneValueName")
	public WebElement levelOneValueName0;
	//Value 2 input box
	@FindBy(id="nominationLevels0.levelTwoDollarValue")
	public WebElement levelTwoDollarValue0;
	//Value 2 Name input box
	@FindBy(id="nominationLevels0.levelTwoValueName")
	public WebElement levelTwoValueName0;
	//Value 3 input box
	@FindBy(id="nominationLevels0.levelThreeDollarValue")
	public WebElement levelThreeDollarValue0;
	//Value 3 Name input box
	@FindBy(id="nominationLevels0.levelThreeValueName")
	public WebElement levelThreeValueName0;
	//Value 4 input box
	@FindBy(id="nominationLevels0.levelFourDollarValue")
	public WebElement levelFourDollarValue0;
	//Value 4 Name input box
	@FindBy(id="nominationLevels0.levelFourValueName")
	public WebElement levelFourValueName0;
	//Value 5 input box
	@FindBy(id="nominationLevels0.levelFiveDollarValue")
	public WebElement levelFiveDollarValue0;
	//Value 5 Name input box
	@FindBy(id="nominationLevels0.levelFiveValueName")
	public WebElement levelFiveValueName0;
	//control Unit  drop-down box
	@FindBy(id="nominationLevels0.controlUnit")
	public WebElement controlUnit0;
	//control Unit  is equal to  drop-down box
	@FindBy(id="nominationLevels0_controlUnitValue")
	public WebElement controlUnitValue0;
	
	/**
	 * nomination Levels 0  end  <--
	 */
	
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
