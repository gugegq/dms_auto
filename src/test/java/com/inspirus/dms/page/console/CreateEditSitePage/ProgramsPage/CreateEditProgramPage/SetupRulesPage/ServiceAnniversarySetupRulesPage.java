package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceAnniversarySetupRulesPage {
	
	//Constructor
	public ServiceAnniversarySetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Award Type drop-down box
	public WebElement milestoneAwardType;
	//Create Award Levels button
	public WebElement create_award_levels_btn;
	
	//Per YOS Dollar Value input box
	public WebElement yDollar;
	//% Allowed Over / Under budget input box
	public WebElement yBudget;
	//oneYear checkbox
	public WebElement oneYear;
	//threeYears checkbox
	public WebElement threeYears;
	//fiveYears checkbox
	public WebElement fiveYears;
	//sevenYears checkbox
	public WebElement sevenYears;
	//tenYears checkbox
	public WebElement tenYears;
	//fifteenYears checkbox
	public WebElement fifteenYears;
	//twentyYears checkbox
	public WebElement twentyYears;
	//twentyFiveYears checkbox
	public WebElement twentyFiveYears;
	//thirtyYears checkbox
	public WebElement thirtyYears;
	//thirtyFiveYears checkbox
	public WebElement thirtyFiveYears;
	//fortyYears checkbox
	public WebElement fortyYears;
	//fortyFiveYears checkbox
	public WebElement fortyFiveYears;
	//fiftyYears checkbox
	public WebElement fiftyYears;
	//fiftyFiveYears checkbox
	public WebElement fiftyFiveYears;
	//sixtyYears checkbox
	public WebElement sixtyYears;
	//skip button
	public WebElement skip_btn;
	//submit button
	public WebElement ok_btn;
	//cancel button
	@FindBy(xpath="//button[@classname='btn']")
	public WebElement Cancel_btn;
	
	//catalog Code input box
	public WebElement catalogCode;
	//presentation Piece check box
	public WebElement presentationPiece;
	//Notify Manager
	//on the day of check box
	public WebElement notifyManger;
	//1 day check box
	public WebElement notifyManager1Day;
	//3 day check box
	public WebElement notifyManager3Days;
	//14 day check box
	public WebElement notifyManager14Days;
	//show/hide Certificate Text Link
	public WebElement showCertificateTextLink;
	//Program Certificate Text textarea
	public WebElement certificateText;
	//insert a field drop-down button
	@FindBy(xpath="//div[@id='certificateTextDiv']/div[1]/button[2]")
	public WebElement Certificateinsertfield;
	//Spell Check button
	@FindBy(xpath="//div[@id='certificateTextDiv']/a")
	public WebElement CertificateSpellCheck;
	//show/hide Recognition Text Link
	public WebElement showRecognitionTextLink;
	//Program recognition card Text textarea
	public WebElement recognitionText;
	//insert a field drop-down button
	@FindBy(xpath="//div[@id='recognitionTextDiv']/div[1]/button[2]")
	public WebElement Recognitioninsertfield;
	//Spell Check button
	@FindBy(xpath="//div[@id='recognitionTextDiv']/a")
	public WebElement RecognitionSpellCheck;
	
	//from User Search Param_p input box
	public WebElement fromUserSearchParam_p;
	//delete From User Icon_p
	public WebElement deleteFromUserIcon_p;
	
	//Certificate Images Select Image
	@FindBy(xpath="//div[@id='certificateControlGroup']/div/div/a")
	public WebElement CertificateSelectImage;
	//Certificate Images the 1st image checkbox
	@FindBy(xpath="//div[@id='selectOffYearCertificateDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement Certificate1stImage;
	//Recognition Card Images Select Image
	@FindBy(xpath="//div[@id='PROGRAM_ECARD']/a")
	public WebElement RecognitionCardSelectImage;
	//Recognition Card the 1st image checkbox
	@FindBy(xpath="//div[@id='selectOffYearImageDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement RecognitionCard1stImage;
	//Certificate Submit button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[1]")
	public WebElement okbtn;
	//Certificate Cancel button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[2]")
	public WebElement cancelbtn;
	//Ecard Submit button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[1]")
	public WebElement okbtn_ecard;
	//Ecard Cancel button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[2]")
	public WebElement cancelbtn_ecard;
	
	//compact button
	public WebElement compactBtn;
	//full button
	public WebElement fullBtn;
	//Points award level 1 Award In Dollars input box
	@FindBy(id="serviceLevels[0].dollarValue")
	public WebElement awardLevelOneDollars;
	//Points award level 2 Award In Dollars input box
	@FindBy(id="serviceLevels[1].dollarValue")
	public WebElement awardLevelTwoDollars;
	//Points award level 3 Award In Dollars input box
	@FindBy(id="serviceLevels[2].dollarValue")
	public WebElement awardLevelThreeDollars;
	//Points award level 4 Award In Dollars input box
	@FindBy(id="serviceLevels[3].dollarValue")
	public WebElement awardLevelFourDollars;
	//Add an Award Level button
	@FindBy(linkText="Add an Award Level")
	public WebElement AddAwardLevel;
	//Cancel an award level button
	public WebElement cancel;
	//Years Of Service input box
	public WebElement year;
	//Min Dollar Value input box
	public WebElement minDollars;
	//Max Dollar Value input box
	public WebElement maxDollars;
	
	//Off Year Options check box
	public WebElement SERVICE_OFFYEAR;
	//Off Year Award Type drop-down box
	public WebElement offYearAwardType;
	//Dollar Value per YOS input box
	public WebElement offYearDollarValue;
	//off Year Certificate Message hide / show button
	public WebElement offYearCertTextToggleBtn;
	//Off Year Certificate Message text area
	public WebElement offYearCertificateText;
	//off Year Award Message hide / show button
	public WebElement offYearAwardMsgToggleBtn;
	//Off Year Award Message text area
	public WebElement milestoneOffYearMessage;
	//off year from User Search input box
	public WebElement fromUserSearchParam_off;
	//delete From User Icon_off
	public WebElement deleteFromUserIcon_off;
	//Recognition Card Images Select
	@FindBy(xpath="//div[@id='OFFYEAR_IMAGE']/a")
	public WebElement offyearSelectImage;
	//Off Year Recognition Card the 1st image checkbox
	@FindBy(xpath="//div[@id='selectOffYearImageDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement offyearRecognitionCard1stImage;
	//Certificate Images Select
	@FindBy(xpath="//div[@id='OFFYEAR_CERTIFICATE']/a")
	public WebElement offyearSelectCertificate;
	//Off Year Certificate the 1st image checkbox
	@FindBy(xpath="//div[@id='selectOffYearCertificateDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement offyearCertificate1stImage;
	//Off Year Ecard Submit button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[1]")
	public WebElement offyearokbtn;
	//Off Year Ecard Cancel button
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[2]")
	public WebElement offyearcancelbtn;
	//Off Year Certificate Submit button
	@FindBy(xpath="/html/body/div[16]/div[11]/div/button[1]")
	public WebElement offyearokbtn_cert;
	//Off Year Certificate Submit button in TC6456
	@FindBy(xpath="/html/body/div[17]/div[11]/div/button[1]")
	public WebElement offyearokbtn_cert2;
	//Off Year Certificate Cancel button
	@FindBy(xpath="/html/body/div[16]/div[11]/div/button[2]")
	public WebElement offyearcancelbtn_cert;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
