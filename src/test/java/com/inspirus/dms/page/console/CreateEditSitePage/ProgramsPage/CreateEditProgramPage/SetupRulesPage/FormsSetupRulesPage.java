package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

//import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsSetupRulesPage {
	
	//Constructor
	public FormsSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Setup Rules link
	@FindBy(linkText="Setup Rules")
	public WebElement SetupRulesLink;		
	
	// Allow Self Submission checkbox
	@FindBy(id="allowSelfSubmission")
	//@FindBy(xpath="//input[@id='allowSelfSubmission']")
	public WebElement AllowSelfSubmission;
	
	// Self Submission Type dropdown
	@FindBy(xpath="//select[@id='selfSubmissionType']")
	//@FindBy(id="selfSubmissionType")
	public WebElement SelfSubmissionType;
	
	//Form Review Type dropdown
	//@FindBy(xpath="//select[@id='formReviewType']")
	@FindBy(id="formReviewType")
	public WebElement FormReviewType;
	
	//Choose an Approver dropdown
	//@FindBy(xpath="//select[@id='approverId']")
	@FindBy(id="approverId")
	public WebElement ChooseAnApprover;
	
	//Add Submission Period button
	@FindBy(id="btnAdd")
	public WebElement AddSubmissionPeriodBtn;	
	
	//Form Event Type dropdown
	//@FindBy(xpath="//select[@id='formsEventType']")
	@FindBy(id="formsEventType")
	public WebElement FormsEventType;
	
	//Allow Rollover Type dropdown
	//@FindBy(xpath="//select[@id='allowRolloverType']/option")
	@FindBy(id="allowRolloverType")
	public WebElement AllowRolloverType;
	
	//Period Close Type dropdown
	//@FindBy(xpath="//select[@id='periodCloseType']/option")
	@FindBy(id="periodCloseType")
	public WebElement PeriodCloseType;
	
	//Allow Multiple Awards Dropdown
	//@FindBy(xpath="//select[@id='allowMultipleAwards']/option")
	@FindBy(id="allowMultipleAwards")
	public WebElement AllowMultipleAwards;
	
	//Period Descirption
	public WebElement periodDescription(int nRow, WebDriver driver){
		 String pdpath="//div[@id='accordionSub']/div["+nRow+"]/div/div/div/textarea";
	     return driver.findElement(By.xpath(pdpath));
	}	
	// Period Delete button
	public WebElement periodDeleteBtn(int dRow, WebDriver driver){
		 String pdpath="//div[@id='accordionSub']/div["+dRow+"]/div/div/div/button";
	     return driver.findElement(By.xpath(pdpath));
	}
	// Period Chevron Icon
	public WebElement periodChevronIcon(int cRow, WebDriver driver){
		 String pdpath="//div[@id='accordionSub']/div["+cRow+"]/div/div/div/a/span";
	     return driver.findElement(By.xpath(pdpath));		
	}
	// Assign a Fomr
	public WebElement assignAForm(int aRow, WebDriver driver){
		 String pdpath="//div[@id='accordionSub']/div["+aRow+"]/div/div/div/select";
	     return driver.findElement(By.xpath(pdpath));			
	}
	//Sumbmision/Review Start/End date
	//* pRow: which is period number.
	//* whichDate: "S" & "R" . "S" is Submission Date; "R" is Review Date
	//* startOrEndDate: "start" & "end". "start" is Start Date; "end" is End Date
	//* For Example:  FormsSetupRulesPage.periodDates(1,"S","end",driver)
	//*               The Submission End date of the period 1
	//*For Example:  FormsSetupRulesPage.periodDates(2,"R","start",driver)
	//*               The Review Start date of the period 2
	public WebElement periodDates(int pRow,String whichDate,String startOrEndDate,WebDriver driver) {
		int nnrow;
		int col;
		if(whichDate.equals("S")){
			 nnrow=1;			
		}else{
			 nnrow=2;
		}
		if (startOrEndDate.equals("start")){
			col=1;
		}else {
			col=2;
		}
		String ppath ="//div[@id='accordionSub']/div["+pRow+"]/div/div/table["+nnrow+"]/tbody/tr/td["+col+"]/div/input";
		return driver.findElement(By.xpath(ppath));	
	}
	
	//Form Setup Validation message
	@FindBy(id="reviewSetupValidationMessage")
	public WebElement formSetupValidationMessage;
	
	//Form Setup Validation message
	@FindBy(id="submissionPeriodMessage")
	public WebElement SubmissionPeriodMessage;
	
	//Save and Exit button
	@FindBy(id="saveExit")
	public WebElement SaveAndExit;
	
	//Save and Continue button
	@FindBy(id="saveContinue")
	public WebElement SaveAndContinue;	
	
	//Cancel Button
	@FindBy(id="btn")
	public WebElement Cancel;
}



