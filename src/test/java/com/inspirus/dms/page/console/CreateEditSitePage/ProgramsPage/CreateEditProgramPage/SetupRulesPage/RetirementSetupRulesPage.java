package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetirementSetupRulesPage {
	
	//Constructor
	public RetirementSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Award Type drop-down box
	public WebElement milestoneAwardType;
	//Create Award Levels button
	public WebElement create_award_levels_btn;
	
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
	
	//Program Certificate Images Select Image button
	@FindBy(xpath="//div[@id='PROGRAM_CERTIFICATE']/a")
	public WebElement CertificateSelectImage;
	//Program Certificate Images Select 1st Image
	@FindBy(xpath="//div[@id='selectOffYearCertificateDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement CertificateSelect1stImage;
	//Program Certificate Images Select 2nd Image
	@FindBy(xpath="//div[@id='selectOffYearCertificateDialog']/div[2]/div[1]/div[1]/input[2]")
	public WebElement CertificateSelect2ndImage;
	//Program Recognition Card Images Select Image button
	@FindBy(xpath="//div[@id='PROGRAM_ECARD']/a")
	public WebElement RecognitionCardSelectImage;
	//Program Recognition Card Images Select 1st Image
	@FindBy(xpath="//div[@id='selectOffYearImageDialog']/div[1]/div[1]/div[1]/input[2]")
	public WebElement RecognitionCardSelect1stImage;
	//Program Recognition Card Images Select 2nd Image
	@FindBy(xpath="//div[@id='selectOffYearImageDialog']/div[2]/div[1]/div[1]/input[2]")
	public WebElement RecognitionCardSelect2ndImage;
	//Submit button 
	@FindBy(xpath="//div[17]/div[11]/div/button[1]")
	public WebElement okbtn;
	//Cancel button
	@FindBy(xpath="//div[17]/div[11]/div/button[2]")
	public WebElement cancelbtn;
	
	//compact button
	public WebElement compactBtn;
	//full button
	public WebElement fullBtn;
	//Add an Award Level button
	@FindBy(linkText="Add an Award Level")
	public WebElement AddAwardLevel;
	//range Start Year
	public WebElement rangeStartYear;
	//range End Year
	public WebElement rangeEndYear;
	//min Dollars
	public WebElement minDollars;
	//max Dollars
	public WebElement maxDollars;
	//Award In Dollars
	public WebElement dollarValue;
	//Award Level Submit button 
	@FindBy(xpath="//div[17]/div[11]/div/button[1]")
	public WebElement submit;
	//Award Level Cancel button
	@FindBy(xpath="//div[17]/div[11]/div/button[2]")
	public WebElement cancel;
	//Program Certificate Text Insert Field drop arrow
	@FindBy(xpath="//div[@id='certificateTextDiv']/div[1]/button[2]")
	public WebElement programCertificateInsertFieldDrop;
	//Program Certificate Text Insert Field drop options
	@FindBy(xpath="//div[@id='certificateTextDiv']/div[1]/ul/li/a")
	public List<WebElement> programCertificateInsertFieldOptions;
	//Program Recognition Text Insert Field drop arrow
	@FindBy(xpath="//div[@id='recognitionTextDiv']/div[1]/button[2]")
	public WebElement programRecognitionInsertFieldDrop;
	//Program Recognition Text Insert Field drop options
	@FindBy(xpath="//div[@id='recognitionTextDiv']/div[1]/ul/li/a")
	public List<WebElement> programRecognitionInsertFieldOptions;
	
	//Award Level Field Gift Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[2]")
	public WebElement giftLabel;
	
	//Award Level Field Gift Checkbox
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[2]/input")
	public WebElement giftCheckbox;
	//Award Level 2 Field Gift Checkbox
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[4]/td[2]/input")
	public WebElement giftCheckbox2;
	
	//Award Level Field From Year Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[3]")
	public WebElement fromYearLabel;
	//Award Level Field None Type From Year Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[2]")
	public WebElement noneTypeFromYearLabel;
	
	//Award Level Field From Year Inputbox
	@FindBy(id="serviceLevels[0].rangeStartYear")
	public WebElement fromYearInputbox;
	//Award Level 2 Field From Year Inputbox
	@FindBy(id="serviceLevels[1].rangeStartYear")
	public WebElement fromYearInputbox2;
	
	//Award Level Field To Year Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[4]")
	public WebElement toYearLabel;
	//Award Level Field None Type To Year Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[3]")
	public WebElement noneTypeToYearLabel;
	
	//Award Level Field To Year Inputbox
	@FindBy(id="serviceLevels[0].rangeEndYear")
	public WebElement toYearInputbox;
	//Award Level 2 Field To Year Inputbox
	@FindBy(id="serviceLevels[1].rangeEndYear")
	public WebElement toYearInputbox2;
	
	//Award Level Field Description Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[5]")
	public WebElement descriptionLabel;
	//Award Level Field None Type Description Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr[1]/th[4]")
	public WebElement noneTypeDescriptionLabel;
	
	//Award Level Field Description Inputbox
	@FindBy(id="serviceLevels[0].name")
	public WebElement descriptionInputbox;
	//Award Level 2 Field Description Inputbox
	@FindBy(id="serviceLevels[1].name")
	public WebElement descriptionInputbox2;
	
	//Award Level Field Gift type award dollars range Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[7]")
	public WebElement giftRangeDollarsLabel;
	
	//Award Level Field min dollars Inputbox
	@FindBy(id="serviceLevels[0].minDollars")
	public WebElement minDollarInputbox;
	//Award Level 2 Field min dollars Inputbox
	@FindBy(id="serviceLevels[1].minDollars")
	public WebElement minDollarInputbox2;
	//Award Level Field max dollars Inputbox
	@FindBy(id="serviceLevels[0].maxDollars")
	public WebElement maxDollarInputbox;
	//Award Level 2 Field max dollars Inputbox
	@FindBy(id="serviceLevels[1].maxDollars")
	public WebElement maxDollarInputbox2;
	
	//Award Level Field Points type award dollars Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[6]")
	public WebElement awardInDollarsLabel;
	
	//Award Level Field award in dollars Inputbox
	@FindBy(id="serviceLevels[0].dollarValue")
	public WebElement awardInDollarsInputbox;
	//Award Level 2 Field award in dollars Inputbox
	@FindBy(id="serviceLevels[1].dollarValue")
	public WebElement awardInDollarsInputbox2;
	
	//Award Level Field Status Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[8]")
	public WebElement statusLabel;
	//Award Level Field None Type Status Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[7]")
	public WebElement noneTypestatusLabel;
	
	//Award Level Field Status drop list
	@FindBy(id="serviceLevels[0].status")
	public WebElement statusDrop;
	//Award Level 2 Field Status drop list
	@FindBy(id="serviceLevels[1].status")
	public WebElement statusDrop2;
	//Award Level 3 Field Status drop list
	@FindBy(id="serviceLevels[2].status")
	public WebElement statusDrop3;
	//Award Level 4 Field Status drop list
	@FindBy(id="serviceLevels[3].status")
	public WebElement statusDrop4;
	
	//Award Level 3 Field URM Activity drop list
	@FindBy(id="serviceLevels[2].activityType")
	public WebElement awardLevel3URMActivity;
	//Award Level 4 Field URM Activity drop list
	@FindBy(id="serviceLevels[3].activityType")
	public WebElement awardLevel4URMActivity;

	//Award Level Field Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[1]/td[11]/i")
	public WebElement deleteIcon;
	//Award Level Field Points Type Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[1]/td[10]/i")
	public WebElement pointsTypeDeleteIcon;
	//Award Level 2 Field Points Type Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[4]/td[10]/i")
	public WebElement pointsTypeDeleteIcon2;
	//Award Level Field None Type Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[1]/td[9]/i")
	public WebElement noneTypeDeleteIcon;
	//Award Level 2 Field None Type Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[4]/td[9]/i")
	public WebElement noneTypeDeleteIcon2;
	//Award Level 2 Field Delete icon
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[4]/td[11]/i")
	public WebElement deleteIcon2;
	
	//Confirm the level delete cancel button
	@FindBy(xpath="/html/body/div[18]/div[11]/div/button[2]")
	public WebElement levelDeleteCancel;
	
	//Award Level Field Program Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[11]")
	public WebElement programLabel;
	//Award Level Field Points Type Program Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[10]")
	public WebElement pointsTypeProgramLabel;
	//Award Level Field None Type Program Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[9]")
	public WebElement noneTypeProgramLabel;
	
	//Award Level Field Program Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[12]/div/input")
	public WebElement programRadioButton;
	//Award Level Field Points Type Program Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[11]/div/input")
	public WebElement pointsTypeProgramRadioButton;
	//Award Level Field None Type Program Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[10]/div/input")
	public WebElement noneTypeProgramRadioButton;
	//Award Level 2 Field None Type Program Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[4]/td[10]/div/input")
	public WebElement noneTypeProgramRadioButton2;
	
	//Award Level Field Custom Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[12]")
	public WebElement customLabel;
	//Award Level Field Points Type Custom Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[11]")
	public WebElement pointsTypeCustomLabel;
	//Award Level Field None Type Custom Label
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/thead/tr/th[10]")
	public WebElement noneTypeCustomLabel;
	
	//Award Level Field Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[13]/input")
	public WebElement customRadioButton;
	//Award Level Field Points Type Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[12]/input")
	public WebElement pointsTypeCustomRadioButton;
	//Award Level 2 Field Points Type Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[4]/td[12]/input")
	public WebElement pointsTypeCustomRadioButton2;
	//Award Level Field None Type Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[1]/td[11]/input")
	public WebElement noneTypeCustomRadioButton;
	//Award Level 2 Field None Type Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[4]/td[11]/input")
	public WebElement noneTypeCustomRadioButton2;
	//Award Level 2 Field Custom Radio Button
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[4]/td[13]/input")
	public WebElement customRadioButton2;
	
	//Award Level Insert Field drop arrow
	@FindBy(xpath="(//button[@type='button'])[11]")
	public WebElement insertFieldDrop;
	//Award Level Insert first name
	@FindBy(xpath="//div[@id='serviceLevelList']/div[1]/table/tbody/tr[2]/td[1]/div[1]/div[1]//div[1]/ul[1]/li[1]/a")
	public WebElement insertFirstnameDrop;
	//Award Level Insert middle initial
	@FindBy(xpath="//div[@id='serviceLevelList']/div[1]/table/tbody/tr[2]/td[1]/div[1]/div[1]//div[1]/ul[1]/li[2]/a")
	public WebElement insertMiddleinitialDrop;
	//Award Level Insert Suffix
	@FindBy(xpath="//div[@id='serviceLevelList']/div[1]/table/tbody/tr[2]/td[1]/div[1]/div[1]//div[1]/ul[1]/li[3]/a")
	public WebElement insertSuffixDrop;
	//Award Level Insert Lastname
	@FindBy(xpath="//div[@id='serviceLevelList']/div[1]/table/tbody/tr[2]/td[1]/div[1]/div[1]//div[1]/ul[1]/li[4]/a")
	public WebElement insertLastnameDrop;
	
	//Award Level Select Ecard
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[3]/td[4]/div/a")
	public WebElement awardlevelSelectEcardButton;
	//Award Level None Type Select Ecard
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[3]/td[3]/div/a")
	public WebElement noneTypeAwardlevelSelectEcardButton;
	//Award Level 2 Select Ecard
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[6]/td[4]/div/a")
	public WebElement awardlevelSelectEcardButton2;
	//Award Level 2 None Type Select Ecard
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[6]/td[3]/div/a")
	public WebElement noneTypeAwardlevelSelectEcardButton2;
	//Award Level 1st Ecard
	@FindBy(id="selectModalImg_168")
	public WebElement awardlevelFirstEcard;
	
	//Award Level Select Certificate
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[3]/td[7]/div/a")
	public WebElement awardlevelSelectCertificateButton;
	//Award Level None Type Select Certificate
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[3]/td[5]/div/a")
	public WebElement noneTypeAwardlevelSelectCertificateButton;
	//Award Level Select Certificate
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[6]/td[7]/div/a")
	public WebElement awardlevelSelectCertificateButton2;
	//Award Level 2 None Type Select Certificate
	@FindBy(xpath="//div[@id='serviceLevelList']/div/table/tbody/tr[6]/td[5]/div/a")
	public WebElement noneTypeAwardlevelSelectCertificateButton2;
	//Award Level 1st Certificate
	@FindBy(xpath="//div[@id='selectLevelCertificateDialog']/div[1]/img")
	public WebElement awardlevelFirstCertificate;
	
	//Award Level 2 Custom Certificate area
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td[1]/div[1]/div")
	public WebElement awardlevelCertificateArea2;
	//Award Level 2 Custom Certificate area insert field
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td[1]/div[1]/div/div/ul/li/a")
	public WebElement awardlevelCertificateArea2insertfield;
	//Award Level 2 Custom Ecard area
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td[1]/div[2]/div")
	public WebElement awardlevelEcardArea2;
	//Award Level 2 Custom Ecard area insert field
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td[1]/div[2]/div/div/ul/li/a")
	public WebElement awardlevelEcardArea2insertfield;
	
	//Award Level 2 Custom Certificate Textarea
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td/div[1]/div/textarea")
	public WebElement awardLevel2CustomCertificateTextarea;
	//Award Level 2 Custom Recognition Textarea
	@FindBy(xpath="//table[@id='levelDiv_']/tbody/tr[5]/td/div[2]/div/textarea")
	public WebElement awardLevel2CustomRecongitionTextarea;
	
	//Award Level URM Activity Confirmation Yes button - 1 first time
	@FindBy(xpath="/html/body/div[18]/div[11]/div/button")
	public WebElement awardLevelURMActivityYesButton;
	
	//Award Level URM Activity Confirmation Yes button - 2 first time
	@FindBy(xpath="/html/body/div[19]/div[11]/div/button")
	public WebElement awardLevelURMActivityYesButton2;
	
	//
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
