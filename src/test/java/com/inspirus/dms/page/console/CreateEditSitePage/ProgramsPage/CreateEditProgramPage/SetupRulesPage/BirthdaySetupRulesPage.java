package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthdaySetupRulesPage {
	
	//Constructor
	public BirthdaySetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

//	//Notify Manager in advance
//	//The day of check box
//	public WebElement notifyManager;
//	//1 day check box
//	public WebElement notifyManager1Day;
//	//3 day check box
//	public WebElement notifyManager3Days;
//	//14 day check box
//	public WebElement notifyManager14Days;
	
	//Event Calendar switch
	@FindBy(css="span.switch_on")
	public WebElement calendarSwitch;
	//Program Go-live Date icon
	@FindBy(xpath="//div[@id='programStartDateControlGroup']/div/div[1]/span[1]")
	public WebElement goLiveDateIcon;
	//Date Picker Now button
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div[3]/button[1]")
	public WebElement datePickerNowBtn;
	
	//Message textarea
	public WebElement programRecognitionMessage;
	//insert a field drop-down button
	@FindBy(xpath="//form[@id='programLevelsForm']//div[2]/div/div/button[2]")
	public WebElement insertfield;
	//Spell check button
	@FindBy(xpath="//form[@id='programLevelsForm']//div[2]/div/div/button[3]")
	public WebElement spellcheck;
	//firstName insert link
	public WebElement firstName;
	//middleInitial insert link
	public WebElement middleInitial;
	//suffix insert link
	public WebElement suffix;
	//lastName insert link
	public WebElement lastName;
	//customerName insert link
	public WebElement customerName;
	//Select Program Image button
	@FindBy(xpath="//div[@id='recognitionCardImagesControlGroup']/div[1]/a[1]")
	public WebElement selectImage;
	//first image
	@FindBy(xpath="//div[@id='selectOffYearImageDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement programImage1st;
	//first program level image OK button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[1]")
	public WebElement programImageOk;
	//program level from user input box
	@FindBy(id="searchLevelFromUser_pro")
	public WebElement programLevelFromUser;
	
	//Add new message button
	public WebElement addNewMessageBtn;
	//Message Level Start Date icon
	@FindBy(xpath="//div[@id='levelStartDateControlGroup']/div/div/span[1]/i")
	public WebElement messageLevelStartDateIcon;
	//Message Name input box
	public WebElement messageName;
	//Message level recognition message inputbox
	@FindBy(id="recognitionMessage")
	public WebElement messageLevelRecognitionMessage;
	//Select Message Level Image button
	@FindBy(xpath="//div[@id='levelRecognitionCardImagesControlGroup']/div[1]/a[1]")
	public WebElement selectMessageLevelImageBtn;
	
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
