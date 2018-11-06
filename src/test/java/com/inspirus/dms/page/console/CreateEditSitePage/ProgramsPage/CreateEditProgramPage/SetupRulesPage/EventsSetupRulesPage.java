package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsSetupRulesPage {
	
	//Constructor
	public EventsSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Edit button
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr[1]/td[4]/a[1]")
	public WebElement Edit0;
	//Eligibility button
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr[1]/td[4]/a[2]")
	public WebElement Eligibility;
	//delete button
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr[1]/td[4]/a[3]/i")
	public WebElement delete;

	//Award Type drop-down box
	public WebElement milestoneAwardType;
	//Add a New Event button
	@FindBy(linkText="Add a New Event")
	public WebElement addNewEvent;
	//event Date input box
	public WebElement eventDate;
	//event Name input box
	public WebElement eventName;
	//catalog Code input box
	public WebElement catalogCode;
	//presentation Piece check box
	public WebElement presentationPiece;
	//Cancel button
	@FindBy(xpath="//div[@id='presentationPieceConfirmationModal']/div[3]/button[1]")
	public WebElement Cancelbtn;
	//Submit button
	@FindBy(xpath="//div[@id='presentationPieceConfirmationModal']/div[3]/button[2]")
	public WebElement Continuebtn;
	//processing Type drop-down box
	public WebElement processingType;
	//Dimensions Customer # input box
	public WebElement dmsCustomerNumber;
	//Program Code input box
	public WebElement dmsProgramCode;
	//award Level input box
	public WebElement awardLevel;
	//notify Manager in advance check box On the day of 
	public WebElement notifyManager;
	//Award In Dollars input box
	public WebElement dollarValue;
	//Minimum input box
	public WebElement minDollars;
	//Maximum input box
	public WebElement maxDollars;
	//Message textarea
	public WebElement customRecMessage;
	//Insert a field button
	@FindBy(xpath="//div[@id='newEventDiv']/fieldset[3]/div[2]/div/div/button[2]")
	public WebElement Insertafield;
	//Spell Check button
	@FindBy(xpath="//div[@id='newEventDiv']/fieldset[3]/div[2]/div/div/button[3]")
	public WebElement SpellCheck;
	
	//firstName
	public WebElement firstName;
	//middleInitial
	public WebElement middleInitial;
	//suffix
	public WebElement suffix;
	//lastName
	public WebElement lastName;
	//customerName
	public WebElement customerName;
	
	//from User Search Param input box
	public WebElement fromUserSearchParam;
	//delete From User Icon
	public WebElement deleteFromUserIcon;

	//Recognition Card Images Select Image
	@FindBy(xpath="//fieldset[4]/div[4]/div[1]/a[1]")
	public WebElement RecognitionSelectImage;
	//Upload Image
	@FindBy(xpath="//fieldset[4]/div[4]/div[1]/a[2]")
	public WebElement UploadImage;
	//Certificate Images Select Image
	@FindBy(xpath="//fieldset[4]/div[5]/div/a")
	public WebElement CertificateSelectImage;
	//ok button
	@FindBy(xpath="//div[16]/div[11]/div/button[1]")
	public WebElement okbtn;
	//Cancel button
	@FindBy(xpath="//div[16]/div[11]/div/button[2]")
	public WebElement cancelbtn;
	//Cancel button
	@FindBy(xpath="//div[16]/div[11]/div/button")
	public WebElement cancelbtn2;
	//image Type drop-down box
	public WebElement imageType;
	//image Category drop-down box
	public WebElement imageCategory;
	//Add files button
	@FindBy(id="file-upload-input-")
	public WebElement addFiles;
	//Start Upload button
	@FindBy(xpath="//div[@id='imageUploadDiv']/div/div[1]/div/a/span")
	public WebElement StartUpload;
	//Cancel All button
	@FindBy(xpath="//div[@id='imageUploadDiv']/div/div[1]/div/button")
	public WebElement CancelAll;
	
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
